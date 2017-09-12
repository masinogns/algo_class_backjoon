package 기초알고리즘.그래프;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by masinogns on 2017. 9. 11..
 *
 * distinct[i] = 시작 => i 거리
 * distinct[next] = distinct[now] + 1
 *
 */


class Maze{
    int x;
    int y;

    Maze(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 미로탐색{

    public static final int[] dx = {0,0,1,-1};
    public static final int[] dy = {1,-1,0,0};

    public static boolean[][] check;
    public static int[][] dist;

    public int solution(int n, int m, int[][] map) {


        check = new boolean[n][m];
        dist = new int[n][m];

        Queue<Maze> queue = new LinkedList<>();
        queue.add(new Maze(0,0));
        check[0][0] = true;
        dist[0][0] = 1;

        while (!queue.isEmpty()){
            Maze maze = queue.remove();
            int x = maze.x;
            int y = maze.y;

            for (int k = 0; k < 4; k++){
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (0<=nx && nx < n && 0<=ny && ny < m){
                    if (check[nx][ny] == false && map[nx][ny] == 1){
                        queue.add(new Maze(nx, ny));
                        check[nx][ny] = true;
                        dist[nx][ny] = dist[x][y] + 1;
                    }
                }
            }
        }


        return dist[n-1][m-1];
    }
}