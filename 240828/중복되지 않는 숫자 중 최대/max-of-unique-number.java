import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 숫자의 개수
        int[] numbers = new int[N];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // 숫자 입력과 빈도 계산
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
            frequencyMap.put(numbers[i], frequencyMap.getOrDefault(numbers[i], 0) + 1);
        }
        
        int maxUnique = Integer.MIN_VALUE;  // 중복되지 않는 최댓값
        
        // 중복되지 않는 숫자 중에서 최댓값 찾기
        for (int num : numbers) {
            if (frequencyMap.get(num) == 1 && num > maxUnique) {
                maxUnique = num;
            }
        }
        
        // 최댓값이 업데이트되지 않았다면 (중복되지 않는 숫자가 없을 경우)
        if (maxUnique == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(maxUnique);
        }
    }
}