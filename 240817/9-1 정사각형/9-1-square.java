import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(cnt%10);
                if(cnt%10==1)
                cnt=9;
                else
                cnt--;
            }
            System.out.println("");
        }
    }
}