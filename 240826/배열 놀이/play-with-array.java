import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력받기
        int n = sc.nextInt();  // 원소의 개수
        int q = sc.nextInt();  // 질의의 개수
        
        int[] arr = new int[n];  // 원소를 저장할 배열
        
        // 배열 원소 입력받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 질의 처리
        for (int i = 0; i < q; i++) {
            int queryType = sc.nextInt();
            
            if (queryType == 1) {
                // "1 a" -> a번째 원소를 출력
                int a = sc.nextInt();
                System.out.println(arr[a - 1]);  // 1-based index -> 0-based index
                
            } else if (queryType == 2) {
                // "2 b" -> 값이 b인 원소의 가장 작은 index 출력
                int b = sc.nextInt();
                int index = -1;
                
                for (int j = 0; j < n; j++) {
                    if (arr[j] == b) {
                        index = j + 1;  // 1-based index로 변환
                        break;
                    }
                }
                
                if (index == -1) {
                    System.out.println(0);  // 값이 존재하지 않으면 0 출력
                } else {
                    System.out.println(index);
                }
                
            } else if (queryType == 3) {
                // "3 s e" -> s번째 원소부터 e번째 원소까지 출력
                int s = sc.nextInt();
                int e = sc.nextInt();
                
                for (int j = s - 1; j < e; j++) {  // 1-based index -> 0-based index
                    System.out.print(arr[j]);
                    if (j < e - 1) {
                        System.out.print(" ");  // 마지막 원소 뒤에는 공백 추가하지 않음
                    }
                }
                System.out.println();  // 줄 바꿈
            }
        }
        
        sc.close();
    }
}