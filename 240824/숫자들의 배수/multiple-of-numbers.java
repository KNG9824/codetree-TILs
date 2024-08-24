import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int[] a=new int[10];
    int cnt=0;
    for(int i=0;i<10;i++){
        a[i]=n*(i+1);
        System.out.print(a[i]+" ");
        if(a[i]%5==0)
        cnt++;
        if(cnt==2)
        break;
    }
    }
}