import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[] a=new int[10];
    for(int i=0;i<10;i++)
    a[i]=sc.nextInt();
    int max=0;
    int min=999;
    for(int i=0;i<10;i++){
        if(a[i]<500&&a[i]>max)
        max=a[i];
        if(a[i]>500&&a[i]<min)
        min=a[i];
    }
    System.out.print(max+" "+min);
    }
}