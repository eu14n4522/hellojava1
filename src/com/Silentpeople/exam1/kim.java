package com.Silentpeople.exam1;


//import java.util.Scanner;
//class kim {
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		int user=0, computer=0;
//		String User=null, Computer = null;
//		System.out.println("���� ���� �� ���α׷��Դϴ�.");
//		while(user!=5)
// 		{
//			System.out.println("\n���� ���� �� !(1:���� 2:���� 3:��), �����Ϸ��� 5");
//			user=sc.nextInt();
//			computer=(int)(Math.random()*4);
//			switch(user){
//			case 1:	User="����";	break;
//			case 2:	User="����";	break;
//			case 3:	User="��";	break;}
//			switch(computer){
//			case 1:	Computer="����";	break;
//			case 2:	Computer="����";	break;
//			case 3:	Computer="��";	break;}
//			
//			System.out.println("[U:"+User+"] VS [C:"+Computer+"]");
//			
//			if(Math.abs(user-computer)==0){System.out.println("�����ϴ� ~");}
//			else if(Math.abs(user-computer)==1)
//			{
//				if(user-computer<0){System.out.println("�����ϴ� ��");}
//				else{System.out.println("�̰���ϴ� !");	}
//			}
//			else if(Math.abs(user-computer)==2)
//			{
//				if(user-computer<0)	{System.out.println("�̰���ϴ� !");	}
//				else{System.out.println("�����ϴ� ��");}
//					
//			}
//		}
//		System.out.println("�����մϴ�.");
//			
//	}
//}





//
//import java.util.*;
//
//public class kim {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		Random random = new Random();
//		String input = "";
//
//		while(true) {
//			System.out.print("�Է� (����� exit, ������ 0, ������ 1, ���� 2) : ");
//			input = scan.nextLine();
//			if(input.equals("exit")) break;
//
//			int user = Integer.parseInt(input);
//			int com = random.nextInt() % 3;
//
//			if(user < 0 || user > 2) {
//				System.out.println();
//				continue;
//			}
//
//			if(user < 0) user = user * -1;
//			if(com < 0) com = com * -1;
//
//			LinkedHashMap table = new LinkedHashMap();
//			table.put("1", "����");
//			table.put("2", "����");
//			table.put("3", "��");
//
//			Object value1 = table.get(String.valueOf(user));
//			System.out.println("����� " + value1 + "�� �½��ϴ�.");
//
//			Object value2 = table.get(String.valueOf(com));
//			System.out.println("��ǻ�ʹ� " + value2 + "�� �½��ϴ�.");
//
//			System.out.println("---------------------------");
//			System.out.print("���� ��� : ");
//
//			if(user == com) System.out.println("���.");
//			else if(user == (com+1) % 3) System.out.println("�̱�.");
//			else System.out.println("����.");
//			
//			System.out.println("============================");
//			System.out.println();
//		}
//		System.out.println("��������");
//
//	}
//
//}



import java.util.Scanner;

public class kim {

   public static void main(String [] args) {
      int num1, num2;
      char c1, c2;
      
      
      System.out.println("�Է��� �����ϼ���!!");
      Scanner scan = new Scanner(System.in);  // Ű����κ��� �� �Է¹��� �غ��ϱ�

      num1 = scan.nextInt();
      //System.out.println(num1);

      c1 = scan.next().charAt(0);
//      System.out.println(c1);
   
      num2 = scan.nextInt();
//      System.out.println(num2);

      c2 = scan.next().charAt(0);
//      System.out.println(c2);

      if(c1 == '+'){
         //c1�� �Էµ� ���ڰ� +�̸� ������ ����
         System.out.println(num1 + num2);   
      }
      else if(c1 == '-'){
         //c1�� �Էµ� ���ڰ� -�̸� ������ ����
    	  System.out.println(num1 - num2);
      }
      else if (c1 == '*') {
         //c1�� �Էµ� ���ڰ� *�̸� ������ ����
    	  System.out.println(num1 * num2);
      }
      else if (c1 == '/') {
         //c1�� �Էµ� ���ڰ� /�̸� ������ ����
    	  System.out.println(num1 / num2);
      }
   }
   
   
}






//
//import java.util.Scanner;
//
//public class kim {
//
//   public static void main(String [] args) {
//      
//      String calStr;
//            
//      System.out.println("�Է��� �����ϼ���!!");
//      Scanner scan = new Scanner(System.in);  // Ű����κ��� �� �Է¹��� �غ��ϱ�
//
//      calStr = scan.nextLine(); // 1+2=
//      System.out.println(calStr);
//      
//      String sign = calStr.substring(1, 2);
//      System.out.println(sign);
//      
//      switch (sign) {
//      
//      case "+": 
//         // +������ �� ó���� �ڵ�
//         String [] num1 = calStr.split("\\+");
//         String [] num2 = num1[1].split("\\=");
//         int n1 = Integer.parseInt(num1[0]);
//         int n2 = Integer.parseInt(num2[0]);
//         System.out.println(n1+n2);
//         break;
//      case "-":
//         // -������ �� ó���� �ڵ�
//         break;
//      case "*": 
//         // *������ �� ó���� �ڵ�
//         break;
//      case "/": 
//         // /������ �� ó���� �ڵ�
//         break;
//      default:
//         // +-*/�� �ƴ� ���� �ԷµǾ��� �� ó���� �ڵ�
//         System.out.println("+-*/ �߿� �Է��� �ּ���");
//         break;
//      
//         
//      }
//      
//      
//      
//      }
      
/*      String [] num1 = calStr.split("\\+");
      String [] num2 = num1[1].split("\\=");
      
      int n1 = Integer.parseInt(num1[0]);
      int n2 = Integer.parseInt(num2[0]);
      
      System.out.println(n1);
      System.out.println(n2);
      
      System.out.println(n1+n2);
*/      
      
/*      String str = "1+2=";
      String[] split = str.split("\\+");
      String[] split2 = split[1].split("\\=");
      System.out.println("split: " + split[0]);
      System.out.println("split: " + split[1]);
      System.out.println("split: " + split2[0]);
*/      
      
/*      if(c1 == '+'){
         //c1�� �Էµ� ���ڰ� +�̸� ������ ����
         System.out.println(num1 + num2);   
      }
      else if(c1 == '-'){
         //c1�� �Էµ� ���ڰ� -�̸� ������ ����
      }
      else if (c1 == '*') {
         //c1�� �Էµ� ���ڰ� *�̸� ������ ����
      }
      else if (c1 == '/') {
         //c1�� �Էµ� ���ڰ� /�̸� ������ ����
      }*/
//}
   
   









