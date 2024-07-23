import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int am=sc.nextInt();
    int ae=sc.nextInt();
    int bm=sc.nextInt();
    int be=sc.nextInt();

    if(am>bm)
        System.out.println("A");
    else if(am==bm){
        if(ae>be)
            System.out.println("A");
        else
            System.out.println("B");
    }
    else
    System.out.println("B");

    }
}