import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        // 첫 번째 값을 입력받고 min으로 설정
        a[0] = sc.nextInt();
        int min = a[0];
        int cnt = 1; // 첫 번째 값으로 초기화했으므로 최소값 개수를 1로 시작
        
        // 두 번째 원소부터 비교 시작
        for (int i = 1; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < min) {
                min = a[i];
                cnt = 1; // 새로운 최소값을 찾았으므로 개수를 1로 리셋
            } else if (a[i] == min) {
                cnt++; // 최소값과 동일한 값이 나올 때마다 개수 증가
            }
        }
        
        System.out.print(min + " " + cnt);
    }
}