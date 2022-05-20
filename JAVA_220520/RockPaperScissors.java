package study0520;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.border.*;
import javax.swing.text.Caret;


public class RockPaperScissors extends JFrame
{
	JLabel lbl,com,result,com1,result1;
    JPanel Panel1,Panel2;
    JButton b1,b2,rock,paper,scissors;
    int playerinput;
    int win,draw,lose;
    
    public RockPaperScissors()
    {
          super( "��������������" );
          
          setLayout(null);
          
          EtchedBorder eborder =  new EtchedBorder();
          
          Font font20 = new Font("SansSerif", Font.BOLD, 20);
  		  Font font15 = new Font("SansSerif", Font.BOLD, 15);
  		  Font font10 = new Font("SansSerif", Font.BOLD, 10);
  		
          lbl = new JLabel( "����/����/�� ����",JLabel.CENTER);
          lbl.setBounds(100, 50, 200, 30);		
          lbl.setFont(font20);
          
          lbl.setBorder(eborder);
          
          add( lbl );
          
          
          Panel1 = new JPanel();
          Panel1.setBounds(200, 100, 100, 100);		
          b1 = new JButton("���ӽ���");
          b1.setFont(font15);
          b2 = new JButton("����ư");
          b2.setFont(font15);
          Panel1.add( b1 );
          Panel1.add( b2 );
          
          Panel2 = new JPanel();
          Panel2.setBounds(100, 100, 100, 150);		
          rock = new JButton("����");
          rock.setFont(font15);
          paper = new JButton("��");
          paper.setFont(font15);
          scissors = new JButton("����");
          scissors.setFont(font15);
          Panel2.add( rock );
          Panel2.add( paper );
          Panel2.add( scissors );
          
          com = new JLabel("��ǻ��:");
          com.setBounds(100, 250, 100, 30);
          com.setFont(font20);
          com1 = new JLabel("");
          com1.setBounds(180, 250, 70, 30);
          com1.setFont(font20);
         
          result = new JLabel("�� ��:");
          result.setBounds(100, 300, 100, 30);
          result.setFont(font20);
          result1 = new JLabel("");
          result1.setBounds(170, 300, 100, 30);
          result1.setFont(font20);
        
          add(Panel1);
          add(Panel2);
          add(com);
          add(com1);
          add(result);
          add(result1);
          
          setSize(400,400);
          setVisible(true);
          
          setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        rock.addActionListener(new ActionListener() 
  		{
        	public void actionPerformed(ActionEvent e) 
    		{
        		if(e.getSource() == rock)
    			{
        			System.out.println("����[1]");
        			playerinput = 1;
        			
        			int computer =(int)(Math.random()*3)+1;
        			
        			if(computer == 3)
        			{
        				System.out.println("�÷��̾�¸�!");
        				System.out.println("��ǻ��:����");
        				com1.setText("����");
        				result1.setText("�¸�");
        				win++;
        			}
        			else if(computer == 2)
        			{
        				System.out.println("��ǻ�ͽ¸�!");
        				System.out.println("��ǻ��:��");
        				com1.setText("��");
        				result1.setText("�й�");
        				lose++;
        			}
        			else
        			{
        				System.out.println("���º�!");
        				System.out.println("��ǻ��:�ָ�");
        				com1.setText("�ָ�");
        				result1.setText("���º�");
        				draw++;
        			}
    			}				
    		}
      	});
        
        paper.addActionListener(new ActionListener() 
  		{
        	public void actionPerformed(ActionEvent e) 
    		{
    				if(e.getSource() == paper)
        			{
    					System.out.println("��[2]");
        				playerinput = 2;
            			
            			int computer =(int)(Math.random()*3)+1;
            			
            			if(computer == 1)
            			{
            				System.out.println("�÷��̾�¸�!");
            				System.out.println("��ǻ��:�ָ�");
            				com1.setText("�ָ�");
            				result1.setText("�¸�");
            				win++;
            			}
            			else if(computer == 3)
            			{
            				System.out.println("��ǻ�ͽ¸�!");
            				System.out.println("��ǻ��:����");
            				com1.setText("����");
            				result1.setText("�й�");
            				lose++;
            			}
            			else
            			{
            				System.out.println("���º�!");
            				System.out.println("��ǻ��:��");
            				com1.setText("��");
            				result1.setText("���º�");
            				draw++;
            			}
        			}								
    		}
      	});
        
        scissors.addActionListener(new ActionListener() 
  		{
        	public void actionPerformed(ActionEvent e) 
    		{
    			if(e.getSource() == scissors)
    	    	{
    				System.out.println("����[3]");
    				playerinput = 3;
    				
    				int computer =(int)(Math.random()*3)+1;
        			
        			if(computer == 2)
        			{
        				System.out.println("�÷��̾�¸�!");
        				System.out.println("��ǻ��:��");
        				com1.setText("��");
        				result1.setText("�¸�");
        				win++;
        			}
        			else if(computer == 1)
        			{
        				System.out.println("��ǻ�ͽ¸�!");
        				System.out.println("��ǻ��:�ָ�");
        				com1.setText("�ָ�");
        				result1.setText("�й�");
        				lose++;
        			}
        			else
        			{
        				System.out.println("���º�!");
        				System.out.println("��ǻ��:����");
        				com1.setText("����");
        				result1.setText("���º�");
        				draw++;
        			}
    	    	}				
    		}
      	});
        
        b2.addActionListener(new ActionListener() 
  		{
        	public void actionPerformed(ActionEvent e) 
    		{
    			if(e.getSource() == b2)
    	    	{
    				Program();
    				System.out.println("������");
    				System.out.println("�� ��: "+win);
    				System.out.println("�� ��: "+lose);
    				System.out.println("���º�: "+draw);
    	    	}				
    		}
      	});      
}
    
public void Program()
{
   	setTitle("������");
   	setSize(500,500);
   	setLocationRelativeTo(null);
   	setVisible(true);
   	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
           
public static void main( String args[] )
	{   		
    	new RockPaperScissors();
 	}
}



