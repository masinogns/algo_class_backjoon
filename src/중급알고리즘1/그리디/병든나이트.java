package 중급알고리즘1.그리디;

/**
 * Created by masinogns on 2017. 9. 14..
 */
public class 병든나이트 {
    public int solution(int height, int width) {

        // 일반적인 경우를 생각하고 해당하는 경우의 수의 로직을 생각하면 된다
        int lenght = 0;
        if (height > 3){
            if (width > 7){
                // width가 2일 때는 +1, 3일 때는 +2
                width = width - 7;
                lenght += 4;

                while (width > 0){
                    width -= 3;
                    lenght += 2;
                }
            }
        }else {

        }
        return lenght;
    }
}
