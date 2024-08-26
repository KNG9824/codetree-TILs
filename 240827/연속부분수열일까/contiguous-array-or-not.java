import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] A = new int[n1];
        int[] B = new int[n2];

        // A와 B 배열 입력 받기
        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }

        boolean isSubsequence = false;

        // A의 각 위치에서 B를 비교
        for (int i = 0; i <= n1 - n2; i++) {
            boolean match = true;
            for (int j = 0; j < n2; j++) {
                if (A[i + j] != B[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                isSubsequence = true;
                break;
            }
        }

        if (isSubsequence) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}