import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n년 간의 자동차 가격 정보
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < n; i++) {
            // 현재 가격에서 이전까지의 최소 가격을 뺀 이익 계산
            int profit = prices[i] - minPrice;
            // 최대 이익 업데이트
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            // 현재 가격이 최소 가격보다 낮다면, 최소 가격을 갱신
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        System.out.println(maxProfit);
    }
}