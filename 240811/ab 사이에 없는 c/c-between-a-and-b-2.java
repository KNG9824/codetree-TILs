import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int i;
    boolean d=false;
    for(i=a;i<=b;i++){
        if(i%c==0){
            d=true;
            break;
        }
    }
    if(d)
    System.out.print("NO");
    else
    System.out.print("YES");
    }
}