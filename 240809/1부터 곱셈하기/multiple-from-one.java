import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=1, cnt=0;
    for(int i=1;i<=10;i++){
        num*=i;
        if(num>=n){
            cnt=i;
            break;
        }
    }
    System.out.print(cnt);
    }
}