import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int cnt=0;
    for(int i=0;i<n;i++){
        int b=sc.nextInt();
        if(b%2==0){
        a[cnt]=b;
        cnt++;
        }
    }
    for(int j=cnt-1;j>=0;j--)
    System.out.print(a[j]+" ");
    }
}