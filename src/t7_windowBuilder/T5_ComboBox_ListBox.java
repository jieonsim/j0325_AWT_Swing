package t7_windowBuilder;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class T5_ComboBox_ListBox extends JFrame {
	private JButton btnCombo, btnExit, btnList1, btnList2;
	private JComboBox comboJob;
	private JLabel lblMessage;

	public T5_ComboBox_ListBox() {
		super("콤보박스 연습");
		setSize(600, 500);
		getContentPane().setLayout(null);

		JPanel panel4 = new JPanel();
		panel4.setBounds(0, 370, 584, 91);
		getContentPane().add(panel4);
		panel4.setLayout(null);

		lblMessage = new JLabel("출력메시지");
		lblMessage.setFont(new Font("굴림", Font.PLAIN, 16));
		lblMessage.setBounds(12, 10, 560, 71);
		panel4.add(lblMessage);

		JPanel panel3 = new JPanel();
		panel3.setBounds(0, 304, 584, 65);
		getContentPane().add(panel3);
		panel3.setLayout(null);

		// 콤보 출력 버튼 UI
		btnCombo = new JButton("콤보출력");
		btnCombo.setFont(new Font("돋움", Font.PLAIN, 16));
		btnCombo.setBounds(12, 10, 130, 45);
		panel3.add(btnCombo);

		// 종료 버튼 UI
		btnExit = new JButton("종료버튼");
		btnExit.setFont(new Font("돋움", Font.PLAIN, 16));
		btnExit.setBounds(442, 10, 130, 45);
		panel3.add(btnExit);

		btnList1 = new JButton("리스트 상자 출력1");
		btnList1.setFont(new Font("돋움", Font.PLAIN, 11));
		btnList1.setBounds(154, 10, 130, 45);
		panel3.add(btnList1);

		btnList2 = new JButton("리스트 상자 출력2");
		btnList2.setFont(new Font("돋움", Font.PLAIN, 11));
		btnList2.setBounds(300, 10, 130, 45);
		panel3.add(btnList2);

		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 293, 307);
		getContentPane().add(panel1);
		panel1.setLayout(null);

		JLabel lblNewLabel = new JLabel("직업을 선택하세요");
		lblNewLabel.setFont(new Font("돋움", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 269, 39);
		panel1.add(lblNewLabel);

		comboJob = new JComboBox();
		comboJob.setModel(new DefaultComboBoxModel(new String[] { "학생", "회사원", "군인", "의사", "공무원", "기타" }));
		comboJob.setFont(new Font("돋움", Font.PLAIN, 16));
		comboJob.setBounds(12, 59, 269, 39);
		panel1.add(comboJob);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 108, 269, 189);
		panel1.add(scrollPane_1);

		JTextArea textaMemo = new JTextArea();
		scrollPane_1.setViewportView(textaMemo);

		JPanel panel2 = new JPanel();
		panel2.setBounds(291, 0, 293, 307);
		getContentPane().add(panel2);
		panel2.setLayout(null);

		JList listJob = new JList();
		listJob.setModel(new AbstractListModel() {
			String[] values = new String[] { "학생", "의사", "변호사", "회계사", "판사", "군인", "공무원", "간호사", "역무원", "기타" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listJob.setBounds(12, 30, 269, 103);
		panel2.add(listJob);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 164, 269, 115);
		panel2.add(scrollPane);

		JList listJob2 = new JList();
		listJob2.setModel(new AbstractListModel() {
			String[] values = new String[] { "학생", "의사", "변호사", "회계사", "판사", "군인", "공무원", "간호사", "역무원", "기타" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listJob2);

// ------------------------------------------------------------------------------------		
		setLocationRelativeTo(null); // 화면이 가운데 뜨도록
		setResizable(false); // 사이즈 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 완전히 종료 활성화
		setVisible(true);
// ------------------------------------------------------------------------------------		

		// 콤보 출력 버튼 메소드
		btnCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = comboJob.getSelectedItem().toString() + "("+comboJob.getSelectedIndex()+")";
				lblMessage.setText(msg);
			}
		});

		// 리스트 상자 출력1 버튼 메소드
		btnList1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
//				Object[] jobs = listJob.getSelectedValues(); < 가능
				Object[] jobs = listJob.getSelectedValuesList().toArray();
				for (Object job : jobs) {
					msg += job + "/";
				}
				msg = msg.substring(0, msg.length() - 1);

				lblMessage.setText(msg);
			}
		});

		// 여러개 한번에 선택 가능
		// 리스트 상자 출력2 버튼 메소드 (리스트 상자2의 내용을 선택하면 왼쪽 메모장에 내용을 출력시켜준다)
//		btnList2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String msg = "";
//				Object[] jobs = listJob2.getSelectedValuesList().toArray();
//				for (Object job : jobs) {
////					msg += job + "/";  이렇게 하면 옆으로 스크롤
//					msg += job + "\n"; // 이렇게 하면 아래로 스크롤
//				}
//				msg = msg.substring(0, msg.length() - 1);
//				textaMemo.setText(msg);
//			}
//		});
		
		// 하나 중복 선택
		btnList2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textaMemo.append(listJob2.getSelectedValue() + "\n");
			
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
		new T5_ComboBox_ListBox();
		
	}
}
