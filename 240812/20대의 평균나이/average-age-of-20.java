import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0, avg;
        int cnt = 0;

        while (true) {
            n = sc.nextInt();
            if (n >= 30||n<20)
                break;
            sum += n;
            cnt++;
        }

        if (cnt != 0) {
            avg = sum / cnt;
            System.out.printf("%.2f", avg);
        }
    }
}