import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int a = sc.nextInt();
        
        int b = sc.nextInt();

        // Perform the division and store the result as a string
        String result = String.format("%.21f", (double) a / b);

        // Find the position of the 21st decimal place and truncate the result
        int dotIndex = result.indexOf('.');
        String truncatedResult = result.substring(0, dotIndex + 21); // 21 decimal places + 1 for the dot

        // Print the result
        System.out.println(truncatedResult);
    }
}