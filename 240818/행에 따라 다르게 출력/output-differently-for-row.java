import java.util.*; public class Main{ 
    public static void main(String[] args){ 
        // 여기에 코드를 작성해주세요. 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
            for(int j=0;j<n;j++){
                cnt++;
                System.out.print(cnt+" ");
            }
        }
        else{
            for(int j=0;j<n;j++){
                cnt+=2;
                System.out.print(cnt+" ");
            }
        }
        System.out.println("");
        }
    } 
}