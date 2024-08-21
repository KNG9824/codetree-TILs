import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=0;
    for(int i=a;i<=b;i++){
        int cnt=0;
        for(int j=1;j<=i/2;j++){
            if(i%j==0)
            cnt++;
        }
        if(cnt==3)
        c++;
    }
    System.out.print(c);
    }
}