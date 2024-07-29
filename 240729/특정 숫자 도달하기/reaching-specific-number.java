import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[] a=new int[10];
        for(int i=0;i<10; i++)
            a[i]=sc.nextInt();

    double avg=0;
    int sum=0;
        for(int i=0;i<10;i++){
            sum+=a[i];
        }
        avg=sum/10;
        System.out.printf("%d %.1f",sum, avg);

        }
}