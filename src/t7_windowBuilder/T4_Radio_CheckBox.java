package t7_windowBuilder;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class T4_Radio_CheckBox extends JFrame{
	private JRadioButton rdMale, rdFemale;
	private JCheckBox ckHobby1, ckHobby2, ckHobby3, ckHobby4;
	private JLabel lblTitle, lblGender, lblHobby, lblMessage;
	private JButton btnGender, btnHobby, btnExit;
	private final ButtonGroup btnGroupGender = new ButtonGroup();
	
	public T4_Radio_CheckBox() {
		super("라디오 / 체크박스 연습");
		setSize(600,400);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 584, 55);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		lblTitle = new JLabel("라디오버튼 / 체크박스 연습");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 22));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 0, 584, 55);
		pn1.add(lblTitle);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 54, 584, 253);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblGender = new JLabel("성별");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("굴림", Font.PLAIN, 16));
		lblGender.setBounds(77, 37, 88, 40);
		pn2.add(lblGender);
		
		rdMale = new JRadioButton("남자");
		btnGroupGender.add(rdMale);
		rdMale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdMale.setBounds(216, 46, 71, 23);
		pn2.add(rdMale);
		
		rdFemale = new JRadioButton("여자");
		btnGroupGender.add(rdFemale);
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdFemale.setBounds(340, 46, 71, 23);
		pn2.add(rdFemale);
		
		lblHobby = new JLabel("취미");
		lblHobby.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobby.setFont(new Font("굴림", Font.PLAIN, 16));
		lblHobby.setBounds(77, 97, 88, 40);
		pn2.add(lblHobby);
		
		ckHobby1 = new JCheckBox("등산");
		ckHobby1.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby1.setBounds(166, 106, 79, 23);
		pn2.add(ckHobby1);
		
		ckHobby2 = new JCheckBox("낚시");
		ckHobby2.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby2.setBounds(249, 107, 79, 23);
		pn2.add(ckHobby2);
		
		ckHobby3 = new JCheckBox("수영");
		ckHobby3.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby3.setBounds(332, 107, 79, 23);
		pn2.add(ckHobby3);
		
		ckHobby4 = new JCheckBox("바둑");
		ckHobby4.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby4.setBounds(415, 107, 79, 23);
		pn2.add(ckHobby4);
		
		lblMessage = new JLabel("메세지출력");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("굴림", Font.PLAIN, 20));
		lblMessage.setBounds(77, 162, 399, 62);
		pn2.add(lblMessage);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 306, 584, 55);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnGender = new JButton("성별 출력");
		btnGender.setFont(new Font("굴림", Font.PLAIN, 16));
		btnGender.setBounds(86, 10, 117, 35);
		pn3.add(btnGender);
		
		btnExit = new JButton("종료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 16));
		btnExit.setBounds(387, 10, 109, 35);
		pn3.add(btnExit);
		
		btnHobby = new JButton("취미 출력");
		btnHobby.setFont(new Font("굴림", Font.PLAIN, 16));
		btnHobby.setBounds(241, 10, 117, 35);
		pn3.add(btnHobby);
		
		
//------------------------------------------------------------------------------------
		
		setLocationRelativeTo(null); // 화면이 가운데 뜨도록
		setResizable(false); // 사이즈 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 완전히 종료 활성화
		setVisible(true);
		
//------------------------------------------------------------------------------------		
		
		// 성별 출력 버튼 메소드
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "선택하신 성별은 " ;
				if (rdMale.isSelected()) {
					gender += rdMale.getText();
				} else {
					gender += rdFemale.getText();
				}
				lblMessage.setText(gender);
			}
		});
		
		// 취미 출력 버튼 메소드
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hobby = "";
				if (ckHobby1.isSelected()) {
					hobby += ckHobby1.getText() + "/";
				}
				if (ckHobby2.isSelected()) {
					hobby += ckHobby2.getText() + "/";
				}
				if (ckHobby3.isSelected()) {
					hobby += ckHobby3.getText() + "/";
				}
				if (ckHobby4.isSelected()) {
					hobby += ckHobby4.getText() + "/";
				}
				hobby = hobby.substring(0, hobby.length() - 1); // 안됨 확인 필요
				
				lblMessage.setText("선택하신 취미는 " + hobby);
				JOptionPane.showMessageDialog(null, "선택된 취미는 " + hobby);
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
		new T4_Radio_CheckBox();
	}
}
