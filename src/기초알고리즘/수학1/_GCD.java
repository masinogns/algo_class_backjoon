package 기초알고리즘.수학1;

/**
 * Created by masinogns on 2017. 9. 10..
 *
 * Greatest Common Divisor
 */
public class _GCD {

    public int gcdUsingRecursion(int a, int b){

        if (b==0)
            return a;
        else
            return gcdUsingRecursion(b, a%b);
    }

    public int gcdUsingFor(int a, int b){

        int r = 0;

        while (b!=0){
            r = a%b;
            a = b;
            b = r;
        }

        return a;
    }
}
