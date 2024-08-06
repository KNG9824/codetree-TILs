import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[] a=new int[10];
    double sum=0, avg;
    for(int i=0;i<10;i++){
    a[i]=sc.nextInt();
    sum+=a[i];
    }
    avg=sum/10;
    System.out.print((int)sum+" "+avg)
    }
}