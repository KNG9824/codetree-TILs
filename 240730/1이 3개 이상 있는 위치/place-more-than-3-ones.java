import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 스캐너를 사용해 입력을 받습니다.
        Scanner sc = new Scanner(System.in);

        // 격자의 크기 n을 입력받습니다.
        int n = sc.nextInt();
        int[][] array = new int[n][n];

        // 격자 데이터를 입력받습니다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // 인접한 칸 중 숫자 1이 적혀 있는 칸의 수가 3개 이상인 곳의 개수를 셉니다.
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ones = 0;
                
                // 상
                if (i > 0 && array[i-1][j] == 1) ones++;
                // 하
                if (i < n - 1 && array[i+1][j] == 1) ones++;
                // 좌
                if (j > 0 && array[i][j-1] == 1) ones++;
                // 우
                if (j < n - 1 && array[i][j+1] == 1) ones++;

                if (ones >= 3) {
                    count++;
                }
            }
        }

        // 결과를 출력합니다.
        System.out.print(count);
    }
}