import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    char[] c=new char[6];
    c[0]='L';
    c[1]='E';
    c[2]='B';
    c[3]='R';
    c[4]='O';
    c[5]='S';
    while(true){
        char n=sc.next().charAt(0);
        if(n=='L')
        System.out.print("0");
        else if(n=='E')
        System.out.print("1");
        else if(n=='B')
        System.out.print("2");
        else if(n=='R')
        System.out.print("3");
        else if(n=='O')
        System.out.print("4");
        else if(n=='S')
        System.out.print("5");
        else
        System.out.print("None");
        break;
    }
    }
}