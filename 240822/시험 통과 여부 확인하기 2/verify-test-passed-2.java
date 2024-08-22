import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int cnt=0;
    int[][] a=new int[n][4];
    for(int i=0;i<n;i++){
        double sum=0,avg;
        for(int j=0;j<4;j++){
            a[i][j]=sc.nextInt();
            sum+=a[i][j];
        }
        if(sum/4>=60){
        System.out.println("pass");
        cnt++;
        }
        else
        System.out.println("fail");
    }
    System.out.print(cnt);
    }
}