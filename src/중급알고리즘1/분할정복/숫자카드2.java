package 중급알고리즘1.분할정복;

import java.util.*;

/**
 * Created by masinogns on 2017. 9. 15..
 *
 * 이 문제는 카드의 갯수 또한 카운트해야 하는 조건이 있다
 * index에 음수도 있기 때문에 배열을 사용하는건 패스
 * 그래서 HashMap을 사용하여 카드의 숫자를 키값 그리고 카운트하는 수를 밸류값으로 해서 문제를 풀어나가겠다
 *
 * int n : 상근이가 가지고 있는 숫자 카드의 개수
 * int[] arrayN : 상근이가 가지고 있는 숫자 카드들
 * int m : 몇개 가지고 있는지
 * int[] arrayM : 상근이가 몇개 가지고 있는 숫자 카드인지
 */
public class 숫자카드2 {
    public ArrayList<Integer> solution(int n, int[] arrayN, int m, int[] arrayM) {

        HashMap<Integer, Integer> result = new HashMap<>();
        ArrayList<Integer> ret = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int target = arrayN[i];
            Integer count = result.get(target);
            if (count == null)
                result.put(target, new Integer(1));
            else
                result.put(target, new Integer(count+1));
        }

        for (Integer i : arrayM){
            if (result.get(i)!=null)
                ret.add(result.get(i));
            else
                ret.add(0);
        }

        return ret;
    }

    public static void main(String[] args) {
        숫자카드2 application = new 숫자카드2();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arrayN = new int[N];
        for (int i = 0; i < N; i++)
            arrayN[i] = scanner.nextInt();

        int M = scanner.nextInt();
        int[] arrayM = new int[M];
        for (int i = 0; i < M; i++)
            arrayM[i] = scanner.nextInt();

        ArrayList<Integer> ret = application.solution(N, arrayN, M, arrayM);

        for (int i : ret)
            System.out.print(i+" ");
    }
}
