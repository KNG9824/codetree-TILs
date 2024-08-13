import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int p=0;p<2*i;p++)
        System.out.print(" ");
        for(int j=0;j<2*n-2*i-1;j++){
            System.out.print("* ");
        }
        System.out.println("");
    }
    for(int i=0;i<n-1;i++){
        for(int p=0;p<2*(n-1)-2*i-2;p++)
        System.out.print(" ");
        for(int j=0;j<3+(2*i);j++){
            System.out.print("* ");
        }
        System.out.println("");
    }
    }
}