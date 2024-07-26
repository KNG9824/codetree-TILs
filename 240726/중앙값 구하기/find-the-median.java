import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int mid;
        if(a>b){
            if(b<c)
            mid=c;
            else
            mid=b;
        }
        if(a<b){
            if(a<c)
            mid=c;
            else
            mid=a;
        }
System.out.println(mid);
    }
}