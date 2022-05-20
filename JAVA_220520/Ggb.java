package study0520;

import java.util.Random;
import java.util.Scanner;
 
public class Ggb {
 
    public static void main(String[] args) {
        
        /*
         * ��ǻ�Ϳ� ����,����,�� ������ �ؼ� ����� �̱���� �·� �˾ƺ���. 
         * ����[1] ����[2] ��[3]
         */
        
        //�Է� �޼��� ��üȭ
        Scanner sc = new Scanner(System.in);
        
        //��ǻ�Ϳ� ������ ������ �������� Ȯ��
        String comStr="",userStr="";
        
        //���
        int win=0,lose=0,draw=0,fail=0;
        
        //Start
        System.out.println("������ ���� ��������(�ִ� 10)");
        
        //���� Ƚ��
        int coin = sc.nextInt();
        
        //10�̻��� ��� ���α׷� ����
        if(coin > 10) {
            System.out.println("10ȸ �̻� ����� �� �����ϴ�.");
            return;
        }
        
        //���� ����
        System.out.println("===============GAME START================");
        System.out.println("��� ���ðڽ��ϱ�? ����[1] ����[2] ��[3]");
        for(int i = 0;i < coin;i++) {
            //1~3�� ���� ����
            int computer =(int)(Math.random()*3)+1;
            //����� �Է°�
            int user = sc.nextInt();
            //��ǻ�� ��
            if(computer == 1) {
                comStr="����";
            }else if(computer == 2) {
                comStr="����";
            }else if(computer == 3) {
                comStr="��";
            }else {
                comStr="�ý��� ����";
            }
            //������ ��
            if(user == 1) {
                userStr="����";
            }else if(user == 2) {
                userStr="����";
            }else if(user == 3) {
                userStr="��";
            }else {
                userStr="�հ��� ����";
            }
            System.out.println("[����] "+userStr+"  =VS= "+comStr+" [��ǻ��]");
            if(user >= 1 && user <= 3) {
                if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
                    win++;
                    System.out.println("[�¸�]");
                }else if(computer == user) {
                    lose++;
                    System.out.println("[���º�]");
                }else {
                    draw++;
                    System.out.println("[�й�]");
                }
            }else {
                fail++;
                System.out.println("���� �߸� �Է� �Ͽ����ϴ�.");    
            }
            System.out.println("=========================================");
        }
        // �¸� / (�� ���) x 100
        float odds = ((float)win/(float)(coin))*100;
        
        System.out.println("[���] ���� Ƚ�� : " +coin);
        System.out.println("[����] win:"+win+"��, lose:"+lose+"��, draw:"+draw+"��, ��ȿ:"+fail+"��");
        System.out.printf("[�·�] %.2f%% \n",odds);
        System.out.println("================GAME END=================");
        sc.close();
    }
}
