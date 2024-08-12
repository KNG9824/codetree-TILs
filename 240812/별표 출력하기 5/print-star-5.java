import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            for(int h=0;h<n-i;h++){
                System.out.print("*");
            }
            System.out.printf(" ");
        }
        System.out.println("");
    }
    }
}