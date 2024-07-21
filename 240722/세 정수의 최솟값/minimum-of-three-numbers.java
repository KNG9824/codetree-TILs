import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int min=0;
    if(a<b){
        if(a<c)
        min=a;
        else
        min=c;
    }
    else{
        if(b<c)
        min=b;
        else
        min=c;
    }
    System.out.println(min);
    }
}