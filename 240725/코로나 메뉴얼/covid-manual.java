import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    char aa=sc.next().charAt(0);
    int a=sc.nextInt();
    char bb=sc.next().charAt(0);
    int b=sc.nextInt();
    char cc=sc.next().charAt(0);
    int c=sc.nextInt();

    if(aa=='Y'&&a>=37)
        char A='A';
    else if(aa=='N'&&a>=37)
        char A='B';
    else if(aa=='Y'&&a<37)
        char A='C';
    else
        char A='D';

    if(bb=='Y'&&b>=37)
        char B='A';
    else if(bb=='N'&&b>=37)
        char B='B';
    else if(bb=='Y'&&b<37)
        char B='C';
    else
        char B='D';
    
    if(cc=='Y'&&c>=37)
        char C='A';
    else if(cc=='N'&&c>=37)
        char C='B';
    else if(cc=='Y'&&c<37)
        char C='C';
    else
        char C='D';
    
    if(A=='A'&&B=='A'&&C=='A')
        System.out.println("E");
    else if(A=='A'&&B=='A')
        System.out.println("E");
    else if(A=='A'&&C=='A')
        System.out.println("E");
    else if(B=='A'&&C=='A')
        System.out.println("E");
        else
        System.out.println("N");
    }
}