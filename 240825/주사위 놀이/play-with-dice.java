import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[] c=new int[6];
    for(int i=0;i<6;i++)
    c[i]=0;
    for(int i=0;i<10;i++){
        int n=sc.nextInt();
        switch(n){
            case 6:c[5]++; break;
            case 5:c[4]++; break;
            case 4:c[3]++; break;
            case 3:c[2]++; break;
            case 2:c[1]++; break;
            case 1:c[0]++; break;
        }
    }
    for(int i=0;i<6;i++){
        System.out.println((i+1)+" - "+c[i]);
    }
    }
}