package Demo2;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int[] arrayTemp = new int[2];
            for (int i1 = 0; i1 < 2; i1++) {
                arrayTemp[i1] = sc.nextInt();
            }
            list.add(arrayTemp);
        }
        double ln1 = 0;
        double ln2 = 0;
        double ln3 = 0;
        double ln4 = 0;
        double ln5 = 0;
        double ln6 = 0;
        double sum = 0;
        ArrayList<Double> listSum = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            ln1 =  Math.sqrt( Math.pow(list.get(i)[0], 2) + Math.pow(list.get(i)[1], 2) );

            for (int i1 = 0; i1 < 5; i1++) {
                if (list.get(i1) == list.get(i)){
                    continue;
                }else {
                    ln2 = Math.sqrt( Math.pow(list.get(i)[0] - list.get(i1)[0], 2) + Math.pow(list.get(i)[1] - list.get(i1)[1], 2) );
                }

                for (int i2 = 0; i2 < 5; i2++) {
                    if (list.get(i2) == list.get(i) || list.get(i2) == list.get(i1)){
                        continue;
                    }else {
                        ln3 = Math.sqrt(Math.pow(list.get(i1)[0] - list.get(i2)[0], 2) + Math.pow(list.get(i1)[1] - list.get(i2)[1], 2));
                    }

                    for (int i3 = 0; i3 < 5; i3++) {
                        if (list.get(i3) == list.get(i) || list.get(i3) == list.get(i1) || list.get(i3) == list.get(i2) ){
                            continue;
                        }else {
                            ln4 = Math.sqrt(Math.pow(list.get(i2)[0] - list.get(i3)[0], 2) + Math.pow(list.get(i2)[1] - list.get(i3)[1], 2));
                        }

                        for (int i4 = 0; i4 < 5; i4++) {
                            if (list.get(i4) == list.get(i) || list.get(i4) == list.get(i1) || list.get(i4) == list.get(i2) || list.get(i4) == list.get(i3) ){
                                continue;
                            }else {
                                ln5 = Math.sqrt(Math.pow(list.get(i3)[0] - list.get(i4)[0], 2) + Math.pow(list.get(i3)[1] - list.get(i4)[1], 2));
                            }

                            ln6 = Math.sqrt( Math.pow(list.get(i4)[0], 2) + Math.pow(list.get(i4)[1], 2) );

                            sum = ln1 + ln2 + ln3 + ln4 + ln5 + ln6;
                            listSum.add(sum);
                        }

                    }
                }
            }
        }
//
        Collections.sort(listSum);
        double num;
        num = listSum.get(0);
        int result = (int) num;
        System.out.println(result);


    }
}
