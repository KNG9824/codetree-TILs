import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int num = n;
        
        while (true) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            
            // 최댓값 찾기
            for (int i = 0; i < num; i++) {
                if (a[i] > max) {
                    max = a[i];
                    maxIndex = i;
                }
            }
            
            System.out.print((maxIndex + 1) + " ");
            
            if (maxIndex == 0) {
                break;  // 첫 번째 원소가 처리되면 종료
            }
            
            num = maxIndex;  // 왼쪽 범위로 제한
        }
    }
}