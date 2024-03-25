package t3_event;

import java.awt.*;
import java.awt.event.*;

public class T3_ButtonEvent1 extends Frame implements WindowListener, ActionListener {
	Button btnPlay, btnstop, btnExit;

	public T3_ButtonEvent1() {
		super("버튼 이벤트 연습");
		setLayout(new FlowLayout());
		setBounds(350, 300, 300, 250);
		
		btnPlay = new Button("Start");
		btnstop = new Button("Stop");
		btnExit = new Button("Exit");
		
		add(btnPlay);
		add(btnstop);
		add(btnExit);
		
		setVisible(true);
		
		addWindowListener(this);
		btnPlay.addActionListener(this);
		btnstop.addActionListener(this);
		btnExit.addActionListener(this);
		
	}

	public static void main(String[] args) {
		new T3_ButtonEvent1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnText = (Button) e.getSource();
		
		if (btnText.getLabel().equals("Start")) {
			System.out.println("시작 버튼을 누르셨군요");
		}
		else if (btnText.getLabel().equals("Stop")) {
			System.out.println("정지 버튼을 누르셨군요");
		} else {
			System.out.println("종료 버튼을 누르셨군요.");
			System.exit(0);
		}
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}
