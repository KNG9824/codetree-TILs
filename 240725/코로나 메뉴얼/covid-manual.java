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
    char A,B,C;
    if(aa=='Y'&&a>=37)
         A='A';
    else if(aa=='N'&&a>=37)
         A='B';
    else if(aa=='Y'&&a<37)
         A='C';
    else
         A='D';

    if(bb=='Y'&&b>=37)
         B='A';
    else if(bb=='N'&&b>=37)
         B='B';
    else if(bb=='Y'&&b<37)
         B='C';
    else
         B='D';
    
    if(cc=='Y'&&c>=37)
         C='A';
    else if(cc=='N'&&c>=37)
         C='B';
    else if(cc=='Y'&&c<37)
         C='C';
    else
         C='D';
    
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