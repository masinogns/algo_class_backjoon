package 중급알고리즘1.분할정복;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 16..
 *
 * 원판의 순서 x, z, y
 *
 * solve(n, x, y) : 1~n개 원판을 x에서 y로 이동하는 함수
 *
 * 1. 1~n-1개 원판 x->z    solve(n-1, x, z)
 * 2. n번 원판 x->y        move(n, x, y )
 * 3. 1~n-1개 원판 z->y    solve(n-1, z, y)
 *
 * 1~2번째 원판을 1에서 2로 이동한다
 * 3번째 원파을 1에서 3로 이동한다
 * 1~2번째 원판을 2에서 3로 이동한다
 */
public class 하노이의탑이동순서 {
    public static StringBuilder sb;

    int count = 0;

    public int solution(int N) {
        solve(N, 1, 3);
        return count;
    }

    private void solve(int n, int x, int y) {
        // 이동시킬 원판이 없으면 return으로 끝낸다
        if (n == 0) return;
        count++;
        // x+y+z=6 --> z = 6-x-y
        solve(n-1, x, 6-x-y);
//        System.out.println(n+"번째 원판이 "+x+"에서 "+y+"로 이동했다");
        sb.append(x+" "+y+"\n");
        solve(n-1, 6-x-y, y);

    }

    public static void main(String[] args) {
         하노이의탑이동순서 application = new 하노이의탑이동순서();

        Scanner scanner = new Scanner(System.in);
        sb = new StringBuilder();

        int N = scanner.nextInt();

        int ret = application.solution(N);

        System.out.println(ret);
        System.out.println(sb);
    }
}
