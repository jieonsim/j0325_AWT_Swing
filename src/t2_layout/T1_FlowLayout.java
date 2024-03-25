package t2_layout;

import java.awt.*;
import java.awt.event.*;

public class T1_FlowLayout extends Frame implements WindowListener, ActionListener {
	// 생성자 따로. 생성자를 통해서 UI 설계 처리를 한다.
	public T1_FlowLayout() {
		// 프레임 타이틀
		super("FlowLayout 연습");
		setLayout(new FlowLayout());
		setBounds(300, 250, 300, 300);

		Button btn1 = new Button("버튼1");
		Button btn2 = new Button();
		btn2.setLabel("버튼2");
		Button btn3 = new Button("종료");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		
		this.add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		setVisible(true);
		
		addWindowListener(this);
		btn3.addActionListener(this); // btn3을 종료 버튼으로

	}

	// 메인 따로. 메인에서 생성자를 부른다
	public static void main(String[] args) {
		new T1_FlowLayout();
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

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);

	}
}
