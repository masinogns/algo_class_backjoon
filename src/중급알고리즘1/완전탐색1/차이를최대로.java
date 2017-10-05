package 중급알고리즘1.완전탐색1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 3..
 */

class nextPermutation {
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

public class 차이를최대로 {
    public int solution(int N, int[] A) {
        nextPermutation nextPermutation = new nextPermutation();

        Arrays.sort(A);

        int permutationNumber = factorial(N);
        int[] ret;
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < permutationNumber-1; i++){
            ret = nextPermutation.solution(N, A);

//            for (int result : ret)
//                System.out.print(result+" ");
//            System.out.println();

            int sum = 0;
            for (int index = 1; index < N; index++){
                sum += Math.abs(A[index-1]-A[index]);
            }

            answer = Math.max(answer, sum);

        }

        return answer;
    }

    public int factorial(int n){

        int[] DP = new int[n+1];

        if (n == 1)
            return 1;

        if (n == 2)
            return 2;

        DP[1] = 1;
        DP[2] = 2;

        for (int i = 3; i <= n; i++){
            DP[i] = i*DP[i-1];
        }
        return DP[n];
    }


    public static void main(String[] args) {
        차이를최대로 application = new 차이를최대로();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }

        int ret = application.solution(N, A);
        System.out.println(ret);
    }
}
