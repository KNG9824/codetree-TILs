import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner를 사용하여 사용자로부터 입력받기
        Scanner sc = new Scanner(System.in);
        
        // 두 정수 a와 b를 입력받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a와 b의 크기에 따라 반복문을 설정하여 홀수를 내림차순으로 출력
        
            for (int i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        
    }
}