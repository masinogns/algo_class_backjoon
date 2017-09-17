package kakao;

/**
 * Created by masinogns on 2017. 9. 16..
 */
public class problem6 {


    public int solution(int m, int n, String[] board) {

        int answer = 0;

        char[][] newBoard = new char[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                newBoard[i][j] = board[i].charAt(j);
            }
        }


        for (int x = 1; x < m; x++){
            for (int y = 1; y < n; y++){
                newBoard[x][y] = (char) (Math.min(
                                        Math.min(newBoard[x-1][y], newBoard[x][y-1]), newBoard[x-1][y-1]) + 1);
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                answer = Math.max(answer, newBoard[i][j]);
                count += answer*answer;
            }
        }

        return count;
    }
}
