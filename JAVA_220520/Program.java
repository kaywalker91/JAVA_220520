package study0520;

import javax.swing.JFrame;

public class Program extends JFrame
{
	public Program()
	{
		setTitle("blog");
		setSize(1280,720);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Program p = new Program();
	}
}
