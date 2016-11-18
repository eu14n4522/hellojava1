import java.util.Scanner;

public class Class1 {
    public static void main(String args[]) {
        String op,again = null;
        double x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("계산기"); 
        while(true)
        {
            System.out.print("입력해 ");
            op = in.nextLine();
            if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")) { //사칙연산 기호일때만 아래 내용 실행
                System.out.print("실수 1 : ");
                x = in.nextDouble();
                System.out.print("실수 2 : ");
                y = in.nextDouble();
                System.out.print("실수 3 : ");
                x = in.nextDouble();
                System.out.print("실수 4 : ");
                y = in.nextDouble();
                System.out.print("실수 5 : ");
                x = in.nextDouble();
                System.out.print("실수 6 : ");
                y = in.nextDouble();
                System.out.print("실수 7 : ");
                x = in.nextDouble();
                System.out.print("실수 8 : ");
                y = in.nextDouble();
                System.out.print("실수 9 : ");
                x = in.nextDouble();
                System.out.print("실수 10 : ");
                y = in.nextDouble();
                System.out.print("실수 11 : ");
                x = in.nextDouble();
                System.out.print("실수 12 : ");
                y = in.nextDouble();

                if (op.equals("+"))
                    System.out.println("1" + (x + y));
                else if (op.equals("-"))
                    System.out.println("뺄셈 결과 : " + (x - y));
                else if (op.equals("*"))
                    System.out.println("곱셈 결과 : " + (x * y));
                else if (op.equals("/")) {
                    if (y == 0)
                        System.out.println("0으로 나눌 수 없습니다.");
                    else
                        System.out.println("나눗셈 결과 : " + (x / y));
                }

                in.nextLine(); // 숫자를 입력받은 후 문자를 입력받을 때 버퍼 값을 비우기 위해 사용
                System.out.print("다른 계산 한번 더??(Y/N)");
                again = in.nextLine();
                if (again.toLowerCase().equals("n")) { // 'n'이 입력될 때만 종료하는것으로 처리.
                    System.out.println("계산기를 종료합니다. 이용해주셔서 감사합니다."); 
                    break;
                }
            }
            else System.out.println("잘못 입력하셨네요. +,-,*,/ 중에서 입력하세요!"); // 사칙연산 기호가 아닐 때 출력
        }
    }
}

