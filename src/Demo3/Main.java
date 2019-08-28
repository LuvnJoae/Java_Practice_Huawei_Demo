package Demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] arrayTemp = new int[2];
            for (int i1 = 0; i1 < 2; i1++) {
                arrayTemp[i1] = sc.nextInt();
            }
            list.add(arrayTemp);
        }

        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int minX = list.get(0)[0];

        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        int maxX = list.get(0)[0];

        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int minY = list.get(0)[1];

        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        int maxY = list.get(0)[1];

        if (minX == maxX || minY == maxY){
            System.out.println(1);
        }
    }
}
