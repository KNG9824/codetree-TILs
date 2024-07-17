import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    double sum,minus;
    sum=a+b;
    minus=a-b;
    System.out.printf("%.2f",sum/minus);
    }
}