import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean c=false;
    for(int i=2;i<n;i++){
        if(n%i==0){
            c=true;
            break;
        }
    }
    if(c)
    System.out.print("C");
    else
    System.out.println("P");
    }
}