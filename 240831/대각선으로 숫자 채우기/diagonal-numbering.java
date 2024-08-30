import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 행의 크기
        int m = sc.nextInt(); // 열의 크기

        int[][] array = new int[n][m];
        int num = 1;

        for (int diag = 0; diag < n + m - 1; diag++) {
            int startRow = Math.max(0, diag - m + 1);
            int startCol = Math.min(diag, m - 1);

            while (startRow < n && startCol >= 0) {
                array[startRow][startCol] = num++;
                startRow++;
                startCol--;
            }
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}