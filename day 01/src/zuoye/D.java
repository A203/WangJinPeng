package zuoye;

import java.util.Scanner;

public class D {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        String numString="";
        switch(num)
        {
        	case 1:numString="����1��ѧ��";break;
        	case 2:numString="��ʾȫ��ѧ��";break;
        	case 3:numString="�˳�����";break;
        }
        if(num<1||num>3) 
        {
        	System.out.println("��Ч����");
        }
        else
        System.out.println(numString);
	}

}
