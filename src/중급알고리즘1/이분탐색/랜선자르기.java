package 중급알고리즘1.이분탐색;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 2..
 *
 * X로 자르면 N개 이상이 나오는가?
 * yes --> X 증가
 * no --> X 감소
 *
 * 범위는 1부터 가장 긴 랜선의 길이만큼
 */
public class 랜선자르기 {
    private int k;
    private int max;
    private int[] array;
    private double ret;

    public void setK(int k) {
        this.k = k;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getMax() {
        return max;
    }

    public int[] getArray() {
        return array;
    }

    // Binary Searching과 비슷하다
    public void findMaxNumberLanLine(int max, int[] array, int arrayMax) {
        int left = 1, right = arrayMax;
        int mid = 0;

        while (left <= right){
            mid = (left + right) / 2;

            if (IsBiggerThanMax(max, mid, array)){
                ret = Math.max(ret, mid);
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
    }

    private boolean IsBiggerThanMax(int max, int mid, int[] array) {

        int count = 0;

        for (int i : array)
            count += i / mid;

        if (max <= count)
            return true;

        return false;
    }

    public int finsMaxValueInArray(int[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }

    public double getRet() {
        return ret;
    }

    public static void main(String[] args) {
        랜선자르기 application = new 랜선자르기();

        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int Max = scanner.nextInt();
        int[] A = new int[K];
        for (int i = 0; i < K ; i++)
            A[i] = scanner.nextInt();

        application.setK(K);
        application.setMax(Max);
        application.setArray(A);
        application.findMaxNumberLanLine(
                application.getMax(), application.getArray(),
                application.finsMaxValueInArray(application.getArray()));

        System.out.println(application.getRet());
    }
}
