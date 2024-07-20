import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    switch (a/10){
        case 9: System.out.println("A"); break;
        case 8: System.out.println("B"); break;
        case 7: System.out.println("C"); break;
        case 6: System.out.println("D"); break;
        default: System.out.println("F");
    }
    }
}