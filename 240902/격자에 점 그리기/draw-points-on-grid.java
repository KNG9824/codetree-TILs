import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] a=new int[n][n];
    int m=sc.nextInt();
    int cnt=1;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
        a[i][j]=0;
    }
    for(int i=0;i<m;i++){
        
        int e=sc.nextInt();
        int d=sc.nextInt();
        if(e<=n&&d<=n){
        a[e-1][d-1]=cnt;
        cnt++;
    }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
        System.out.print(a[i][j]+" ");
        System.out.println();
    }
    }
}