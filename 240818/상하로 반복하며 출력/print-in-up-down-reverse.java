import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            if(i%2==0){
            for(int j=0;j<n;j++)
                a[j][i]=j+1;
            }
            else{
                for(int j=0;j<n;j++)
                a[j][i]=n-j;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }
}