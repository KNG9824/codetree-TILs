import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[][] a=new int[4][4];
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++)
        a[i][j]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<4;i++){
        for(int j=0;j<i+1;j++){
            sum+=a[i][j];
        }
    }

    System.out.print(sum);
    }
}