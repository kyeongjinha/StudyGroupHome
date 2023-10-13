import java.util.Scanner;

public class plusOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("0 ~ 10 사이의 정수를 입력하세요. : ");
            int num1 = sc.nextInt();

            if (10 < num1 || 0 > num1) {
                System.out.println("정수를 잘못 입력 하셨습니다. 0~ 10 사이의 정수를 입력하세요.");
                continue;
            }
            System.out.print("0 ~ 10 사이의 정수를 한 개 더 입력하세요. : ");
            int num2 = sc.nextInt();

            if (10 < num2 || 0 > num2) {
                System.out.println("정수를 잘못 입력 하셨습니다. 0 ~ 10 사이의 정수를 입력하세요.");
                continue;
            }

            int result = num1 + num2;

            {
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            }
        }
    }
}
