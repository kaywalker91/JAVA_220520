package study0520;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.*;
import javax.swing.text.Caret;
 
public class JPanel_Contact extends JFrame
{
    JLabel lbl,la1,la2,la3;
    JTextField name;
    JTextField phone;
    JPanel idPanel,paPanel,loginPanel;
    JButton b1,b2;
    JTextArea content;
    String inputname= "";
    String inputphone= "";
    String result = "";
  
    public JPanel_Contact()
    {
          super( "JText�׽�Ʈ" );
          // FlowLayout���
          setLayout( new FlowLayout() );
          // Border�� ���� ����
          EtchedBorder eborder =  new EtchedBorder();
          // ���̺� ����     
          lbl = new JLabel( "����ó ���� �Է�" );
          // ���̺� ���� �����
          lbl.setBorder(eborder);
          // ���̺� �߰�
          add( lbl );
          
          // id�гΰ� pw �гλ���
          idPanel = new JPanel();
          paPanel = new JPanel();
          la3 = new JLabel("��        ��");
          la2 = new JLabel("��ȭ��ȣ");
          
          // id�ؽ�Ʈ�ʵ�� pw�ؽ�Ʈ �ʵ� ����
          name = new JTextField(15);
          phone = new JTextField(15);
          idPanel.add(la3);
          idPanel.add(name);
          paPanel.add( la2 );
          paPanel.add( phone );
          
          // �α��ΰ� ȸ�������� ���� �г� ����
          loginPanel = new JPanel();
          b1 = new JButton("���");
          b2 = new JButton("���");
          loginPanel.add( b1 );
          loginPanel.add( b2 );
          
          add(idPanel);
          add(paPanel);
          add(loginPanel);
          
          // 3�� 20�� ������ �ؽ�Ʈ�����
          content = new JTextArea(3,20);
          JScrollPane s= new JScrollPane(content);
          add(s);
          setSize( 250, 350 );
          setVisible(true);
          
          setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        b1.addActionListener(new ActionListener() 
  		{
        	public void actionPerformed(ActionEvent e) 
    		{
    			if(e.getSource() == b1)
    	    	{
    				inputname = name.getText(); // �ؽ�Ʈ �ʴ��� ���ڿ��� inputname�� ����
    				inputphone = phone.getText(); // �ؽ�Ʈ �ʴ��� ���ڿ��� inputage�� ����
    				result += inputname+" / "+inputphone+"\n";
    				content.setText(result);
    				
    				name.setText("");
    				phone.setText("");
    	    	}				
    		}
      	});	
        
}
    
    public static void main( String args[] )
       { 
        	new JPanel_Contact();
       }
}
