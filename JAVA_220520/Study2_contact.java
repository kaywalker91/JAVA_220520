package study0520;

import java.awt.*;
import java.awt.event.*;

public class Study2_contact {

	public static void main(String[] args) {
		Friends2 f = new Friends2();
	}
}

class Friends2 extends Frame implements MouseMotionListener, ActionListener {
	
	private Label lb = new Label("x = 000, y = 000", Label.RIGHT);
	private Label lb1 = new Label("x = 000, y = 000");
	
	String result="";
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Button btnAdd = new Button("친구추가");
	Label lbTitle = new Label("친구추가프로그램", Label.LEFT);	
	Label lbName = new Label("이름 : ", Label.LEFT);
	Label lbAge = new Label("나이  :", Label.LEFT);
	Label lbAddr = new Label("주소 : ", Label.LEFT);
	TextField tfName  = new TextField(20);	
	TextField tfAge  = new TextField(20);
	TextField tfAddr  = new TextField(20);
	private TextArea ta = new TextArea();
	
	
	public Friends2() {
		super("친구추가프로그램");
		this.init();
		this.start();
		this.setSize(420, 550);	
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}

	public void init() {
		// 앱솔루트방식  : 직접 좌표 입력방식.
		this.setLayout(null);
		
		lb.addMouseMotionListener(this);
		lb1.addMouseMotionListener(this);

		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font15 = new Font("SansSerif", Font.BOLD, 15);
		Font font10 = new Font("SansSerif", Font.BOLD, 10);
		
		//타이틀
		this.add(lbTitle);
		lbTitle.setBounds(100, 50, 300, 30);		
		lbTitle.setFont(font20);
		
		this.add(lbName);
		lbName.setBounds(100, 100, 50, 30);
		lbName.setFont(font15);
		
		this.add(tfName);
		tfName.setBounds(170, 100, 150, 30);
		tfName.setFont(font15);
		
		this.add(lbAge);
		lbAge.setBounds(100, 150, 50, 30);
		lbAge.setFont(font15);
		
		this.add(tfAge);
		tfAge.setBounds(170, 150, 150, 30);
		tfAge.setFont(font15);
		
		this.add(lbAddr);
		lbAddr.setBounds(100, 200, 50, 30);
		lbAddr.setFont(font15);
		
		this.add(tfAddr);
		tfAddr.setBounds(170, 200, 150, 30);
		tfAddr.setFont(font15);
		
		this.add(btnAdd);
		btnAdd.setBounds(140, 250, 150, 30);
		btnAdd.setFont(font15);
		
		
		this.add(ta);
		ta.setBounds(100, 300, 250, 200);
		ta.setFont(font15);
		
	}
	
	public void mouseMoved(MouseEvent e) {
		int xpos = e.getX();
		int ypos = e.getY();
		lb1.setText("x = " + xpos + ", y = " + ypos);
	}

	public void mouseDragged(MouseEvent e) {
		int xpos = e.getX();
		int ypos = e.getY();
		lb.setText("x = " + xpos + ", y = " + ypos);
	}

	public void start() 
	{
		this.setLayout(new BorderLayout());
		this.add("North", lb);
		this.add("South", lb1);
		btnAdd.addActionListener(this); 
		
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
			
		String name = tfName.getText();
		String age = tfAge.getText();
		String addr = tfAddr.getText();
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("addr:"+addr);
		
		result += name +"/"+ age + "/"+addr+"\n";
		ta.setText(result);
		
		tfName.setText("");
		tfAge.setText("");
		tfAddr.setText("");
	}

}
