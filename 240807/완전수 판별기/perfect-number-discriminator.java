import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=1;
    for (int i = 2; i * i < n && sum <= n; i++){
		if (n % i == 0) 
        sum += i + n / i;}
        if(sum==n)
            System.out.println("P");
        else
            System.out.println("N");
        

    }
}