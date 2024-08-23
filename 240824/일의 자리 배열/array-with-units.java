import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=new int[10];
    for(int i=0;i<2;i++)
    a[i]=sc.nextInt();
    for(int i=2;i<10;i++){
        a[i]=(a[i-1]+a[i-2])%10;
    }
    for(int i=0;i<10;i++)
    System.out.print(a[i]+" ");
    }
}