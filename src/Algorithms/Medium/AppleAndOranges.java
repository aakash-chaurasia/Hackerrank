package Algorithms.Medium;

import java.util.Scanner;

/**
 * Created by Aakash on 10/29/2016.
 */
public class AppleAndOranges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int r1 = s - a;
        int r2 = t - a;
        int l1 = s - b;
        int l2 = t - b;
        int apples = 0;
        int oranges = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            int temp = in.nextInt();
            if(temp  >= r1 && temp <= r2){
                apples++;
            }
        }
        for(int orange_i=0; orange_i < n; orange_i++){
            int temp = in.nextInt();
            if(temp  >= l1 && temp <= l2){
                oranges++;
            }
        }
        System.out.println(apples);
        System.out.println(oranges);
    }
}
