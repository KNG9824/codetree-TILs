import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
            
          for(int i=0;i<n;i++){
            int a=11+2*i;
            for(int j=0;j<n;j++){
                    
                    System.out.print(a+" ");
                    a+=2;
            }
            
            System.out.println("");
          }     
    
    }
}