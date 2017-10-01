package 중급알고리즘1.분할정복;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 종이의개수 {
    int[] numberOfPaper = new int[3];

    public void solution(int[][] papers, int x, int y, int size) {
        if (isSameAll(papers, x, y, size)){
            numberOfPaper[papers[x][y]+1]++;
            return;
        }

        int dividePaper = size/3;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                solution(papers, x+i*dividePaper, y+j*dividePaper, dividePaper);
            }
        }
    }

    private boolean isSameAll(int[][] papers, int x, int y, int size) {
        for (int i = x; i < x+size; i++){
            for (int j =y; j < y+size; j++){
                if (papers[x][y] != papers[i][j])
                    return false;
            }
        }
        return true;
    }

    public int[] getNumberOfPaper() {
        return numberOfPaper;
    }

    public static void main(String[] args) {
        종이의개수 application = new 종이의개수();

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] paper = new int[size][size];
        makePaper(scanner, size, paper);

        application.solution(paper, 0, 0, size);

        int[] ret = application.getNumberOfPaper();

        for (int i : ret)
            System.out.println(i);



    }

    private static void makePaper(Scanner scanner, int size, int[][] paper) {
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                paper[i][j] = scanner.nextInt();
            }
        }
    }
}