package NHN;

import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 18..
 */
public class problem2 {
    public int solution(int n) {

        int f = n + reverse(n);

        return 0;
    }

    private int reverse(int n) {
        Stack<Integer> stack = new Stack<>();

        int mok = 0, divide = 0;
        while (n > 10){
            mok = n / 10;
            stack.push(mok);
            n = n % 10;
        }

        int ret = 0;
        for (int i = stack.size()-1; i >= 0; i--){
            ret += (int) (stack.pop()*Math.pow(10, i));
        }

        return ret;
    }
}
