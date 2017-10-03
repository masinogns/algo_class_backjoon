package 중급알고리즘1.완전탐색0;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class 다음순열 {
    public int[] solution(int numberOfPermutation, int[] permutations) {

        int i_index = findMaxI(numberOfPermutation, permutations);
        int j_index = findMaxJ(numberOfPermutation, i_index, permutations);

        if (i_index == -1 || j_index == -1){
            return new int[]{-1};
        }

        int[] swaped = swap(i_index-1, j_index, permutations);

        int j = numberOfPermutation-1;
        while (i_index < j){
            swaped = swap(i_index, j, permutations);
            i_index += 1; j -= 1;
        }

        return permutations;
    }

    private int[] swap(int i_index, int j_index, int[] permutations) {
        int tmp = 0;
        tmp = permutations[i_index];
        permutations[i_index] = permutations[j_index];
        permutations[j_index] = tmp;
        return permutations;
    }

    private int findMaxJ(int numberOfPermutation, int i_index, int[] permutations) {

        try {
            for (int j = numberOfPermutation-1; i_index<=j; j--){
                if (permutations[i_index-1]< permutations[j]){
                    return j;
                }
            }
        }catch (Exception e){
            return -1;
        }
        return 0;
    }


    private int findMaxI(int numberOfPermutation, int[] permutations) {

        try {
            for (int i = numberOfPermutation-1; i > 0; i--){
                if (permutations[i-1] < permutations[i]){
                    return i;
                }
            }
        }catch (Exception e){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        다음순열 application = new 다음순열();

        Scanner scanner = new Scanner(System.in);

        int numberOfPermutation = scanner.nextInt();

        int[] permutation = new int[numberOfPermutation];
        for (int i = 0; i < numberOfPermutation; i++)
            permutation[i] = scanner.nextInt();

        int[] ret = application.solution(numberOfPermutation, permutation);

        for (int i : ret)
            System.out.print(i+" ");
    }
}
