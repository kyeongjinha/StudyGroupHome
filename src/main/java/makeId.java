import java.util.Scanner;

public class makeId {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("생성 할 아이디를 입력하세요, : ");
            String str1 = sc.next();

            String system = "joonas";

            if (str1.equals("joonas")) {
                System.out.println("이미 존재하는 아이디입니다.");
                continue;
            } else {
                System.out.println("당신의 아이디는 " + str1 + "입니다.");
                break;
            }
        }
    }
}
