import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        if(i==0||i==n-1){
            for(int j=0;j<n;j++)
            System.out.print("* ");
        }
        else{
            for(int j=0;j<i;j++)
            System.out.print("* ");
            for(int p=0;p<2*n-2*i-2;p++)
            System.out.print(" ");
            System.out.print("*");
        }
    System.out.println("");
    }
    }
}