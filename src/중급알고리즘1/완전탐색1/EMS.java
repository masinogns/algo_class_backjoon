package 중급알고리즘1.완전탐색1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class EMS {


    private static final int EarthEnd = 15;
    private static final int SunEnd = 28;
    private static final int MoonEnd = 19;

    public int solution(int[] ems) {

        int earthUntil = ems[0], sunUntil = ems[1], moonUnti = ems[2];

        int earth = 0, sun = 0, moon = 0;
        int year = 0, ret = 0;

        while (true){
            year++;
            earth++;sun++;moon++;

            if (earth > EarthEnd)
                earth = 1;

            if (sun > SunEnd)
                sun = 1;

            if (moon > MoonEnd)
                moon = 1;

            if (earth == earthUntil && sun == sunUntil && moon == moonUnti){
                ret = year;
                break;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        EMS application = new EMS();

        Scanner scanner = new Scanner(System.in);

        int[] ems = new int[3];
        for (int i = 0; i < 3; i ++)
             ems[i] = scanner.nextInt();

        System.out.println(application.solution(ems));
    }
}
