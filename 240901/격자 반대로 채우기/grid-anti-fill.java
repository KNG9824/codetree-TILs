import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        int num = 1;
        for (int col = n - 1; col >= 0; col--) {
            if (col % 2 == 0) { // 짝수 열일 때 (오른쪽에서 왼쪽으로 위로 올라감)
                for (int row = 0; row < n; row++) {
                    arr[row][col] = num++;
                }
            } else { // 홀수 열일 때 (왼쪽에서 오른쪽으로 아래로 내려감)
                for (int row = n - 1; row >= 0; row--) {
                    arr[row][col] = num++;
                }
            }
        }
        
        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}