import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    for(int i=2;i<9;i+=2){
        for(int j=b;j>=a;j--){
            if(j==a)
            System.out.print(j+" * "+i+" = "+i*j);
            else
            System.out.print(j+" * "+i+" = "+i*j+" / ");
        }
        System.out.println("");
    }
    }
}