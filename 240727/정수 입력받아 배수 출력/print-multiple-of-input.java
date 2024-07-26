import java.util.*;
public class Main {
    public static void main(String[] args) {
    
        // 여기에 코드를 작성해주세요.
    Scaner sc=new Scaner(System.in);
    int n=sc.nextInt();
    for(int i=n;i<=n*5;i*=n)
        System.out.print(i+" ");
    }
}