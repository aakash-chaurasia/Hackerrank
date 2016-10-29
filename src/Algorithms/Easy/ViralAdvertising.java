package Algorithms.Easy;

import java.util.Scanner;

/**
 * Created by Aakash on 10/29/2016.
 */
public class ViralAdvertising {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int target = 5;
        while(n-- > 0){
            int temp = target/2;
            res += temp;
            target = temp*3;
        }
        System.out.println(res);
    }
}
