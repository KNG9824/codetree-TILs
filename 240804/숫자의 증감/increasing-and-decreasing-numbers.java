import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int n=sc.nextInt();

        if(c=='A'){
            for(int i=0;i<n;i++)
            System.out.print((i+1)+" ");
        }
        else{
            for(int i=n;i>0;i--)
            System.out.print(i+" ");
    }
}
}