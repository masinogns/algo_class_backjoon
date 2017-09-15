package 중급알고리즘1.그리디;

/**
 * Created by masinogns on 2017. 9. 14..
 *
 * 대회에 나갈 때 2명의 여학생 + 1명의 남학생 = 1 팀
 * 대학에는 N 명의 여학생과 M명의 남학생이 있다
 * K명을 반드시 인턴쉽 프로그램에 참여
 *
 * N명의 여학생과 M명의 남학생, 반드시 K명은 인턴쉽을 참여헤야 한다 (최대의 팀 수를 구하라.)
 * N = 6, M = 3, K = 2, 최대 팀은 2 팀
 *
 * 팀을 구해야하는데 K명을 뺀 상태에서 최대의 팀 수를 구하는 문제이다
 */
public class 대회OR인턴 {
    public int solution(int girls, int guys, int k) {

        /**
         * 먼저 K를 무시한 채 최대 몇 팀이 나갈 수 있는지 계산한다
         * 몇 팀이 나갈 수 있는지 구하고 남은 여학생과 남학생 수를 K에 포함시켜준다
         * 그 후에 K가 아직도 0보다 크다면 K만큼 더 채워줘야하기 때문에
         * team에서 3명을 빼고 그 3명을 K에 더 넣어준다 K가 만족할때까지 한다
         */
        int team = 0;

        while (girls > 0 && guys > 0){
            girls -= 2;
            guys -= 1;
            team ++;
        }

        k -= (girls + guys);

        while (k > 0){
            team--;
            k -= 3;
        }

        return team;
    }
}
