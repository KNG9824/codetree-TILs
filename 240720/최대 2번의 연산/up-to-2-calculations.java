import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // 첫 번째 과정: 짝수일 때 2로 나누기
        if (a % 2 == 0) {
            a /= 2;
        } 
        // 두 번째 과정: 첫 번째 과정 이후의 결과 처리
        if (a % 2 != 0) {
            a = (a + 1) / 2;
        }

        System.out.println(a);
    }
}