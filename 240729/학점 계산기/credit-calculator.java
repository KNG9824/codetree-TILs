import java.util.*;
public class Main {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double[] score=new double[n];
    double sum=0;
    for(int i=0;i<n;i++){
        score[i]=sc.nextDouble();
        sum+=score[i];
    }
    double avg=sum/n;
    switch((int)avg){
        case 4 : System.out.printf("%.1f\nPerfect",avg);break;
        case 3 : System.out.printf("%.1f\nGood",avg);break;
        default : System.out.printf("%.1f\nPoor",avg);
    }

        }
}