import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    double sum=0;
    double avg=0;
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        sum+=a[i];
    }
    avg=sum/10;
    System.out.printf("%d %.1f",(int)sum, avg);
    }
}