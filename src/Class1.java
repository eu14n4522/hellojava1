import java.util.Scanner;

public class Class1 {
    public static void main(String args[]) {
        String op,again = null;
        double x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("����"); 
        while(true)
        {
            System.out.print("�Է��� ");
            op = in.nextLine();
            if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")) { //��Ģ���� ��ȣ�϶��� �Ʒ� ���� ����
                System.out.print("�Ǽ� 1 : ");
                x = in.nextDouble();
                System.out.print("�Ǽ� 2 : ");
                y = in.nextDouble();
                System.out.print("�Ǽ� 3 : ");
                x = in.nextDouble();
                System.out.print("�Ǽ� 4 : ");
                y = in.nextDouble();
                System.out.print("�Ǽ� 5 : ");
                x = in.nextDouble();
                System.out.print("�Ǽ� 6 : ");
                y = in.nextDouble();
                System.out.print("�Ǽ� 7 : ");
                x = in.nextDouble();
                System.out.print("�Ǽ� 8 : ");
                y = in.nextDouble();
                System.out.print("�Ǽ� 9 : ");
                x = in.nextDouble();
                System.out.print("�Ǽ� 10 : ");
                y = in.nextDouble();
                System.out.print("�Ǽ� 11 : ");
                x = in.nextDouble();
                System.out.print("�Ǽ� 12 : ");
                y = in.nextDouble();

                if (op.equals("+"))
                    System.out.println("1" + (x + y));
                else if (op.equals("-"))
                    System.out.println("���� ��� : " + (x - y));
                else if (op.equals("*"))
                    System.out.println("���� ��� : " + (x * y));
                else if (op.equals("/")) {
                    if (y == 0)
                        System.out.println("0���� ���� �� �����ϴ�.");
                    else
                        System.out.println("������ ��� : " + (x / y));
                }

                in.nextLine(); // ���ڸ� �Է¹��� �� ���ڸ� �Է¹��� �� ���� ���� ���� ���� ���
                System.out.print("�ٸ� ��� �ѹ� ��??(Y/N)");
                again = in.nextLine();
                if (again.toLowerCase().equals("n")) { // 'n'�� �Էµ� ���� �����ϴ°����� ó��.
                    System.out.println("���⸦ �����մϴ�. �̿����ּż� �����մϴ�."); 
                    break;
                }
            }
            else System.out.println("�߸� �Է��ϼ̳׿�. +,-,*,/ �߿��� �Է��ϼ���!"); // ��Ģ���� ��ȣ�� �ƴ� �� ���
        }
    }
}

