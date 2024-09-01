import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] a=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
           if(i==0||j==0)
           a[i][j]=1;
        }
    }

    for(int i=1;i<n;i++){
        for(int j=1;j<i+1;j++){
            a[i][j]=a[i-1][j-1]+a[i-1][j];
        }
    }
for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    }
}