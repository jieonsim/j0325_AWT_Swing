package t7_windowBuilder;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class T3_Image extends JFrame {
	JButton btnTotal, btn1, btn2, btn3, btn4, btnRandom, btnExit;
	JLabel lblImg1, lblImg2, lblImg3, lblImg4, lblCount;
	private JButton btnClosing;

	int img1Cnt = 0, img2Cnt = 0, img3Cnt = 0, img4Cnt = 0;

	public T3_Image() {
		super("카드 횟수 맞추기");
		setSize(800, 480);
		getContentPane().setLayout(null);

		JPanel panel1 = new JPanel();
		panel1.setBounds(12, 10, 760, 42);
		getContentPane().add(panel1);
		panel1.setLayout(null);

		btnTotal = new JButton("모두보기");
		btnTotal.setBounds(17, 10, 80, 20);
		panel1.add(btnTotal);

		btn1 = new JButton("1번보기");
		btn1.setBounds(201, 9, 75, 20);
		panel1.add(btn1);

		btn2 = new JButton("2번보기");
		btn2.setBounds(293, 9, 75, 20);
		panel1.add(btn2);

		btnRandom = new JButton("랜덤보기");
		btnRandom.setBounds(569, 9, 80, 20);
		panel1.add(btnRandom);

		btnExit = new JButton("종료");
		btnExit.setBounds(661, 9, 75, 20);
		panel1.add(btnExit);

		btn3 = new JButton("3번보기");

		btn3.setBounds(385, 9, 75, 20);
		panel1.add(btn3);

		btn4 = new JButton("4번보기");
		btn4.setBounds(477, 9, 75, 20);
		panel1.add(btn4);

		btnClosing = new JButton("모두닫기");

		btnClosing.setBounds(109, 10, 80, 20);
		panel1.add(btnClosing);

		JPanel panel2 = new JPanel();
		panel2.setBounds(12, 62, 760, 317);
		getContentPane().add(panel2);
		panel2.setLayout(null);

		lblImg1 = new JLabel("");
		lblImg1.setIcon(new ImageIcon(T3_Image.class.getResource("/t7_windowBuilder/images/20240326_100409.gif")));
		lblImg1.setBounds(12, 10, 175, 307);
		panel2.add(lblImg1);
		lblImg1.setVisible(false);

		lblImg2 = new JLabel("");
		lblImg2.setIcon(new ImageIcon(T3_Image.class.getResource("/t7_windowBuilder/images/테스트.jpg")));
		lblImg2.setBounds(199, 10, 175, 307);
		panel2.add(lblImg2);
		lblImg2.setVisible(false);

		lblImg3 = new JLabel("");
		lblImg3.setIcon(new ImageIcon(T3_Image.class.getResource("/t7_windowBuilder/images/20240326_111716.jpg")));
		lblImg3.setBounds(386, 10, 175, 307);
		panel2.add(lblImg3);
		lblImg3.setVisible(false);

		lblImg4 = new JLabel("");
		lblImg4.setIcon(new ImageIcon(T3_Image.class.getResource("/t7_windowBuilder/images/exit_button_icon_132754.png")));
		lblImg4.setBounds(573, 10, 175, 307);
		panel2.add(lblImg4);
		lblImg4.setVisible(false);

		JPanel panel3 = new JPanel();
		panel3.setBounds(12, 389, 760, 42);
		getContentPane().add(panel3);
		panel3.setLayout(null);

		lblCount = new JLabel("1번 : 0  2번 : 0  3번 : 0  4번 : 0");
		lblCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCount.setFont(new Font("굴림", Font.BOLD, 13));
		lblCount.setBounds(12, 10, 736, 22);
		panel3.add(lblCount);

		setLocationRelativeTo(null); // 화면이 가운데 뜨도록
		setResizable(false); // 사이즈 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 완전히 종료 활성화
		setVisible(true);

		// ------------------------------------------------

		// 모두보기 버튼
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allDisplay();
				img1Cnt++;
				img2Cnt++;
				img3Cnt++;
				img4Cnt++;
				dispCount();

			}
		});

		// 모두닫기 버튼
		btnClosing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allClose();
			}
		});

		// 1번보기 버튼
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(true);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img1Cnt++;
				dispCount();
			}
		});

		// 2번 보기 버튼
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(true);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img2Cnt++;
				dispCount();
			}
		});

		// 3번보기 버튼
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(true);
				lblImg4.setVisible(false);
				img3Cnt++;
				dispCount();
			}
		});

		// 4번보기 버튼
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(true);
				img4Cnt++;
				dispCount();
			}
		});

		// 랜덤보기 버튼
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = (int) (Math.random() * 4) + 1;
				if (num == 1) {
					lblImg1.setVisible(true);
					lblImg2.setVisible(false);
					lblImg3.setVisible(false);
					lblImg4.setVisible(false);
					img1Cnt++;
				}
				if (num == 2) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(true);
					lblImg3.setVisible(false);
					lblImg4.setVisible(false);
					img2Cnt++;
				}
				if (num == 3) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(false);
					lblImg3.setVisible(true);
					lblImg4.setVisible(false);
					img3Cnt++;
				}
				if (num == 4) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(false);
					lblImg3.setVisible(true);
					lblImg4.setVisible(false);
					img4Cnt++;
				}
				dispCount();
			}
		});

		
		// 종료 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	// 모두 보기 메소드
	protected void allDisplay() {
		lblImg1.setVisible(true);
		lblImg2.setVisible(true);
		lblImg3.setVisible(true);
		lblImg4.setVisible(true);
	}

	// 모두 종료 메소드
	protected void allClose() {
		lblImg1.setVisible(false);
		lblImg2.setVisible(false);
		lblImg3.setVisible(false);
		lblImg4.setVisible(false);

	}

	// 카운트 레이블에 표시하기
	protected void dispCount() {
		lblCount.setText("1번 : " + img1Cnt + "2번 : " + img2Cnt + "  3번 : " + img3Cnt + " 4번 : " + img4Cnt);
	}

	public static void main(String[] args) {
		new T3_Image();
	}
}
