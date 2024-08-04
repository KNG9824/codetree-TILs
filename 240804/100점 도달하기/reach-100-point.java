import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n;i<=100;i++){
        switch(i/10){
            case 10:
            case 9: System.out.print("A "); break;
            case 8: System.out.print("B "); break;
            case 7: System.out.print("C "); break;
            case 6: System.out.print("D "); break;
            default: System.out.print("F ");
        }
    }
    }
}