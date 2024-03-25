package t4_panel;

import java.awt.*;
import java.awt.event.*;

public class T1_GridPanel2 extends Frame implements WindowListener, ActionListener {
	Panel pn1, pn2, pn3;
	Label lbl1, lbl2, lbl3;
	Button btnExit;

	public T1_GridPanel2() {
		super("그리드 패널 연습");
		setLayout(new GridLayout(3, 1));
		setBounds(400, 350, 400, 350);

		pn1 = new Panel();
		pn2 = new Panel();
		pn3 = new Panel();
		
		lbl1 = new Label("첫번째 패널");
		lbl2 = new Label("두번째 패널");
		lbl3 = new Label("세번째 패널");
		
		btnExit = new Button("종료");
		
		pn1.add(lbl1);
		pn2.add(lbl2);
		pn3.add(lbl3);
		pn3.add(btnExit);
		
		this.add(pn1);
		add(pn2); // add 앞에 this 생략 가능
		add(pn3); 

		setVisible(true);

		addWindowListener(this);
		btnExit.addActionListener(this);
	}

	public static void main(String[] args) {
		new T1_GridPanel2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
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
