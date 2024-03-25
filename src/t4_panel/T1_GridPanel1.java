package t4_panel;

import java.awt.*;
import java.awt.event.*;

public class T1_GridPanel1 extends Frame implements WindowListener, ActionListener {
//	Button btnExit;
	Panel pn1, pn2, pn3;
	Label lbl1, lbl2, lbl3;

	public T1_GridPanel1() {
		super("그리드 패널 연습");
		setLayout(new GridLayout(3, 1));
		setBounds(400, 350, 400, 350);

		// 첫번째 패널
		pn1 = new Panel();
		lbl1 = new Label("첫번째 패널");
		pn1.add(lbl1);
		this.add(pn1);
		
		// 두번째 패널
		pn2 = new Panel();
		lbl2 = new Label("두번째 패널");
		pn2.add(lbl2);
		add(pn2); // add 앞에 this 생략 가능
		
		// 세번째 패널
		pn3 = new Panel();
		lbl3 = new Label("세번째 패널");
		pn3.add(lbl3);
		add(pn3); 
		
		
		setVisible(true);

		addWindowListener(this);
//		btnExit.addActionListener(this);
	}

	public static void main(String[] args) {
		new T1_GridPanel1();
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
