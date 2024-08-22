import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[];
    int cnt=0;
    for(int i=0;i<n;i++){
        int a=sc.nextInt();
        if(a%2==0){
        a[cnt]=a;
        cnt++;
        }
    }
    for(int j=cnt;j>=0;j--)
    System.out.print(a[j]+" ");
    }
}