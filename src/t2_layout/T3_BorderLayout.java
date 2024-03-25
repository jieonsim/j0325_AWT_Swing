package t2_layout;

import java.awt.*;
import java.awt.event.*;

public class T3_BorderLayout extends Frame implements WindowListener, ActionListener {
	Button btn1, btn2, btn3, btn4, btn5;

	public T3_BorderLayout() {
		super("BorderLayout 연습");
		setBounds(300, 250, 300, 300);
		setLayout(new BorderLayout());

		btn1 = new Button("북쪽");
		btn2 = new Button("남쪽");
		btn3 = new Button("서쪽");
		btn4 = new Button("동쪽");
		btn5 = new Button("중앙(종료)");

		add(btn1, BorderLayout.NORTH); // 열거형이기 때문에 클래스 이름(BorderLayout).열거형상수 하면 된다
		add(btn2, BorderLayout.SOUTH);
		add(btn3, BorderLayout.WEST);
//		add(btn4, BorderLayout.EAST);
//		add(btn5, BorderLayout.CENTER);
		add(btn4, "East");	
		add(btn5, "Center");
		// 열거형의 첫글자만 대문자로 해서 따옴표에 직접 넣을 수도 있다. 단, 스펠링이나 대소문자 구분 안되면 에러남

		setVisible(true);

		addWindowListener(this);
		btn5.addActionListener(this);

	}

	public static void main(String[] args) {
		new T3_BorderLayout();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}
}
