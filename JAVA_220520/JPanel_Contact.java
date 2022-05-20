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
          super( "JText테스트" );
          // FlowLayout사용
          setLayout( new FlowLayout() );
          // Border로 영역 생성
          EtchedBorder eborder =  new EtchedBorder();
          // 레이블 생성     
          lbl = new JLabel( "연락처 내용 입력" );
          // 레이블에 영역 만들기
          lbl.setBorder(eborder);
          // 레이블 추가
          add( lbl );
          
          // id패널과 pw 패널생성
          idPanel = new JPanel();
          paPanel = new JPanel();
          la3 = new JLabel("이        름");
          la2 = new JLabel("전화번호");
          
          // id텍스트필드와 pw텍스트 필드 선언
          name = new JTextField(15);
          phone = new JTextField(15);
          idPanel.add(la3);
          idPanel.add(name);
          paPanel.add( la2 );
          paPanel.add( phone );
          
          // 로그인과 회원가입을 위한 패널 생성
          loginPanel = new JPanel();
          b1 = new JButton("등록");
          b2 = new JButton("취소");
          loginPanel.add( b1 );
          loginPanel.add( b2 );
          
          add(idPanel);
          add(paPanel);
          add(loginPanel);
          
          // 3행 20열 영역의 텍스트에어리어
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
    				inputname = name.getText(); // 텍스트 필더의 문자열을 inputname에 저장
    				inputphone = phone.getText(); // 텍스트 필더의 문자열을 inputage에 저장
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
