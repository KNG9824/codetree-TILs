import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int max=0;
    int[] a=new int[10];
    a[0]=sc.nextInt();
    for(int i=1;i<10;i++){
        a[i]=sc.nextInt();
        if(a[i]>a[i-1])
        max=a[i];
    }
    System.out.print(max);
    }
}