import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 명령어 입력받기
        String commands = sc.nextLine();
        int n = commands.length(); // 명령의 수를 명령어 문자열의 길이로 설정

        // 현재 위치 및 방향 초기화
        int x = 0, y = 0;
        String[] directions = {"N", "E", "S", "W"};
        int directionIndex = 0;  // 현재 방향: 0=북, 1=동, 2=남, 3=서

        // 명령 처리
        for (int i = 0; i < n; i++) {
            char command = commands.charAt(i);
            if (command == 'L') {
                // 왼쪽으로 90도 회전
                directionIndex = (directionIndex + 3) % 4;
            } else if (command == 'R') {
                // 오른쪽으로 90도 회전
                directionIndex = (directionIndex + 1) % 4;
            } else if (command == 'F') {
                // 바라보고 있는 방향으로 한 칸 이동
                if (directions[directionIndex].equals("N")) {
                    y += 1;
                } else if (directions[directionIndex].equals("E")) {
                    x += 1;
                } else if (directions[directionIndex].equals("S")) {
                    y -= 1;
                } else if (directions[directionIndex].equals("W")) {
                    x -= 1;
                }
            }
        }

        // 최종 위치 출력
        System.out.println(x + " " + y);
    }
}