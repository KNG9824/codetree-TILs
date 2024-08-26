import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int cnt=1,c2=0;
    int tn=0;
    for(int i=0;i<n;i++){
        if(a[i]==2){
            cnt++;
            c2++;
        }
        else
        cnt++;
        if(c2==3)
        tn=i;
    }
    System.out.print(tn-1);
    }
}