package 기초알고리즘.그래프;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Island{
    int x;
    int y;

    Island(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 섬의개수{

    public static final int[] dx = {1,-1,0,0,1,1,-1,-1};
    public static final int[] dy = {0,0,-1,1,1,-1,1,-1};
    private int[][] check;
    public int solution(int width, int height, int[][] map) {

        check= new int[height][width];
        ArrayList<Integer> number = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){

                if (check[i][j] == 0 && map[i][j] == 1){
                    bfs(i,j, map, ++count, width, height);
                }
            }
        }

        return count;
    }



    private void bfs(int n, int m, int[][] map, int count, int width, int height) {
        Queue<Island> queue = new LinkedList<>();
        queue.add(new Island(n, m));
        check[n][m] = count;


        while (!queue.isEmpty()){
            Island island = queue.remove();

            n= island.x;
            m = island.y;

            for (int k = 0; k < 8; k++){
                int nx = n + dx[k];
                int ny = m + dy[k];

                if (0<=nx && 0<=ny&&nx<height&&ny<width){
                    if (check[nx][ny] == 0 && map[nx][ny] == 1){
                        queue.add(new Island(nx, ny));
                        check[nx][ny] = count;
                    }
                }
            }

        }

    }
}