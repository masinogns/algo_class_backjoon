package 중급알고리즘1.이분탐색;


import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 2..
 */

public class 놀이공원 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int person = scanner.nextInt();     //  입력받는 부분================
        int rides = scanner.nextInt();
        int[] times = new int[rides];
        for (int i = 0; i < rides; i++)
            times[i] = scanner.nextInt();   //===========================

        if (person <= rides){               // 만약 사람 수가 놀이기구 수 보다 작다면
            System.out.println(person);     // 한 번에 다 탈 수 있기 때문에
            return;                         // 마지막번째 사람 출력
        }

        long left = 0;
        long right = 2000000000L * 1000000L;

        while (left <= right){              // Binary Searching ...
            long mid = (left+right)/2;
            long begin, end;

            begin = end = 0;
            end = rides;                    // 놀이기구 수가 end값이 된다

            for (int i = 0; i < rides; i++){    // mid분일 때 rides 더하기
                end += mid / times[i];          // mid 분 / 각 시간 값들을 나눈 수들을 합하면
            }                                   // mid분일 때 까지 몇 명의 사람이 탔는지 알 수 있다

            begin = end;                        // mid분일 때 기구를 탄 사람 수에 대한 정보를 복사한다
            for (int i = 0; i < rides; i++){
                if (mid % times[i] == 0){       // mid분 % 기구의 시간 == 0이라면
                    begin -= 1;                 // 현재 한 명의 사람이 i 기구를 타고있다는 의미
                }                               // 그러므로 한 명의 사람을 빼준다
            }
            begin += 1;

            if (person < begin){                // 만약 사람수가 begin보다 작다면
                right = mid - 1;                // right를 중간보다 왼족에 위치하게 한다
            }else if (person > end){            // 만약 사람수가 end보다 크다면
                left = mid + 1;                 // left를 중간보다 오른쪽에 위치하게 한다
            }else {                             // begin < person < end 이면
                for (int i = 0; i < rides; i++){// 원하는 정답이 여기 있다는 의미
                    if (mid % times[i] == 0){   // 기구에 사람이 탑승 중이라면
                        if (person == begin){   //
                            System.out.println(i+1); // i 는 0부터이기 때문에 +1을 해준다
                            return;
                        }
                        begin += 1;             // begin을 1증가 시킨다
                    }
                }
            }
        }
    }
}
