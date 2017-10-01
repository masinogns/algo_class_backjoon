package 중급알고리즘1.분할정복;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 15..
 */


public class 숫자카드 {
    /**
     *
     * @param n         한 사람이 가지고 있는 숫자 카드의 갯수
     * @param arrayN    숫자 카드에 적혀있는 숫자
     * @param m         비교할 카드의 갯수
     * @param arrayM    한 사람이 가지고 있는 숫자 카드인지 아닌지를 비교할 카드 숫자
     * @return
     */
    public ArrayList<Integer> solution(int n, int[] arrayN, int m, int[] arrayM) {

        ArrayList<Integer> result = new ArrayList<>();

        // target값들은 arrayM에 들어있는 것들이 target값들이다.
        // 비교할 array는 정렬이 되어있어야 한다
        Arrays.sort(arrayN);


        for (int target = 0; target < arrayM.length; target++){
            if (binarySearch(arrayM[target], arrayN))
                result.add(1);
            else
                result.add(0);
        }

        return result;
    }

    public boolean binarySearch(int target, int[] compareArray){
        int left = 0;
        int right = compareArray.length-1;
        int mid = 0;

        while (left <= right){
            mid = (left + right) / 2;

            if (target == compareArray[mid])
                return true;
            else if (target < compareArray[mid])
                right = mid - 1;
            else
                left = mid + 1;
            }

        return false;
    }

    public static void main(String[] args) {
        숫자카드 application = new 숫자카드();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] ArrayN = new int[N];
        for (int i = 0; i < N; i++){
            ArrayN[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        int[] ArrayM = new int[M];
        for (int i = 0; i < M; i++){
            ArrayM[i] = scanner.nextInt();
        }

        ArrayList<Integer> ret = application.solution(N, ArrayN, M, ArrayM);

        for (Integer i : ret){
            System.out.print(i+" ");
        }
    }
}
