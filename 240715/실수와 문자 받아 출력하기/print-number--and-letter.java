import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    double a,b;
    char c;
    a=sc.nextDouble();  
    b=sc.nextDouble();
    c=sc.next().charAt(0);
    System.out.println(c);
    System.out.printf("%.2f\n",a);
    System.out.printf("%.2f",b);
    }
}