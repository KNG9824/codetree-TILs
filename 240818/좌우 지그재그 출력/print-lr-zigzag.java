import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int cnt=1;
    int[][] a=new int[n][n];
    for(int i=0;i<n;i++){
        if(i%2==0){
            for(int j=0;j<n;j++){
                a[i][j]=cnt;
                cnt++;
            }
        }
            else{
                for(int j=n-1;j>=0;j--){
                    a[i][j]=cnt;
                    cnt++;
                }
            }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
        System.out.print(a[i][j]+" ");
        System.out.println(" ");
    }
    }
}