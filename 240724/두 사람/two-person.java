import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int aa=sc.nextInt();
    char as=sc.nextInt();
    int ba=sc.nextInt();
    char bs=sc.nextInt();
    if((as=='M')&&(aa>=19)||(bs=='M')&&(ba>=19))
        System.out.println("1");
    else
        System.out.println("0");
    }
}