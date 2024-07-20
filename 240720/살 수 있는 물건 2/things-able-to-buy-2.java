import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();

    switch (a/500){
    case 6: System.out.println("book"); break;
    case 5: System.out.println("mask"); break;
    case 4:
    case 3:
    case 2:
    case 1: System.out.println("pen"); break;
    default: System.out.println("no");
    }
    }
}