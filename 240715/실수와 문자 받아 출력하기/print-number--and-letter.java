import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    char a;
        double b, c;

        // 입력
        a = sc.next().charAt(0);

        b = sc.nextDouble();
        c = sc.nextDouble();

        // 출력
        System.out.println(a);
        System.out.printf("%.2f\n%.2f", b, c);
    }
}