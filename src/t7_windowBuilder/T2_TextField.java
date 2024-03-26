package t7_windowBuilder;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.util.regex.*;
import java.awt.event.ActionEvent;

public class T2_TextField extends JFrame {
	private JTextField txtName, txtMid, txtAge;
	private JButton btnReset, btnSubmit, btnExit;
	private JPasswordField txtPwd;

	private String rexAge = "^[0-9]+$";

	public T2_TextField() {
		super("회원가입");
		setSize(600, 480);
		getContentPane().setLayout(null);
		

		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 560, 55);
		getContentPane().add(pn1);
		pn1.setLayout(null);

		JLabel lblNewLabel = new JLabel("회 원 가 입");
		lblNewLabel.setBounds(214, 8, 132, 38);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 27));
		pn1.add(lblNewLabel);

		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 82, 560, 286);
		getContentPane().add(pn2);
		pn2.setLayout(null);

		txtPwd = new JPasswordField();
		txtPwd.setBounds(202, 92, 155, 42);
		pn2.add(txtPwd);

		txtName = new JTextField();
		txtName.setBounds(202, 161, 155, 42);
		pn2.add(txtName);
		txtName.setColumns(10);

		JLabel lblMId = new JLabel("아이디");
		lblMId.setBounds(114, 32, 76, 15);
		lblMId.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblMId);

		JLabel lblPwd = new JLabel("비밀번호");
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwd.setBounds(114, 105, 76, 15);
		pn2.add(lblPwd);

		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(114, 174, 76, 15);
		pn2.add(lblName);

		txtMid = new JTextField();
		txtMid.setColumns(10);
		txtMid.setBounds(202, 19, 155, 42);
		pn2.add(txtMid);

		JLabel lblAge = new JLabel("나이");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setBounds(114, 245, 76, 15);
		pn2.add(lblAge);

		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(202, 232, 155, 42);
		pn2.add(txtAge);

		JLabel lblimage = new JLabel("");
		lblimage.setIcon(new ImageIcon(T2_TextField.class.getResource("/t7_windowBuilder/images/20240326_100409.gif")));
		// 프로젝트 내 폴더 이미지 사용 방법
		// 아래처럼 D 드라이브 경로로 하면 안됨.
//		lblimage.setIcon(new ImageIcon("D:\\javaclass\\java\\works\\j0325_AWT_Swing_WindowBuilder\\myImages\\2.jpg"));
//		lblimage.setIcon(new ImageIcon("./myImages/2.jpg"));
		// 위와 같이 이미지가 들어있는 폴더 경로로 해야함
		
		lblimage.setBounds(0, 0, 560, 286);
		pn2.add(lblimage);

		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 378, 560, 53);
		getContentPane().add(pn3);
		pn3.setLayout(null);

		btnReset = new JButton("다시입력");

		btnReset.setBounds(231, 5, 97, 23);
		pn3.add(btnReset);

		btnSubmit = new JButton("회원가입");
		btnSubmit.setBounds(97, 5, 97, 23);
		pn3.add(btnSubmit);

		btnExit = new JButton("종료");

		btnExit.setBounds(370, 5, 97, 23);
		pn3.add(btnExit);

		// -------------위쪽은 ui---------------
		setLocationRelativeTo(null); // 화면이 가운데 뜨도록
		setResizable(false); // 사이즈 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 완전히 종료 활성화
		setVisible(true);
		// -------------아래쪽은 메소드------------

		// 회원 가입 버튼
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMid.getText().trim().equals("")) { // trim : 공백 제거
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.");
					txtMid.requestFocus(); // 아이디 칸으로 커서 자동 이동
				} else if (txtPwd.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.");
					txtPwd.requestFocus();
				} else if (txtName.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력하세요.");
					txtName.requestFocus();
				}
//				else if (txtAge.getText().trim().equals("")) {
//					JOptionPane.showMessageDialog(null, "나이를 입력하세요.");
//					txtAge.requestFocus();
//				}
				else if (!Pattern.matches(rexAge, txtAge.getText().trim())) {
					JOptionPane.showMessageDialog(null, "나이는 숫자만 입력하세요.");
					txtAge.requestFocus();
				} else {
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
				}
			}
		});

		// 다시 입력 버튼
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMid.setText("");
				txtPwd.setText("");
				txtName.setText("");
				txtAge.setText("");
				txtMid.requestFocus(); // 리셋 시 아이디에 커서 포커스
			}
		});

		// 종료 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new T2_TextField();

	}
}
