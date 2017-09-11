package 기초알고리즘.수학1;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class GCDAndLCM {
    public int gcd(int a, int b) {
        if (b == 0)
            return a;

        else
            return gcd(b, a%b);
    }


    public int lcm(int a, int b) {
        int g = gcd(a, b);

        return a*b/g;
    }
}
