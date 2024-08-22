import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int cnt=0;
    int[] a=new int[101];
    int sum=0;
    for(int i=0;i<101;i++){
        a[i]=sc.nextInt();
        if(a[i]!=0)
        cnt++;
        else{
            sum=a[cnt-1]+a[cnt-2]+a[cnt-3];
            break;
        }
    }
    System.out.print(sum);
    }
}