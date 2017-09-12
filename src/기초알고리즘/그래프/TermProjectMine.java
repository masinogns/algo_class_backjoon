package 기초알고리즘.그래프;

import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 9. 11..
 */
public class TermProjectMine {
    ArrayList<Integer>[] wishTeamMember;
    boolean[] visited, myself;
    int totalTeamMember = 0;

    public int solution(int studentNumber, ArrayList<Integer> studentWishTeamMember) {

        // Array를 ArrayList로 Graph로 구현
        // wishTeamMeber[i번째 학생] = i번째 학생이 원하는 팀 멤버
        wishTeamMember = new ArrayList[studentNumber+1];
        for (int i = 1; i <= studentNumber; i++)
            wishTeamMember[i] = new ArrayList<>();

        for (int i = 1; i <= studentNumber; i++)
            wishTeamMember[i].add(studentWishTeamMember.get(i-1));


        visited = new boolean[studentNumber + 1];       // 탐색을 했는지 안했는지
        myself = new boolean[studentNumber + 1];        // 시작과 끝이 나인지 ? == 팀인지
        totalTeamMember = 0;                            // 팀이 된 총 학생 수

        for (int i = 1; i <= studentNumber; i++){
            if (visited[i] == false)
                findTeam(i);
        }


        return studentNumber - totalTeamMember;
    }

    private void findTeam(int student) {
        visited[student] = true;
        int next = wishTeamMember[student].get(0);

        if (visited[next]){
            if (myself[next] == false){
                int nextnext = next;
                while (true){
                    if (nextnext == student)
                        return;

                    totalTeamMember++;
                    nextnext = wishTeamMember[nextnext].get(0);
                }

            }
        }else findTeam(next);
        myself[student] = true;
    }
}
