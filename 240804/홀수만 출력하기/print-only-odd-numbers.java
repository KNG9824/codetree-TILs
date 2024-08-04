import java.util.*;
public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int[] array=new int[N];
    for(int i=0;i<N;i++){
        array[i]=sc.nextInt();

    }
    for(int i=0;i<N;i++){
        if(array[i]%2!=0&&array[i]%3==0)
        System.out.println(array[i]);
    }
    }
}