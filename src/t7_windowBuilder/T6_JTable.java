package t7_windowBuilder;

import javax.swing.*;
import javax.swing.table.*;

import t8_insa.*;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
public class T6_JTable extends JFrame {
	private JTable table;
	private Vector title, vData;
	private DefaultTableModel dtm;
	private JScrollPane scrollPane;

	InsaDAO dao = new InsaDAO();
	// 제너릭 안되기 때문에 Vector<E> 이렇게 불가함 <E> 빼야함

	public T6_JTable() {
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
		title.add("성명");
		title.add("나이");
		title.add("성별");
		title.add("입사일");

		// 2. '데이터'를 Vector타입으로 준비. 데이터는 DB에서 가져온다
		vData = dao.getInsaList("","");

		// 3. DB에서 가져온 자료(vData)와 타이틀(title)을 DefaultTableModel 객체를 생성하면서 담아준다
		dtm = new DefaultTableModel(vData, title);

		// 4. DefaultTableModel에 담긴 벡터 타입의 '데이터/타이틀'을 JTable 객체 생성 시에 담아준다.
		table = new JTable(dtm);

		// 5. 자료가 담긴 JTable을 JScrollPane 객체 생성 시에 함께 담아서 생성해 준다.
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 10, 436, 131);
		panel2.add(scrollPane);

		// 6. 출력 결과를 확인한다.

		// ------위는 UI / 아래는 메소드-------------------

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
		new T6_JTable();
	}
}
