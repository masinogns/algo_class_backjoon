package 기초알고리즘.그래프_다시_풀기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 9..
 */
class Maze{
    int x, y;

    public Maze(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

public class 미로탐색 {

    public static final int[] X = {-1,0,0,1};
    public static final int[] Y = {0,-1,1,0};

    public int solution(int n, int m, int[][] map) {

        int[][] dist = new int[n][m];
        boolean[][] check = new boolean[n][m];

        Queue<Maze> queue = new LinkedList<>();
        queue.add(new Maze(0, 0));
        dist[0][0] = 1;
        check[0][0] = true;

        while (!queue.isEmpty()){
            Maze current = queue.remove();

            for (int k = 0; k < 4; k++){
                int nx = current.getX() + X[k];
                int ny = current.getY() + Y[k];

                if (0 <= nx && nx < n && 0 <= ny && ny < m){
                    if (map[nx][ny] == 1 && check[nx][ny] == false){
                        queue.add(new Maze(nx, ny));
                        check[nx][ny] = true;
                        dist[nx][ny] = dist[current.getX()][current.getY()]+1;
                    }
                }
            }
        }

        return dist[n-1][m-1];
    }

    public int[][] makeMap(int n, int m, String[] map) {
        int[][] makeMap = new int[n][m];
        for (int i = 0; i < n; i++){
            String[] strings = map[i].split("");

            for (int j = 0; j < m; j++){
                makeMap[i][j] = Integer.parseInt(strings[j]);
            }
        }

        return makeMap;
    }

    public static void main(String[] args) {
        미로탐색 application = new 미로탐색();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        scanner.nextLine();

        String[] map = new String[N];
        for (int i = 0; i < N; i++)
            map[i] = scanner.nextLine();

        int[][] makeMap = application.makeMap(N, M, map);
        int ret = application.solution(N, M, makeMap);

        System.out.println(ret);
    }
}
