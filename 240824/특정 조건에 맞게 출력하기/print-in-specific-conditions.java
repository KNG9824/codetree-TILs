import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[] a=new int[100];
    int cnt=1;
    for(int i=0;i<100;i++){
        a[i]=sc.nextInt();
        cnt++;
        if(a[i]==0)
        break;
    }
    for(int i=0;i<cnt-2;i++){
        if(a[i]%2==0)
        System.out.print(a[i]/2+" ");
        else
        System.out.print((a[i]+3)+" ");
    }

    }
}