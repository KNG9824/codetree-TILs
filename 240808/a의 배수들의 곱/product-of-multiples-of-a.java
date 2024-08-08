import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=1;
        for(int  i=a;i<=b;i++){
            if(i%a==0)
            result*=i;
        }
        System.out.print(result);
    }
}