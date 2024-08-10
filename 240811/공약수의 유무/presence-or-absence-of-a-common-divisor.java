import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    boolean c=false;
    for(int i=a;i<=b;i++){
        if(1920%i==0&&2880%i==0){
            c=true;
            break;
        }
    }
    if(c)
        System.out.println("1");
        else
        System.out.println("0");
    }
}