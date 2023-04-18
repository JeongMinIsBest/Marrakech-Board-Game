package ForShow;

import java.awt.*;
import javax.swing.*;

public class Display {
	
	private JFrame frame;
	private Canvas canvas;
	
	private String title;
	private int width, height;
	
	public Display(String title, int width, int height) {
		
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	private void createDisplay() {
		
		// 기본 윈도우 설정 -> 창의 너비 및 높이 등 종료 처리
		// 화면 크기는 메인 Launcher 에서 설정
		
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation(null);
		frame.setVisible(true);
		
		// 캔버스 생성 -> Display 에서 캔버스에 객체를 그리기 -> 캔버스가 완성되면 Frame 에 나타내기
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		
		// 프레임에 캔버스 더하기
		frame.add(canvas);
		frame.pack();
	}

	private void createBoard() {

	}

}
