import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 수 입력받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c = sc.nextInt();

        // 중간값 찾기
        int middle = findMiddle(a, b, c);

        // 결과 출력
        System.out.println(middle);
    }

    public static int findMiddle(int a, int b, int c) {
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            return a;
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            return b;
        } else {
            return c;
        }
    }
}