import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int cnt=1;
    for(int i=0;i<n;i++){
        for(int p=0;p<i;p++)
        System.out.print("  ");
        for(int j=0;j<n-i;j++){
        System.out.print(cnt%10+" ");
        if(cnt==9)
        cnt+=2;
        else
        cnt++;
    }
    System.out.println("");
    }
    }
}