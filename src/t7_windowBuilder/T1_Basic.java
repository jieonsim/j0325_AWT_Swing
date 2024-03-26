package t7_windowBuilder;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class T1_Basic extends JFrame {
	// 텍스트 필드 등 변수는 위쪽으로 올리자. 표시만 해주는 애들은 안올려도 되지만 뭔가 받아서 하는건 올려줘야함
	private JTextField txtName, txtKor, txtEng, txtMat;
	private JButton btnInput, btnReset, btnExit;

	public T1_Basic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);

		JLabel lblTitle = new JLabel("그린중학교 성적표");
		lblTitle.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(198, 10, 388, 62);
		getContentPane().add(lblTitle);

		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblName.setBounds(62, 79, 89, 41);
		getContentPane().add(lblName);

		JLabel lblKor = new JLabel("국어 점수");
		lblKor.setHorizontalAlignment(SwingConstants.CENTER);
		lblKor.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblKor.setBounds(62, 199, 89, 41);
		getContentPane().add(lblKor);

		JLabel lblEng = new JLabel("영어 점수");
		lblEng.setHorizontalAlignment(SwingConstants.CENTER);
		lblEng.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblEng.setBounds(62, 319, 89, 41);
		getContentPane().add(lblEng);

		JLabel lblMat = new JLabel("수학 점수");
		lblMat.setHorizontalAlignment(SwingConstants.CENTER);
		lblMat.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblMat.setBounds(62, 439, 89, 41);
		getContentPane().add(lblMat);

		txtName = new JTextField();
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		txtName.setBounds(280, 82, 224, 49);
		getContentPane().add(txtName);
		txtName.setColumns(10);

		txtKor = new JTextField();
		txtKor.setHorizontalAlignment(SwingConstants.CENTER);
		txtKor.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		txtKor.setColumns(10);
		txtKor.setBounds(280, 191, 224, 49);
		getContentPane().add(txtKor);

		txtEng = new JTextField();
		txtEng.setHorizontalAlignment(SwingConstants.CENTER);
		txtEng.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		txtEng.setColumns(10);
		txtEng.setBounds(280, 311, 224, 49);
		getContentPane().add(txtEng);

		txtMat = new JTextField();
		txtMat.setHorizontalAlignment(SwingConstants.CENTER);
		txtMat.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		txtMat.setColumns(10);
		txtMat.setBounds(280, 439, 224, 49);
		getContentPane().add(txtMat);

		btnInput = new JButton("입력");
		
		btnInput.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnInput.setBounds(116, 511, 106, 29);
		getContentPane().add(btnInput);

		btnReset = new JButton("다시 입력");

		btnReset.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnReset.setBounds(338, 511, 106, 29);
		getContentPane().add(btnReset);

		btnExit = new JButton("종료");

		btnExit.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnExit.setBounds(560, 511, 106, 29);
		getContentPane().add(btnExit);

		// 위쪽은 디자인
		setVisible(true);
		// 아래쪽은 메소드
		
		// 입력 버튼
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		// 다시 입력 버튼
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtKor.setText("");
				txtEng.setText("");
				txtMat.setText("");
				txtName.requestFocus();
			}
		});

		// 종료 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(null, "작업을 종료하시겠습니까?", "", JOptionPane.YES_NO_OPTION);
				if (ans == 0) {
					System.exit(0);
				}
			}
		});

	}

	public static void main(String[] args) {
		new T1_Basic();

	}
}
