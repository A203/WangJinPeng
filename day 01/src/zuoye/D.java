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
        	case 1:numString="增加1个学生";break;
        	case 2:numString="显示全部学生";break;
        	case 3:numString="退出程序";break;
        }
        if(num<1||num>3) 
        {
        	System.out.println("无效输入");
        }
        else
        System.out.println(numString);
	}

}
