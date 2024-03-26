package t8_insa;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InsaMain extends JFrame {
	private JButton btnInput, btnSearch, btnList, btnExit;

	public InsaMain() {
		super("인사관리 메뉴");
		setSize(800, 600);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 78);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("인사관리프로그램");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 760, 58);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 80, 784, 384);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(InsaMain.class.getResource("/t8_insa/images/2.jpg")));
		lblNewLabel_1.setBounds(12, 10, 760, 364);
		pn2.add(lblNewLabel_1);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 471, 784, 90);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnInput = new JButton("사원등록");
		
		btnInput.setFont(new Font("굴림", Font.PLAIN, 20));
		btnInput.setBounds(21, 10, 169, 70);
		pn3.add(btnInput);
		
		btnSearch = new JButton("개별조회");
		
		btnSearch.setFont(new Font("굴림", Font.PLAIN, 20));
		btnSearch.setBounds(211, 10, 169, 70);
		pn3.add(btnSearch);
		
		btnList = new JButton("전체조회");
		
		btnList.setFont(new Font("굴림", Font.PLAIN, 20));
		btnList.setBounds(401, 10, 169, 70);
		pn3.add(btnList);
		
		btnExit = new JButton("종료");
	
		btnExit.setFont(new Font("굴림", Font.PLAIN, 20));
		btnExit.setBounds(591, 10, 169, 70);
		pn3.add(btnExit);
		
		//-------------------------------------------------
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//-------------------------------------------------
		
		
		// 사원등록 버튼 메소드
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // jvm은 안닫히고 현재 창만 닫히는
				new InsaInput(); // insainput 클래스가 열리게됨
			}
		});
		
		// 개별조회 버튼 메소드
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("검색할 이름을 입력하세요");
				InsaDAO dao = new InsaDAO();
				InsaVO vo = dao.getNameSearch(name);
				
				if (vo.getName() == null) {
					JOptionPane.showMessageDialog(null, "검색한 회원이 없습니다.");
				} else {
					dispose();
					new InsaSearch(vo);					
				}			
			}
		});
		
		// 전체조회 버튼 메소드
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// 종료 버튼 메소드
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new InsaMain();
	}
}
