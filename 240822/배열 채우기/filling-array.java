import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[] a=new int[10];
    int cnt=0;
    for(int i=0;i<10;i++){
        a[i]=sc.nextInt();
        cnt++;
        if(a[i]==0){
            i=cnt;
        break;
        }
    }
    for(int j=cnt-2;j>=0;j--)
    System.out.print(a[j]+" ");
    }
}