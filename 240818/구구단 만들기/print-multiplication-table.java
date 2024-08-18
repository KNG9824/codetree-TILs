import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<=9;i++){
            for(int j=b;j>=a;j--){
                if(j%2==0){
                    if(j==a)
                    System.out.print(j+" * "+i+" = "+j*i);
                    else
                    System.out.print(j+" * "+i+" = "+j*i+" / ");
                }
                
            }
            System.out.println("");
        }
    }
}