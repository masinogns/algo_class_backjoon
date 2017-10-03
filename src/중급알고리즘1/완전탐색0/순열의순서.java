package 중급알고리즘1.완전탐색0;

import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class 순열의순서 {
    public ArrayList<Integer> solution(int n, int problem, int[] whatPermutation) {

        모든순열 application = new 모든순열();
        ArrayList<int[]> ret;
        application.solution(n);

        ret = application.getRet();

        int[] result = new int[n];
        if (problem==1){        // K번째 수열을 나타내는  N개의 수
            ret.get(whatPermutation[0]-1);

            for (int i = 0; i < n; i++){
                ret.get(whatPermutation[0]-1);
            }
        }else{                  // 몇 번째 수열인지
            int[] numbers = new int[n];
            ArrayList<Integer> twoResult = new ArrayList<>();
            for (int i = 1; i <= n; i++){
                numbers[i] = i-1;
            }

            int count = 0;
            for (int i = 1;i <= n; i++){
                count += application.factorial(n-i)*numbers[whatPermutation[i-1]];

                for (int j = whatPermutation[i-1]; j <= n; j++){
                    numbers[j]--;
                }
            }

            twoResult.add(count);
            return twoResult;
        }
        ArrayList<Integer> aa = new ArrayList<>();
        return aa;
    }
}
