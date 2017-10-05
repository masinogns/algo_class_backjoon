package 중급알고리즘1.완전탐색1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 3..
 */

class next_Permutation {
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

}

public class 외판원순회2 {
    public int solution(int cites, int[][] weight) {

        int numberOfPermutation = factorial(cites);
        next_Permutation next_permutation = new next_Permutation();


        int[] A = new int[cites];
        for (int i = 0; i < cites; i++)
            A[i] = i;

        int answer = Integer.MAX_VALUE;
        int[] permutation = null;
        for (int loop = 0; loop < numberOfPermutation-1; loop++) {
            boolean ok = true;
            int sum = 0;
            permutation = next_permutation.solution(cites, A);

            for (int i = 0; i < cites-1; i++) {
                if (weight[permutation[i]][permutation[i + 1]] == 0) {
                    ok = false;
                }
                else {
                    sum += weight[permutation[i]][permutation[i + 1]];
                }
            }
            if (ok && weight[permutation[cites - 1]][permutation[0]] != 0){
                sum += weight[permutation[cites - 1]][permutation[0]];
                if(answer > sum) answer = sum;
            }
        }
        return answer;
    }

    private int factorial(int n) {
        int[] DP = new int[n+1];

        if (n == 1)return 1;
        if (n == 2)return 2;

        DP[1] = 1; DP[2] = 2;

        for (int i = 3; i <= n; i++) {
            DP[i] = i*DP[i-1];
        }

        return DP[n];
    }

    public static void main(String[] args) {
        외판원순회2 application = new 외판원순회2();

        Scanner scanner = new Scanner(System.in);

        int Cities = scanner.nextInt();

        int[][] A = new int[Cities][Cities];
        for (int i = 0; i < Cities; i++)
            for (int j = 0; j < Cities; j++)
                A[i][j] = scanner.nextInt();

        int ret = application.solution(Cities, A);

        System.out.println(ret);


    }
}
