package t8_insa;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.regex.*;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;

public class InsaInput extends JFrame {
	private JButton btnInput, btnReset, btnClose;
	private JTextField txtName, txtAge;
	private JComboBox cbYY, cbMM, cbDD;
	private final ButtonGroup btnGroupGender = new ButtonGroup();
	
	InsaDAO dao = new InsaDAO();
	InsaVO vo = null;
	int res = 0;

	public InsaInput() {
		super("회원가입창");
		setSize(800, 600);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 69);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("회 원 가 입 폼");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(170, 5, 417, 54);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 98, 760, 369);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("성 명");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(155, 57, 103, 36);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("나 이");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(155, 131, 103, 36);
		panel_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("성 별");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(155, 204, 103, 36);
		panel_1.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("입사일");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(89, 281, 103, 36);
		panel_1.add(lblNewLabel_1_3);

		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.PLAIN, 20));
		txtName.setBounds(289, 57, 255, 36);
		panel_1.add(txtName);
		txtName.setColumns(10);

		txtAge = new JTextField();
		txtAge.setFont(new Font("굴림", Font.PLAIN, 20));
		txtAge.setColumns(10);
		txtAge.setBounds(289, 131, 255, 36);
		panel_1.add(txtAge);

		JRadioButton rdGenderMale = new JRadioButton("남  자");
		btnGroupGender.add(rdGenderMale);
		rdGenderMale.setFont(new Font("굴림", Font.PLAIN, 14));
		rdGenderMale.setBounds(289, 212, 82, 23);
		panel_1.add(rdGenderMale);

		JRadioButton rdGenderFemale = new JRadioButton("여  자");
		btnGroupGender.add(rdGenderFemale);
		rdGenderFemale.setFont(new Font("굴림", Font.PLAIN, 14));
		rdGenderFemale.setSelected(true);
		rdGenderFemale.setBounds(436, 212, 82, 23);
		panel_1.add(rdGenderFemale);

		// 년도/월/일 초기값 생성하기
		String[] yy = new String[25];
		String[] mm = new String[12];
		String[] dd = new String[31];

		int imsi = 0;
		for (int i = 0; i < yy.length; i++) {
			imsi = 2024 - i;
			yy[i] = imsi + "";
		}
		for (int i = 0; i < mm.length; i++) {
			mm[i] = (i + 1) + "";
		}
		for (int i = 0; i < dd.length; i++) {
			dd[i] = (i + 1) + "";
		}
		cbYY = new JComboBox(yy);
		cbYY.setFont(new Font("굴림", Font.PLAIN, 20));
		cbYY.setBounds(217, 283, 82, 31);
		panel_1.add(cbYY);

		JLabel lblNewLabel_2 = new JLabel("년");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(311, 277, 29, 43);
		panel_1.add(lblNewLabel_2);

		cbMM = new JComboBox(mm);
		cbMM.setFont(new Font("굴림", Font.PLAIN, 20));
		cbMM.setBounds(361, 283, 82, 31);
		panel_1.add(cbMM);

		JLabel lblNewLabel_2_1 = new JLabel("월");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(455, 277, 29, 43);
		panel_1.add(lblNewLabel_2_1);

		cbDD = new JComboBox(dd);
		cbDD.setFont(new Font("굴림", Font.PLAIN, 20));
		cbDD.setBounds(504, 283, 82, 31);
		panel_1.add(cbDD);

		JLabel lblNewLabel_2_2 = new JLabel("일");
		lblNewLabel_2_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(598, 277, 29, 43);
		panel_1.add(lblNewLabel_2_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 482, 760, 69);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);

		btnInput = new JButton("가입하기");

		btnInput.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnInput.setFont(new Font("굴림", Font.PLAIN, 22));
		btnInput.setBounds(34, 10, 165, 49);
		panel_2.add(btnInput);

		btnReset = new JButton("다시입력");
		
		btnReset.setFont(new Font("굴림", Font.PLAIN, 22));
		btnReset.setBounds(285, 10, 165, 49);
		panel_2.add(btnReset);

		btnClose = new JButton("창닫기");
		btnClose.setFont(new Font("굴림", Font.PLAIN, 22));
		btnClose.setBounds(544, 10, 165, 49);
		panel_2.add(btnClose);

		setLocationRelativeTo(null); // 화면이 가운데 뜨도록
		setResizable(false); // 사이즈 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 완전히 종료 활성화
		setVisible(true);

		// 창닫기 버튼 메소드
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // jvm은 안닫히고 현재 창만 닫히는
				new InsaMain(); // 닫힌 후에 InsaMain 클래스가 열리게됨
			}
		});

		// 회원 가입 버튼 메소드
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText().trim();
				String age = txtAge.getText().trim();
				// 웹이나 여기로 받는건 다 문자로 옴.
				String gender = "";
				String ipsail = cbYY.getSelectedItem() + "-" + cbMM.getSelectedItem() + "-" + cbDD.getSelectedItem();
				// 유효성 검사
				if (name.equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력하세요.");
					txtName.requestFocus();
				} else if (!Pattern.matches("^[0-9]+$", age)) {
					JOptionPane.showInternalMessageDialog(null, "나이는 숫자로 입력하세요.");
					txtAge.requestFocus();
				} else {
					if (rdGenderMale.isSelected())
						gender = "남자";
					else
						gender = "여자";
				}
				// 모든 체크가 끝나면 DB에 새로운 회원을 가입 처리한다.
				// 회원명 중복 처리
				vo = dao.getNameSearch(name);
				if (vo.getName() != null) {
					JOptionPane.showMessageDialog(null, "이미 가입된 회원입니다. 이름을 다시 입력해 주세요.");
					txtName.requestFocus();
				}
				else {
					// 정상적으로 자료가 입력되었다면 vo에 값을 담아서 DB에 저장한다.
					vo.setName(name);
					vo.setAge(Integer.parseInt(age));
					vo.setGender(gender);
					vo.setIpsail(ipsail);
					
					res = dao.setInsaInput(vo);
					if (res != 0) {
						JOptionPane.showMessageDialog(null, "회원 가입이 완료되었습니다.");
						dispose();
						new InsaMain();
					} else {
						JOptionPane.showMessageDialog(null, "회원 가입이 실패하였습니다. 다시 가입해 주세요.");						
						txtName.requestFocus();
					}

				}
			}
		});
		
		// 다시입력 버튼 메소드
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAge.setText("");
				txtName.requestFocus();
			}
		});
		
	}

//	public static void main(String[] args) {
//		new InsaInput();
//	}
}
