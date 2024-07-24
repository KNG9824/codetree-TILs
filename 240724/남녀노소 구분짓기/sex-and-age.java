import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int age=sc.nextInt();
    if(age>=19&&s==0)
    System.out.println("MAN");
    else if(age>=19&&s==1)
    System.out.println("WOMAN");
    else if(age<19&&s==0)
    System.out.println("BOY");
    else
    System.out.println("GIRL");

    }
}