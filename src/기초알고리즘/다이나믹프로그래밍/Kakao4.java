package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 16..
 *
 * D[i][j] = min(D[i-1][j], D[i][j-1], D[i-1][j-1])+1
 * D[i][j] = i,j를 포함하는 가장 넓은 사각형의 변의 길이
 * answer = Max(D[i][j])^2
 * O(M*N)
 */
public class Kakao4 {
    public int solution(int[][] board) {
        int n = board.length, m = board[0].length;
        int answer = 0;

        for (int x = 1; x < n; x++){
            for (int y = 1; y < m; y++){
                board[x][y] = Math.min(
                        Math.min(board[x-1][y], board[x][y-1]), board[x-1][y-1]) + 1;
            }
        }
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                answer = Math.max(answer, board[i][j]);
            }
        }
        return answer*answer;
    }
}
