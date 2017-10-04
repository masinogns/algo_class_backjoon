package 중급알고리즘1.완전탐색1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 4..
 */
public class 로또 {
    public static boolean next_permutation(ArrayList<Integer> Array) {
        int i = Array.size()-1;
        while (i > 0 && Array.get(i-1) >= Array.get(i)) {
            i -= 1;
        }

        // 마지막 순열
        if (i <= 0) {
            return false;
        }

        int j = Array.size()-1;
        while (Array.get(j) <= Array.get(i-1)) {
            j -= 1;
        }

        int temp = Array.get(i-1);
        Array.add(i-1, Array.get(j));
        Array.add(j, temp);

        j = Array.size()-1;
        while (i < j) {
            temp = Array.get(i);
            Array.add(i, Array.get(j));
            Array.add(j, temp);
            i += 1;
            j -= 1;
        }
        return true;
    }

    public void run(){
        int N = 3;
//        int[] A = new int[]{1,2,3};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3));

//        ArrayList<Integer> Array = new ArrayList<>();
//        for (int i = 0; i < N-6; i++)
//            Array.add(0);
//
//        for (int i = 0; i < 6; i++)
//            Array.add(1);

        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        do {
//            ArrayList<Integer> current  = new ArrayList<>();
//
//            for (int i = 0; i < N; i++){
//                if (Array.get(i) == 1)
//                    current.add(A[i]);
//            }
//            answer.add(current);

            for(int i : A){
                System.out.print(i+" ");
            }
            System.out.println();
        }while (next_permutation(A));

        for (ArrayList<Integer> list: answer){
            for (int i : list){
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {

    }
}
