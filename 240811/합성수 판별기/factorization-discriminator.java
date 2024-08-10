import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i;
    boolean a=false;
    if(n>1){
    for(i=2;i<n;i++){
        if(n%i==0){
            a=true;
            break;
        }
    }
    if(a){
        System.out.print("C");
    }
    else
    System.out.print("N");
    }
}
}