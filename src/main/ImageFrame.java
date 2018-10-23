package main;

import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sun.awt.AWTUtilities;

public class ImageFrame extends JFrame {
	int Frame_Width = 500;
	int Frame_Height = 500;
	ImageIcon icon = new ImageIcon("C:\\Users\\Administrator\\Downloads\\show word\\src\\Another knife.png");

	public ImageFrame() {
		JLabel backLabel = new JLabel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				icon.paintIcon(this, g, 0, 0);
			}
		};
		this.add(backLabel);
		setUndecorated(true); // 不装饰

		setSize(Frame_Width, Frame_Height); // 设置窗口大小
		AWTUtilities.setWindowOpaque(this, false);
		setLocationRelativeTo(null); // 设置窗口居中
		setVisible(true);
	}

	public static void main(String[] args) {
		ImageFrame frame = new ImageFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.exit(0);
			}
		};
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(task, 2000, 1);
	}
}