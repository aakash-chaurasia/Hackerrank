package Algorithms.Medium;

import java.util.Scanner;

/**
 * Created by Aakash on 10/29/2016.
 */
public class kangaroo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if(((x1 < x2 && y1 > y2) || (x1 > x2 && y1 < y2)) && (x1 -x2)%(y1 -y2) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
