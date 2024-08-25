import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[] c=new int[3];
    char[] a=new char[3];
    int[] b=new int[4];
    for(int i=0;i<3;i++){
        a[i]=sc.next().charAt(0);
        c[i]=sc.nextInt();
        if(a[i]=='Y'&&a[i]>=37)
        b[0]++;
        else if(a[i]=='N'&&c[i]>=37)
        b[1]++;
        else if(a[i]=='Y'&&c[i]<37)
        b[2]++;
        else
        b[3]++;
    }
    for(int i=0;i<4;i++)
    System.out.print(b[i]+" ");
    if(b[0]>=2)
    System.out.print("E");
    }
}