import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[] a=new int[5];
    int cnt=0;
    for(int i=0;i<5;i++){
        a[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++){
        if(a[i]%3==0)
        cnt++l;
    }
    if(cnt==5)
    System.out.print("1");
    else
    System.out.print("0");
    }
}