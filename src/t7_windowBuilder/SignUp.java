package t7_windowBuilder;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class SignUp extends JFrame {
	private JTextField txtMid;
	private JTextField txtPassword;
	private JTextField txtName;
	private JTextField txtPhoneNum;
	private JTextField txtBirth;

	public SignUp() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setTitle("SignUp");
		setBounds(100, 100, 454, 667);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 255, 255));
		panel1.setBounds(12, 10, 416, 37);
		getContentPane().add(panel1);
		panel1.setLayout(null);

		JLabel lblTitle = new JLabel("Create Account");
		lblTitle.setBounds(79, 10, 257, 27);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		panel1.add(lblTitle);

		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255, 255, 255));
		panel2.setBounds(12, 56, 416, 432);
		getContentPane().add(panel2);
		panel2.setLayout(null);

		// 통신사 선택 콤보 박스 디자인
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		comboBox.setForeground(new Color(169, 169, 169));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(42, 267, 332, 37);
		panel2.add(comboBox);

		// 통신사 항목 추가
		comboBox.addItem("통신사를 선택해 주세요."); // 초기 안내 메시지
		comboBox.addItem("SKT");
		comboBox.addItem("KT");
		comboBox.addItem("LG U+");
		comboBox.addItem("SKT 알뜰폰");
		comboBox.addItem("KT 알뜰폰");
		comboBox.addItem("LG U+ 알뜰폰");

		panel2.add(comboBox);

		txtMid = new JTextField();
		txtMid.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		txtMid.setBounds(42, 40, 332, 37);
		panel2.add(txtMid);
		txtMid.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		txtPassword.setBounds(42, 113, 332, 37);
		txtPassword.setForeground(new Color(0, 0, 0));
		txtPassword.setColumns(10);
		panel2.add(txtPassword);

		txtName = new JTextField();
		txtName.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		txtName.setBounds(42, 190, 150, 37);
		txtName.setColumns(10);
		panel2.add(txtName);

		// 성별(남자) 라디오 버튼 디자인
		JRadioButton rdbtnMen = new JRadioButton("남자");
		rdbtnMen.setBackground(new Color(255, 255, 255));
		rdbtnMen.setBounds(41, 326, 57, 23);
		rdbtnMen.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnMen.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel2.add(rdbtnMen);

		// 성별(여자) 라디오 버튼 디자인
		JRadioButton rdbtnWomen = new JRadioButton("여자");
		rdbtnWomen.setBackground(new Color(255, 255, 255));
		rdbtnWomen.setBounds(104, 326, 57, 23);
		rdbtnWomen.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnWomen.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel2.add(rdbtnWomen);

		// 성별 버튼 그룹
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(rdbtnMen);
		genderGroup.add(rdbtnWomen);

		panel2.add(rdbtnMen);
		panel2.add(rdbtnWomen);

		// 국적(내국인) 라디오 버튼 디자인
		JRadioButton rdbtnResident = new JRadioButton("내국인");
		rdbtnResident.setBackground(new Color(255, 255, 255));
		rdbtnResident.setBounds(236, 326, 61, 23);
		rdbtnResident.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnResident.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel2.add(rdbtnResident);

		// 국적(외국인) 라디오 버튼 디자인
		JRadioButton rdbtnForeigner = new JRadioButton("외국인");
		rdbtnForeigner.setBackground(new Color(255, 255, 255));
		rdbtnForeigner.setBounds(304, 326, 70, 23);
		rdbtnForeigner.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnForeigner.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel2.add(rdbtnForeigner);

		// 국적 버튼 그룹
		ButtonGroup nationalityGroup = new ButtonGroup();
		nationalityGroup.add(rdbtnResident);
		nationalityGroup.add(rdbtnForeigner);

		panel2.add(rdbtnResident);
		panel2.add(rdbtnForeigner);

		txtPhoneNum = new JTextField();
		txtPhoneNum.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		txtPhoneNum.setBounds(42, 395, 332, 37);
		txtPhoneNum.setColumns(10);
		panel2.add(txtPhoneNum);

		JLabel lblBirth = new JLabel("생년월일");
		lblBirth.setBounds(224, 160, 90, 20);
		lblBirth.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel2.add(lblBirth);

		JLabel lblTelecom = new JLabel("통신사 선택");
		lblTelecom.setBounds(42, 237, 74, 20);
		lblTelecom.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelecom.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel2.add(lblTelecom);

		JLabel lblPhoneNum = new JLabel("휴대전화번호");
		lblPhoneNum.setBounds(42, 365, 74, 20);
		lblPhoneNum.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNum.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel2.add(lblPhoneNum);

		JLabel lblName = new JLabel("이름");
		lblName.setBounds(42, 160, 56, 20);
		lblName.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel2.add(lblName);

		JLabel lblMId = new JLabel("아이디");
		lblMId.setBounds(42, 10, 56, 20);
		lblMId.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel2.add(lblMId);

		JLabel lblPassword = new JLabel("비밀번호");
		lblPassword.setBounds(42, 83, 56, 20);
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel2.add(lblPassword);

		txtBirth = new JTextField();
		txtBirth.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		txtBirth.setColumns(10);
		txtBirth.setBounds(224, 190, 150, 37);
		panel2.add(txtBirth);

		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(255, 255, 255));
		panel3.setBounds(12, 498, 416, 53);
		getContentPane().add(panel3);
		panel3.setLayout(null);

		// Sing Up 버튼 디자인
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBackground(new Color(240, 248, 255));
		btnSignUp.setBounds(150, 6, 115, 41);
		panel3.add(btnSignUp);
		btnSignUp.setFont(new Font("Century Gothic", Font.BOLD, 16));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(12, 561, 416, 59);
		getContentPane().add(panel);
		panel.setLayout(null);

		// Reset 버튼 디자인
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(240, 248, 255));
		btnReset.setBounds(77, 0, 92, 32);
		panel.add(btnReset);
		btnReset.setFont(new Font("Century Gothic", Font.BOLD, 15));

		// Exit 버튼 디자인
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(240, 248, 255));
		btnExit.setBounds(246, 0, 92, 32);
		panel.add(btnExit);
		btnExit.setFont(new Font("Century Gothic", Font.BOLD, 15));

		setVisible(true);

		// Sign Up 버튼 메소드
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		// Exit 버튼 메소드
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "회원가입을 종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if (answer == 0) {
					System.exit(0);
				}
			}
		});

		// Reset 버튼 메소드
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMid.setText("");
				txtPassword.setText("");
				txtName.setText("");
				txtBirth.setText("");
				txtPhoneNum.setText("");
				txtMid.requestFocus(); // 리셋 시 아이디에 커서 포커스
			}
		});

		// 통신사 선택 콤보 박스 메소드
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() != 0) {
					// 사용자가 안내 메시지를 선택했을 때 아무 처리 X
				} else {
					// 안내 메시지 외 6개의 통신사 중 택1 시, 안내 메시지 항목 제거
					comboBox.removeItem(0);
				}
			}
		});

	}

	public static void main(String[] args) {
		new SignUp();
	}
}
