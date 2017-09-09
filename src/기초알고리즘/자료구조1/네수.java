package 기초알고리즘.자료구조1;

/**
 * Created by masinogns on 2017. 9. 9..
 */
public class 네수 {
    public int solution(String A, String B, String C, String D) {
        String First = "";
        String Second = "";

        First = A+B;
        Second = C+D;

        Integer sum = Integer.valueOf(First)+ Integer.valueOf(Second);

        return sum;
    }
}
