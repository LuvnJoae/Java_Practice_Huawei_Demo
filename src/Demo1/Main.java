package Demo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        输入
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
//        遍历
        char[] chars = str.toCharArray();

        ArrayList<Character> list = new ArrayList<>();//存储输出
        for (int i = 0; i < chars.length; i++) {
            if ((i+1) % 9 == 0){

                if( chars[i-8] == '1'){
                    for (int i1 = i-7; i1 < i+1; i1++) {
                        list.add(chars[i1]);
                    }
                    if (i != chars.length-1){
                        list.add(' ');
                    }

                }
                else if ( chars[i-8] == '0' ){
                    for (int i2 = i; i2 > i-8; i2--){
                        list.add(chars[i2]);
                    }
                    if (i != chars.length-1){
                        list.add(' ');
                    }
                }

            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
