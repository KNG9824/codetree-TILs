import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 숫자의 개수
        int[] arr = new int[n];

        // 배열 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDifference = Integer.MAX_VALUE;  // 차이의 최소값을 아주 큰 값으로 초기화

        // 인접한 숫자들 간의 차이 계산
        for (int i = 1; i < n; i++) {
            int difference = arr[i] - arr[i - 1];
            if (difference < minDifference) {
                minDifference = difference;
            }
        }

        // 결과 출력
        System.out.println(minDifference);
    }
}