import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int dx=0, dy=0;
    char c;
    int a;
    for(int i=0;i<n;i++){
        c=sc.next().charAt(0);
        a=sc.nextInt();
        if(c=='N')
        dy+=a;
        else if(c=='E')
        dx+=a;
        else if(c=='S')
        dy-=a;
        else
        dx-=a;

    }
    System.out.print(dx+" "+dy);
    }
}