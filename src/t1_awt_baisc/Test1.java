package t1_awt_baisc;

import java.awt.*;

// 직접 frame 객체를 생성해서 작업 처리
public class Test1 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		
		frame.setTitle("AWT 프레임");
		frame.setSize(300, 250); // 프레임의 크기(폭, 높이) : 픽셀 단위
		
		frame.setVisible(true);	// awt 프레임이라는 타이틀로 300,250크기의 창을 보여줘
		
		
	}
}
