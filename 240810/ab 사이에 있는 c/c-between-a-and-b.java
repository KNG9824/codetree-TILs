import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int cnt=0;
    for(int i=a;i<=b;i++){
        if(i%c==0)
        cnt++;
    }
    if(cnt>0)
    System.out.println("YES");
    else
    System.out.println("NO");
          }
}