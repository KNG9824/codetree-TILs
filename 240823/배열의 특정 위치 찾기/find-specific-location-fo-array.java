import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
    int[] a=new int[10];
    double sum1=0,sum2=0,avg;
    for(int i=0;i<10;i++){
        a[i]=sc.nextInt();
        if(i%2!=0)
        sum1+=a[i];
        else if(i%3==2)
        sum2+=a[i];
    }
    avg=sum2/3;
    System.out.printf("%d %.1f",(int)sum1, avg);
    }
}