import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    sc.useDelimiter("-");
    int mm=sc.nextInt();
    int dd=sc.nextInt();
    
    int yyyy=sc.nextInt();
    System.out.println(yyyy+"."+mm+"."+dd);
    }
}