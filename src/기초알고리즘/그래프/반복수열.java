package 기초알고리즘.그래프;

import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 9. 11..
 */
public class 반복수열 {

    boolean[] check;
    int[] index;
    int currentIndex;

    public static int pow(int x, int p){ // x^p x의 p승
        int ans = 1;
        for (int i = 0; i < p; i++){
            ans = ans * x;
        }

        return ans;
    }

    public static int next(int a, int p){       //57 --> 5*5 + 7*7 = 74
        int ans = 0;

        while (a > 0){
            ans += pow(a%10, p);
            a /= 10;
        }

        return ans;
    }


    public int solution(int A, int P) {
        // 1000000의 범위를 지정해준 이유 -->
        check = new boolean[1000000];
        index = new int[1000000];
        currentIndex = 0;

        int ret = findCycleLength(A, P);
        return ret;
    }

    private int findCycleLength(int a, int p) {
        if (check[a] == true)
            return index[a];

        check[a] = true;
        index[a] = currentIndex++;

        int b = next(a, p);
        return findCycleLength(b, p);
    }
}
