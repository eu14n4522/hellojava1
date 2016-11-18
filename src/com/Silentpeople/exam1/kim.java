package com.Silentpeople.exam1;


//import java.util.Scanner;
//class kim {
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		int user=0, computer=0;
//		String User=null, Computer = null;
//		System.out.println("가위 바위 보 프로그램입니다.");
//		while(user!=5)
// 		{
//			System.out.println("\n가위 바위 보 !(1:가위 2:바위 3:보), 종료하려면 5");
//			user=sc.nextInt();
//			computer=(int)(Math.random()*4);
//			switch(user){
//			case 1:	User="가위";	break;
//			case 2:	User="바위";	break;
//			case 3:	User="보";	break;}
//			switch(computer){
//			case 1:	Computer="가위";	break;
//			case 2:	Computer="바위";	break;
//			case 3:	Computer="보";	break;}
//			
//			System.out.println("[U:"+User+"] VS [C:"+Computer+"]");
//			
//			if(Math.abs(user-computer)==0){System.out.println("비겼습니다 ~");}
//			else if(Math.abs(user-computer)==1)
//			{
//				if(user-computer<0){System.out.println("졌습니다 ㅠ");}
//				else{System.out.println("이겼습니다 !");	}
//			}
//			else if(Math.abs(user-computer)==2)
//			{
//				if(user-computer<0)	{System.out.println("이겼습니다 !");	}
//				else{System.out.println("졌습니다 ㅠ");}
//					
//			}
//		}
//		System.out.println("종료합니다.");
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
//			System.out.print("입력 (종료는 exit, 가위는 0, 바위는 1, 보는 2) : ");
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
//			table.put("1", "가위");
//			table.put("2", "바위");
//			table.put("3", "보");
//
//			Object value1 = table.get(String.valueOf(user));
//			System.out.println("당신은 " + value1 + "를 냈습니다.");
//
//			Object value2 = table.get(String.valueOf(com));
//			System.out.println("컴퓨터는 " + value2 + "를 냈습니다.");
//
//			System.out.println("---------------------------");
//			System.out.print("게임 결과 : ");
//
//			if(user == com) System.out.println("비김.");
//			else if(user == (com+1) % 3) System.out.println("이김.");
//			else System.out.println("졌음.");
//			
//			System.out.println("============================");
//			System.out.println();
//		}
//		System.out.println("게임종료");
//
//	}
//
//}



import java.util.Scanner;

public class kim {

   public static void main(String [] args) {
      int num1, num2;
      char c1, c2;
      
      
      System.out.println("입력을 시작하세요!!");
      Scanner scan = new Scanner(System.in);  // 키보드로부터 값 입력받을 준비하기

      num1 = scan.nextInt();
      //System.out.println(num1);

      c1 = scan.next().charAt(0);
//      System.out.println(c1);
   
      num2 = scan.nextInt();
//      System.out.println(num2);

      c2 = scan.next().charAt(0);
//      System.out.println(c2);

      if(c1 == '+'){
         //c1에 입력된 문자가 +이면 실행할 내용
         System.out.println(num1 + num2);   
      }
      else if(c1 == '-'){
         //c1에 입력된 문자가 -이면 실행할 내용
    	  System.out.println(num1 - num2);
      }
      else if (c1 == '*') {
         //c1에 입력된 문자가 *이면 실행할 내용
    	  System.out.println(num1 * num2);
      }
      else if (c1 == '/') {
         //c1에 입력된 문자가 /이면 실행할 내용
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
//      System.out.println("입력을 시작하세요!!");
//      Scanner scan = new Scanner(System.in);  // 키보드로부터 값 입력받을 준비하기
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
//         // +기초일 때 처리할 코드
//         String [] num1 = calStr.split("\\+");
//         String [] num2 = num1[1].split("\\=");
//         int n1 = Integer.parseInt(num1[0]);
//         int n2 = Integer.parseInt(num2[0]);
//         System.out.println(n1+n2);
//         break;
//      case "-":
//         // -기초일 때 처리할 코드
//         break;
//      case "*": 
//         // *기초일 때 처리할 코드
//         break;
//      case "/": 
//         // /기초일 때 처리할 코드
//         break;
//      default:
//         // +-*/가 아닌 값이 입력되었을 때 처리할 코드
//         System.out.println("+-*/ 중에 입력해 주세요");
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
         //c1에 입력된 문자가 +이면 실행할 내용
         System.out.println(num1 + num2);   
      }
      else if(c1 == '-'){
         //c1에 입력된 문자가 -이면 실행할 내용
      }
      else if (c1 == '*') {
         //c1에 입력된 문자가 *이면 실행할 내용
      }
      else if (c1 == '/') {
         //c1에 입력된 문자가 /이면 실행할 내용
      }*/
//}
   
   









