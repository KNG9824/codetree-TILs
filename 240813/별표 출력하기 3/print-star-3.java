import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 첫 번째 줄부터 n번째 줄까지 패턴을 출력
        for (int i = 0; i < n; i++) {
            // 앞에 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // 별 출력
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}