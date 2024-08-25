import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] c = new int[9];  // 0부터 8까지 인덱스 사용

        while (a > 1) {
            int remainder = a % b;
            a = a / b;

            // 나머지 값에 해당하는 카운트 증가
            c[remainder]++;
        }

        int sumOfSquares = 0;
        for (int i = 0; i < c.length; i++) {
            sumOfSquares += c[i] * c[i];
        }

        System.out.print(sumOfSquares);
    }
}