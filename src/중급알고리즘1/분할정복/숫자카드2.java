package 중급알고리즘1.분할정복;

import java.util.*;

/**
 * Created by masinogns on 2017. 9. 15..
 *
 * 이 문제는 카드의 갯수 또한 카운트해야 하는 조건이 있다
 * index에 음수도 있기 때문에 배열을 사용하는건 패스
 * 그래서 HashMap을 사용하여 카드의 숫자를 키값 그리고 카운트하는 수를 밸류값으로 해서 문제를 풀어나가겠다
 *
 * 아아아아 지이이이익 못 풀었드아아아아
 */
public class 숫자카드2 {
    public ArrayList<Integer> solution(int n, int[] arrayN, int m, int[] arrayM) {

        HashMap<Integer, Integer> result = new HashMap<>();
        Arrays.sort(arrayN);

        for (int target = 0; target < arrayN.length; target++){
            Integer value = arrayN[binarySearch(target, arrayN)];
            System.out.print(value);
            Integer count = result.get(value);
            if (count == null)
                result.put(value, new Integer(0));
            else
                result.put(value, new Integer(count+1));
        }

        Iterator iterate2 = result.keySet().iterator();
        while (iterate2.hasNext()) System.out.println(iterate2.next());

        Iterator iterate = result.values().iterator();
        while (iterate.hasNext()) System.out.println(iterate.next());
        return null;
    }

    public int binarySearch(int tartget, int[] cmp){
        int left = 0, right = cmp.length, mid;

        while (left <= right){
            mid = (left + right) / 2;

            if (tartget == cmp[mid])
                return mid;
            else {
                if (tartget < cmp[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }

        return 0;
    }
}
