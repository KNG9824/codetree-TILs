import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int[] c=new int[9];
    for(int i=0;i<9;i++)
    c[i]=0;
    for(int i=0;i<99;i++){
        int n=sc.nextInt();
        if(n==0)
        break;
        switch(n/10){
            case 9:c[8]++; break;
            case 8:c[7]++; break;
            case 7:c[6]++; break;
            case 6:c[5]++; break;
            case 5:c[4]++; break;
            case 4:c[3]++; break;
            case 3:c[2]++; break;
            case 2:c[1]++; break;
            case 1:c[0]++; break;
        }
    }
    for(int i=0;i<9;i++){
        System.out.println((i+1)+" - "+c[i]);
    }
    }
}