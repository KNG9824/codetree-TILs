import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[100];
    a[0]=1;
    a[1]=n;
    System.out.print(a[0]+" "+a[1]+" ");
    for(int i=2;i<100;i++){
        a[i]=a[i-1]+a[i-2];
        System.out.print(a[i]+" ");
        if(a[i]>100)
        break;
    }
    }
}