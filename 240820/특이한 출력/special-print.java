import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if((i+j)%4==0){
                System.out.print("("+i+", "+j+") ");
            System.out.println("");
            }
            else
            System.out.print("("+i+", "+j+") ");
        }
        
    }
    }
}