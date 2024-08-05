import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[] array=new int[10];
    int cnt=0,cnt2=0;
    for(int i=0;i<10;i++){
        array[i]=sc.nextInt();
        if(array[i]%3==0)
        cnt++;
        if(array[i]%5==0)
        cnt2++;
    }
    System.out.print(cnt+" "+cnt2);

    }
}