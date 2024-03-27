package t7_windowBuilder;

import javax.swing.*;
import javax.swing.table.*;

import t8_insa.*;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
public class T7_JTable extends JFrame {
	private JTable table;
	private Vector title, vData;
	private DefaultTableModel dtm;
	private JScrollPane scrollPane;

	InsaDAO dao = new InsaDAO();
	// 제너릭 안되기 때문에 Vector<E> 이렇게 불가함 <E> 빼야함

	public T7_JTable() {
		super("JTable 연습");
		setSize(500, 300);

		// -------------------------------------------------------------
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		// -------------------------------------------------------------

		JPanel panel1 = new JPanel();
		panel1.setBounds(12, 10, 460, 40);
		getContentPane().add(panel1);
		panel1.setLayout(null);

		JButton btnPrint = new JButton("선택셀값출력");
		btnPrint.setFont(new Font("돋움체", Font.PLAIN, 10));
		btnPrint.setBounds(12, 10, 97, 23);
		panel1.add(btnPrint);

		JButton btnExit = new JButton("종 료");

		btnExit.setFont(new Font("돋움체", Font.PLAIN, 15));
		btnExit.setBounds(351, 10, 97, 23);
		panel1.add(btnExit);

		JPanel panel2 = new JPanel();
		panel2.setBounds(12, 60, 460, 141);
		getContentPane().add(panel2);
		panel2.setLayout(null);

//		table = new JTable();
//		scrollPane.setViewportView(table);

		JPanel panel3 = new JPanel();
		panel3.setBounds(12, 211, 460, 40);
		getContentPane().add(panel3);
		panel3.setLayout(null);

		JLabel lblMessage = new JLabel("JTable에서 선택된 값을 출력합니다.");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(0, 0, 460, 40);
		panel3.add(lblMessage);

		// *아래로 Jtable 설계하기*
		// JTable 제작 시는 '부제목' 과 '데이터'를 설계하여 Vector 타입으로 준비한다.

		// 1. '부제목'을 Vector에 저장
		title = new Vector<>(); // 제너릭 안되니까 꺽새안에 아무것도 넣지 않거나 꺽새아예지우기
		title.add("번호");
		title.add("이름");
		title.add("나이");
		title.add("성별");
		title.add("입사일");

		// 2. '데이터'를 Vector타입으로 준비. 데이터는 DB에서 가져온다
		vData = dao.getInsaList("","");

		// 3. DB에서 가져온 자료(vData)와 타이틀(title)을 DefaultTableModel 객체를 생성하면서 담아준다
		dtm = new DefaultTableModel(vData, title);

		// 4. DefaultTableModel에 담긴 벡터 타입의 '데이터/타이틀'을 JTable 객체 생성 시에 담아준다.
		table = new JTable(dtm);
		
		// 테이블의 내용을 행(타이틀) 이름으로 정렬(오름차순/내림차순) 하고자 한다면?
		table.setRowSorter(new TableRowSorter<>(dtm));

		// 5. 자료가 담긴 JTable을 JScrollPane 객체 생성 시에 함께 담아서 생성해 준다.
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 10, 436, 131);
		panel2.add(scrollPane);

		// 6. 출력 결과를 확인한다.

		/*
		 * 7. JTable 속성 제어하기 table의 컬럼 크기 설정 / 크기 고정 / 헤더 이동 고정
		 */
		table.getColumnModel().getColumn(0).setMaxWidth(50);
		table.getColumnModel().getColumn(2).setMaxWidth(50);
		table.getColumnModel().getColumn(3).setMaxWidth(60);

		// 모든 셀의 크기를 고정하려면 for문 쓰면됨. jtable 여러개 사용 예정이라면 메소드 만들자
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);

		table.getTableHeader().setReorderingAllowed(false);

		// 테이블 셀 안의 내용 수평 정렬하기
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
//		tcm.getColumn(3).setCellRenderer(dtcr);		

		// 전체셀 가운데 정렬
		for (int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr);
		}

		// ------위는 UI / 아래는 메소드-------------------

		// 테이블에서 선택된 셀의 레코드(행)를 출력하기
		btnPrint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				int column = table.getSelectedColumn();
//				if (row < 0) {
//					JOptionPane.showMessageDialog(null, "행을 선택 후 버튼을 눌러주세요");
//				} else {
//					JOptionPane.showMessageDialog(null, "선택된 인덱스 행 번호 : " + row + ", 열번호 : " + column);
//				}

				if (row != -1) {
//					System.out.println("선택된 내용 : " + table.getValueAt(row, column));
//					lblMessage.setText("선택된 내용 : " + table.getValueAt(row, column));
					// 선택된 행의 모든 정보를 메시치 창에 띄우시오.
					// 1. 원하는 곳 선택했을 때 그 행에 해당하는 0,1,2,3,4열 한번에 출력하는 방법
					// 2. 아무곳이나 클릭해도 0번,1번 열에는 중복되지 않은 키니까 그거를 디비에 보내서 있으면 출력
					// idx, name
					
					InsaVO vo = dao.getNameSearch(table.getValueAt(row, 1) + "");
					String temp = "성명 : " + vo.getName() + ", 나이 : " + vo.getAge() + ", 성별 : " + vo.getGender() + ", 입사일 : " + vo.getIpsail().substring(0, 10);
					System.out.println(temp);
					JOptionPane.showMessageDialog(null, temp);
 	
					
					
				} 
			}
		});

		// 종료 버튼 마우스 클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// ----------------------------
		setVisible(true);
		// ----------------------------
	}

	public static void main(String[] args) {
		new T7_JTable();
	}
}
