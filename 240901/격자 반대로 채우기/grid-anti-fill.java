import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        int num = 1;
        for (int col = n - 1; col >= 0; col--) {
            if ((n - col) % 2 == 1) { // 홀수 번째 열 (맨 마지막 열에서부터 홀수 번째 열일 때)
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = num++;
                }
            } else { // 짝수 번째 열
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = num++;
                }
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}