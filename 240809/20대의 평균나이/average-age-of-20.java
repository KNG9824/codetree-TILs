import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    double sum=0, avg;
    int cnt=0;
    int n;
    while(true){
         n=sc.nextInt();
        if(n<30){
        sum+=n;
        cnt++;
        }
        else
        break;
    }
    if(cnt!=0){
    avg=sum/cnt;
    System.out.printf("%.2f",avg);}
    
    }
}