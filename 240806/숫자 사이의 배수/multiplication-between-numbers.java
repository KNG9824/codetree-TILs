import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int cnt=0;
    double sum=0, avg=0;
    for(int i=a;i<=b;i++){
        cnt++;
        if(i%5==0||i%7==0)
        sum+=i;
    }
    avg=sum/cnt;
    System.out.print(sum+" "+avg);
    }
}