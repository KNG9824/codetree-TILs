import java.util.*;

public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int x = 0, y = 0; // 시작은 (0, 0) 입니다.
    public static int dirNum = 0;   // 0: 오른쪽, 1: 아래쪽, 2: 왼쪽, 3: 위쪽
    public static int n; // 전역 변수로 n을 선언합니다.
    
    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // n 값을 읽어옵니다.
        int m = sc.nextInt(); // m 값을 읽어옵니다.
        int[][] answer = new int[n][m];
        
        // 처음 시작 위치에 초기값을 적습니다.
        answer[0][0] = 1;
        
        // n*m번 진행합니다.
        for (int i = 2; i <= n * m; i++) { // 시작 위치를 이미 1로 채웠으므로 i는 2부터 시작합니다.
            // 현재 방향 dir를 기준으로 그 다음 위치 값을 계산합니다.
            int nx = x + dx[dirNum], ny = y + dy[dirNum];
            
            // 더 이상 나아갈 수 없다면 시계방향으로 90'를 회전합니다.
            if (!inRange(nx, ny) || answer[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
            }
            
            // 그 다음 위치로 이동한 다음 배열에 올바른 값을 채워넣습니다.
            x = nx;
            y = ny;
            answer[x][y] = i;
        }
        
        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}