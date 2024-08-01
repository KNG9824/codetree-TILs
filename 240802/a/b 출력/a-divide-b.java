import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Perform the division
        double result = (double) a / b;

        // Convert the result to a string with sufficient precision
        String resultStr = String.format("%.22f", result);

        // Find the position of the 21st decimal place and truncate the result
        int dotIndex = resultStr.indexOf('.');

        // We need to check the 22nd decimal place to decide if we need to round down
        if (resultStr.charAt(dotIndex + 22) >= '5') {
            // Perform rounding down manually
            resultStr = resultStr.substring(0, dotIndex + 21) + (char) (resultStr.charAt(dotIndex + 21) + 1);
        } else {
            resultStr = resultStr.substring(0, dotIndex + 22);
        }

        // Remove trailing zeros and the dot if necessary
        resultStr = resultStr.replaceAll("0*$", "").replaceAll("\\.$", "");

        // Print the result
        System.out.println(resultStr);
    }
}