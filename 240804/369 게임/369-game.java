import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || contains369(i)) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean contains369(int number) {
        String str = String.valueOf(number);
        return str.contains("3") || str.contains("6") || str.contains("9");
    }
}