package 기초알고리즘.그래프;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by masinogns on 2017. 9. 11..
 *
 * FloodFill 문제 : 어떤 위치와 연결되어 있는 모든 위치를 찾는 문제
 *
 * 단지번호붙이기 = 연결요소..??
 * d[i][j] = (i, j)를 방문 안했으면 0, 방문 했으면 단지 번호를 채워넣어주면 된다
 *
 * http://stack07142.tistory.com/160
 */
public class 단지번호붙이기 {

    private static final int[] dx = {0,0,1,-1};
    private static final int[] dy = {1,-1,0,0};

    private ArrayList<Integer> result;
    private boolean[][] check;

    public int solution(int mapSize, int[][] map) {

        result = new ArrayList<>();
        check = new boolean[mapSize][mapSize];

        for (int i = 0; i < mapSize; i++){
            for (int j = 0; j < mapSize; j++){
                if (map[i][j] == 1 && check[i][j]==false){
                    int cnt = dfs(i, j, map, mapSize, 0);
                    result.add(cnt);
                }
            }
        }

        Collections.sort(result);

        for (Integer integer : result)
            System.out.println(integer);
        return result.size();
    }

    private int dfs(int i, int j, int[][] map, int mapSize, int count) {
        check[i][j] = true;
        count++;

        for (int k = 0; k < 4; k++){
            int nx = i + dx[k];
            int ny = j + dy[k];

            if (0 <= nx && nx < mapSize && 0 <= ny && ny < mapSize){
                if (map[nx][ny] == 1 && check[nx][ny] == false){
                    count = dfs(nx, ny, map, mapSize, ++count);
                }
            }
        }
        return count;
    }
}
