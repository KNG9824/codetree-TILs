import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int max=0;
    int min=0;
    for(int i=0;i<100;i++){
        int n=sc.nextInt();
        if(n==999||n==-999)
        break;
        if(n>max)
        max=n;
        if(n<min)
        min=n;
    }
    System.out.print(max+" "+min);
    }
}