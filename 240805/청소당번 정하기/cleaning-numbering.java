import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int classroomCleaningCount = 0;
        int hallwayCleaningCount = 0;
        int restroomCleaningCount = 0;

        for (int day = 1; day <= n; day++) {
            boolean classroom = (day % 2 == 0);
            boolean hallway = (day % 3 == 0);
            boolean restroom = (day % 12 == 0);

            if (restroom) {
                restroomCleaningCount++;
            } else if (hallway) {
                hallwayCleaningCount++;
            } else if (classroom) {
                classroomCleaningCount++;
            }
        }

        System.out.println(classroomCleaningCount + " " + hallwayCleaningCount + " " + restroomCleaningCount);
    }
}