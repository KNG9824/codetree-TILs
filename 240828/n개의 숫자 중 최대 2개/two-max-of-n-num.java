import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N개의 정수를 입력받습니다.
        int N = sc.nextInt();
        int[] numbers = new int[N];
        
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // 배열을 내림차순으로 정렬합니다.
        Arrays.sort(numbers);
        
        // 첫 번째와 두 번째 숫자를 출력합니다.
        System.out.println(numbers[N-1] + " " + numbers[N-2]);
    }
}