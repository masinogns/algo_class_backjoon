package 기초알고리즘.정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 9..
 *
 * Integer.compare ( a, b )
 * a < b ; true  오름차순
 * a > b ; false 내림차순
 *
 */
class Positions{
    int x, y;

    public Positions(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class orderedByX implements Comparator<Positions>{

    @Override
    public int compare(Positions o1, Positions o2) {
        int firX = o1.getX();
        int secX = o2.getX();

        if (firX == secX){
            int firY = o1.getY();
            int secY = o2.getY();

            return Integer.compare(firY, secY);
        }
        return Integer.compare(firX, secX);
    }
}

class orderedByY implements Comparator<Positions>{

    @Override
    public int compare(Positions o1, Positions o2) {
        int firY = o1.getY();
        int secY = o2.getY();

        if (firY == secY){
            int firX = o1.getX();
            int secX = o2.getX();

            return Integer.compare(firX, secX);
        }
        return Integer.compare(firY, secY);
    }
}

public class 좌표정렬하기 {
    private static final int X = 0;
    private static final int Y = 1;
    public Positions[] makePositions(int numberOfPoint, int[][] points) {
        Positions[] positions = new Positions[numberOfPoint];

        for (int i = 0; i < numberOfPoint; i++){
            positions[i] = new Positions(points[i][X], points[i][Y]);
        }

        return positions;
    }

    public void sort(Positions[] positions) {

        Arrays.sort(positions, new orderedByX());

        printPositions(positions);

    }

    private void printPositions(Positions[] positions) {
        int N = positions.length;
        for (int i = 0; i < N; i++){
            System.out.println(positions[i].getX()+" "+positions[i].getY());
        }
    }

    public static void main(String[] args) {
        좌표정렬하기 application = new 좌표정렬하기();

        Scanner scanner = new Scanner(System.in);

        int numberOfPoint = scanner.nextInt();
        int[][] points = new int[numberOfPoint][2];

        for (int i = 0; i < numberOfPoint; i++){
            points[i][X] = scanner.nextInt();
            points[i][Y] = scanner.nextInt();
        }

        Positions[] positions = application.makePositions(numberOfPoint, points);
        application.sort(positions);
    }
}
