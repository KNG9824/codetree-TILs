import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] c = new int[b];  // b 크기의 배열 사용 (나머지 값이 0부터 b-1까지 발생 가능)

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