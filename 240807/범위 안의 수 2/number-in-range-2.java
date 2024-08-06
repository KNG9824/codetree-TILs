import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[] a=new int[10];
    double sum=0, avg;
    int cnt=0;
    for(int i=0;i<10;i++){
    a[i]=sc.nextInt();
    if(a[i]>0&&a[i]<=200){
    sum+=a[i];
    cnt++;}
    }
    avg=sum/cnt;
    System.out.printf("%d %.1f",(int)sum,avg);
    }
}