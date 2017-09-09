package 중급알고리즘1.그리디;

/**
 * Created by masinogns on 2017. 9. 9..
 *
 * 첫번째문제

 거스름돈을 동전으로 받아야 할때, 누구나 적은 수의 동전으로 거스름돈을 받기를 원한다.
 예를 들어, 거스름돈이 760원이라면, 500원짜리 동전 1개, 100원 짜리 동전 2개, 50원 짜리 동전 1개, 10원짜리 동전 1개,
 즉 5개가 760원에 대한 최소의 동전 수이다.
 동전이 500원, 100원, 50원, 10원, 1원이 있다고 하였을 때

 우리의 목표 : 주어진 거스름 돈 n을 거스를 수 있는 가장 적은 동전 개수를 출력하라.

 그리디알고리즘을 풀기 위해서는 정렬이 필수 입니다.
 */


public class _예제_1 {

    private static int numberOf500 = 0;
    private static int numberOf100 = 0;
    private static int numberOf50 = 0;
    private static int numberOf10 = 0;

    public int solution(int N) {

        int divide = 0;

        numberOf500 = N / 500;
        divide = N % 500;

        numberOf100 = divide / 100;
        divide = divide % 100;

        numberOf50 = divide / 50;
        divide = divide % 50;

        numberOf10 = divide / 10;

        int ret = numberOf10 + numberOf50 + numberOf100 + numberOf500;
        return ret;
    }

    // 풀이 참고 URL - 네이버 블로그
    // https://m.blog.naver.com/PostView.nhn?blogId=seiyeonyim&logNo=100192981326&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F
    public int solution2(int N){
        int[] coin = new int []{500, 100, 50, 10};

        int coinsNumber = 0;

        for (int i = 0; i < 4; i ++){
            while (N >= coin[i]){
                N -= coin[i];
                coinsNumber++;
            }
        }

        return coinsNumber;
    }
}
