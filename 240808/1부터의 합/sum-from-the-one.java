import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 정수 n을 입력받습니다.
        int n = sc.nextInt();
        
        // 합을 저장할 변수
        int sum = 0;
        
        // 마지막에 더해진 숫자를 저장할 변수
        int lastNumber = 0;
        
        // 1부터 100까지의 숫자를 더해가면서 조건을 확인합니다.
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum >= n) {
                lastNumber = i;
                break;
            }
        }
        
        // 결과 출력
        System.out.println(lastNumber);
    }
}