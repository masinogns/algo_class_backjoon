package 기초알고리즘.그래프;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by masinogns on 2017. 9. 12..
 * // 익은 토마토는 1 , 익지 않은 토마토는 0
 * // 다 익게되는 최소 일수를 구하는 프로그램
 */

class Tomato{
    int n;
    int m;

    Tomato(int n, int m){
        this.n = n;
        this.m = m;
    }
}
public class 토마토 {

    public static final int[] dx = {0,0,1,-1};
    public static final int[] dy = {1,-1,0,0};

    private boolean[][] check;
    private int[][] dist;
    private int[][] tomato;
    private int day;

    public void setTomato(int[][] tomato) {
        this.tomato = tomato;
    }

    public int solution(int N, int M, int[][] tomato) {

        check = new boolean[N][M];
        dist = new int[N][M];
        day = 0;

        for (int n = 0; n < N; n++ ){
            for (int m = 0; m < M; m++ ){
                if (tomato[n][m] == 1 && check[n][m] == false){
                    bfs(n, m, day++, N, M, tomato, dist, check);
                }
            }
        }

        printDist(N, M, tomato);

        return print(N, M, tomato);
    }

    private int print(int N, int M, int[][] tomato) {
        int max = Integer.MIN_VALUE;

        System.out.println();
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (max < dist[i][j])
                    max = dist[i][j];
            }
            System.out.println();
        }

        return max;
    }

    private void printDist(int N, int M, int[][] tomato) {
        System.out.println();
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                System.out.print(dist[i][j]);
            }
            System.out.println();
        }

    }

    private void bfs(int n, int m, int day, int N, int M, int[][] tomato, int[][] dist, boolean[][] check) {
        Queue<Tomato> queue = new LinkedList<>();
        queue.add(new Tomato(n,m));
        check[n][m] = true;
        dist[n][m] = 0;

        while (!queue.isEmpty()){
            Tomato to = queue.remove();

            n = to.n;
            m = to.m;

            for (int k = 0; k < 4; k++){
                int nx = n + dx[k];
                int my = m + dy[k];

                if (0<=nx && 0<=my && nx < N && my < M){
                    if (tomato[nx][my] == 0 && check[nx][my] == false){
                        queue.add(new Tomato(nx, my));
                        tomato[nx][my] = 1;
                        check[nx][my] = true;
                        dist[nx][my] = dist[n][m] + 1;
                    }
                }
            }
        }
    }

    public int[][] getTomato() {
        return tomato;
    }
}
