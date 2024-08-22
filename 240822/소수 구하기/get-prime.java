import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<=n;i++){
        int cnt=0;
        for(int j=1;j<=i;j++){
            if(i%j==0)
            cnt++;
        }
        if(cnt==2)
        System.out.print(i+" ");
    }
    }
}