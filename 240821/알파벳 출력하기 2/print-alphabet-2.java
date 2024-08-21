import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x='A';
    for(int i=0;i<n;i++){
        for(int p=0;p<i;p++)
        System.out.print("  ");
        for(int j=0;j<n-i;j++){
            if(x>'Z')
            x='A';
            System.out.print((char)x+" ");
            x++;
        }
        System.out.println();
    }
    }
}