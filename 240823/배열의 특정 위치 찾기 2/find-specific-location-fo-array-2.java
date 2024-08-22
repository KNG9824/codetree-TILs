import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[] a=new int[10];
    int sum1=0,sum2=0;
    for(int i=0;i<10;i++){
        a[i]=sc.nextInt();
        if(i%2==0)
        sum1+=a[i];
        else
        sum2+=a[i];

    }
    if(sum2>sum1)
    System.out.println(sum2-sum1);
    else
    System.out.println(sum1-sum2);
    }
}