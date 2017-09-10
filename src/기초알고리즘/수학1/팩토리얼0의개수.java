package 기초알고리즘.수학1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class 팩토리얼0의개수 {

    private static final int ONE = 5;
    private static final int TWO = 25;
    private static final int THREE = 125;

    public int solution(int N) {
        int ret = 0;

        if (N > THREE)
            ret += N / THREE + N / TWO + N / ONE;
        else if (TWO <= N && N < THREE)
            ret += N / TWO + N / ONE;
        else
            ret += N / ONE;

        return ret;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i=5; i<=n; i*=5) {
            ans += n/i;
        }
        System.out.println(ans);
    }

}
