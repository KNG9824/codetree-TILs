import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] array=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
    array[i]=sc.nextInt();
    if(array[i]%2!=0&&array[i]%3==0)
    sum+=array[i];
    }
    System.out.print(sum);
    }
}