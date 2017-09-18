package 중급알고리즘1.분할정복;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class _이분탐색 {

    public int search(int[] arr, int target){
        int first = 0;
        int last = arr.length;
        int mid;

        while (first <= last){
            mid = (first + last) / 2;

            if (target == arr[mid]){
                System.out.println(mid);
                return mid;
            }else {
                if (target < arr[mid])
                    last = mid - 1;
                else
                    first = mid + 1;
            }
            // if target is not existed, not occur reversal of the first and last
        }

        return -1;
    }
}
