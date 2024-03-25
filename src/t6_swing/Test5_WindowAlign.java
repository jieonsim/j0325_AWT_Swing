package t6_swing;

import javax.swing.*;

// 화면 중앙에 윈도우 정렬 및 크기 고정
public class Test5_WindowAlign extends JFrame {

	public Test5_WindowAlign() {
		super("스윙 연습5");

//		setBounds(300, 250, 300, 250); 크기 고정이니 좌표 사용 불가

		setSize(300, 250); // 폭(width), 높이(height)
		setLocationRelativeTo(null); // 윈도우 화면 중앙에 배치
		setResizable(false); // 크기 고정 (true : 크기 변경 가능)

		setVisible(true);

		// 윈도우 창 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Test5_WindowAlign();

	}
}