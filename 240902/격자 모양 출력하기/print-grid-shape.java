import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] a=new int[n][n];
    for(int i=0;i<m;i++){
        int e=sc.nextInt();
        int f=sc.nextInt();
        if(e<=n&&f<=n)
        a[e-1][f-1]=1;
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(a[i][j]==1){
                a[i][j]=(i+1)*(j+1);
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(a[i][j]+" ");
            
        }
        System.out.println();
    }
    }
}