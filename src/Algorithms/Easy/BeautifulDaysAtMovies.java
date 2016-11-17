package Algorithms.Easy;

import java.util.Scanner;

/**
 * Created by Aakash on 11/16/2016.
 */
public class BeautifulDaysAtMovies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();
        int div = sc.nextInt();
        int count = 0;
        for (int i = st; i <= end; i++) {
            int ri = Integer.parseInt(new StringBuilder(i+"").reverse().toString());
            if((i - ri)%div == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
