import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int mid=0;
        if(a>b){
            if(a<c)
            mid=a;
            else
            mid=c;
        }
        else if(a<b){
            if(b<c)
            mid=b;
            else
            mid=c;
        }
        System.out.println(mid);
    }
}