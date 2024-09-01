import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[][] a=new int[5][5];
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            if(i==0||j==0)
            a[i][j]=1;
        }
    }
    for(int i=1;i<5;i++){
        for(int j=1;j<5;j++){
            a[i][j]=a[i-1][j]+a[i][j-1];
        }
    }
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    }
}