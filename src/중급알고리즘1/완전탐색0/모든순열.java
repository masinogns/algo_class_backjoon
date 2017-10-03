package 중급알고리즘1.완전탐색0;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 3..
 *
 * 숫자 N이 주어졌을 때, 1부터 N가지의 수로 이루어진 순열을 사전순으로 출력하는 프로그램
 *
 * 첫째줄부터 N! 개의 줄에 걸쳐서 모든 순열을 사전순으로 출력한다
 */
class nextPermutation {
    public int[] solution(int numberOfPermutation, int[] permutations) {

        int i_index = findMaxI(numberOfPermutation, permutations);
        int j_index = findMaxJ(numberOfPermutation, i_index, permutations);

        if (i_index == -1 || j_index == -1) {
            return new int[]{-1};
        }

        int[] swaped = swap(i_index - 1, j_index, permutations);

        int j = numberOfPermutation - 1;
        while (i_index < j) {
            swaped = swap(i_index, j, permutations);
            i_index += 1;
            j -= 1;
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
            for (int j = numberOfPermutation - 1; i_index <= j; j--) {
                if (permutations[i_index - 1] < permutations[j]) {
                    return j;
                }
            }
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }


    private int findMaxI(int numberOfPermutation, int[] permutations) {

        try {
            for (int i = numberOfPermutation - 1; i > 0; i--) {
                if (permutations[i - 1] < permutations[i]) {
                    return i;
                }
            }
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }
}

public class 모든순열 {
    ArrayList<int[]> ret;

    public ArrayList<int[]> getRet() {
        return ret;
    }

    public void solution(int n) {
        int[] Array = new int[n];
        int nFactorial = factorial(n);
        ret = new ArrayList<int[]>();

        for (int i = 0; i < n; i++)
            Array[i] = i+1;

        nextPermutation application = new nextPermutation();


        for (int i : Array)
            System.out.print(i+" ");
        System.out.println();
        ret.add(Array);

        while (nFactorial > 1){
            Array = application.solution(n, Array);
            for (int i : Array)
                System.out.print(i+" ");
            System.out.println();
            ret.add(Array);

            nFactorial--;
        }
    }

    public int factorial(int n) {
        int[] DP = new int[n+1];

        if (n == 1)
            return 1;

        if (n == 2) {
            return 2;
        }

        DP[1] = 1;
        DP[2] = 2;

        for (int i = 3; i <= n; i++){
            DP[i] = i*DP[i-1];
        }

        return DP[n];
    }

    public static void main(String[] args) {
        모든순열 application = new 모든순열();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        application.solution(N);
    }
}
