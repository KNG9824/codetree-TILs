import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 격자 크기 n과 시간 t 입력 받기
        int n = sc.nextInt();
        int t = sc.nextInt();
        
        // 구슬의 초기 정보 입력 받기
        int r = sc.nextInt();
        int c = sc.nextInt();
        char d = sc.next().charAt(0);

        // 이동 방향을 정의 (U, D, L, R)
        int[] dr = {0, 0, -1, 1}; // L, R, U, D
        int[] dc = {-1, 1, 0, 0}; // L, R, U, D
        int dir = "LRUD".indexOf(d);

        // t초 동안 구슬의 위치 업데이트
        for (int i = 0; i < t; i++) {
            r += dr[dir];
            c += dc[dir];
            
            // 벽에 부딪히는 경우 방향 변경
            if (r < 1 || r > n || c < 1 || c > n) {
                // 벽에 부딪히면 한 칸 뒤로 이동하고 방향을 반대로
                r -= dr[dir];
                c -= dc[dir];
                // 방향 반대로 (L <-> R, U <-> D)
                if (dir == 0) dir = 1;
                else if (dir == 1) dir = 0;
                else if (dir == 2) dir = 3;
                else if (dir == 3) dir = 2;
            }
        }

        // 결과 출력
        System.out.println(r + " " + c);
    }
}