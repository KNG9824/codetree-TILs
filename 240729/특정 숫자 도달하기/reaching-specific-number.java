import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        double avg = 0.0;
        int sum = 0;
        int count = 0;
        boolean found = false;

        for (int j = 0; j < 10; j++) {
            if (a[j] >= 250) {
                found = true;
                break;
            } else {
                sum += a[j];
                count++;
            }
        }

        if (count != 0) {
            avg = (double) sum / count;
        }

        System.out.printf("%d %.1f", sum, avg);
    }
}