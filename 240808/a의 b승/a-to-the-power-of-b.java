import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int p=0;
    int c=a;
    for(int i=1;i<b;i++){
    c=a*c;
    }
        System.out.println(c);
    }
}