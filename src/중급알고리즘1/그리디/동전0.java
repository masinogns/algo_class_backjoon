package 중급알고리즘1.그리디;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 9..
 */
public class 동전0 {
    private int k;
    private int[] coins;

    public void setK(int k) {
        this.k = k;
    }

    public int getK() {
        return k;
    }

    public int solution(int k, int[] coins) {

        int countNumber = 0;

        for (int i = coins.length-1; i >= 0; i--){
            while (k >= coins[i]){
                k -= coins[i];
                countNumber++;
            }
        }

        return countNumber;
    }

    public static void main(String[] args) {
        동전0 controller = new 동전0();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] coins = new int[n];
//        scanner.nextLine();
        for (int i = 0; i < n; i++){
            coins[i] = scanner.nextInt();
        }

        System.out.print(controller.solution(k, coins));
    }
}
