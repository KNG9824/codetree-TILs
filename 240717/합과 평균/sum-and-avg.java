import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        double avg;
        sum=a+b;
        avg=sum/2.0;
        System.out.printf("%d %.1f",sum,avg);
    }
}