import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a>=3000)
    System.out.println("book");
    else if(a<1000)
    System.out.println("no");
    else
    System.out.println("mask");
    }
}