package Algorithms.Easy;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Aakash on 11/16/2016.
 */
public class SockMerchant {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : c) {
            if(map.containsKey(i)) {
                int v = map.get(i);
                if(v%2 == 1) {
                    count++;

                }
                map.put(i, v + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(count);
    }
}
