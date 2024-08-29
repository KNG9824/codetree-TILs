import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[][] a=new int[3][3];
    int[][] b=new int[3][3];
    int cnt=1;
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++)
        a[i][j]=sc.nextInt();
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++)
        b[i][j]=sc.nextInt();
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++)
        System.out.print((a[i][j]*b[i][j])+" ");
        System.out.println();
    }
    }
}