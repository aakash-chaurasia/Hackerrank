package Algorithms.Easy;

import java.util.Scanner;

/**
 * Created by Aakash on 10/29/2016.
 */
public class CutTheSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        for(int arr_i=0; arr_i < n; arr_i++){
            int temp = in.nextInt();
            arr[arr_i] = temp;
        }

        CutTheSticks obj = new CutTheSticks();
        obj.cutSticks(arr);

    }

    private void cutSticks(int[] arr) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i : arr) {
            if(i > 0) {
                count++;
                if(i < min) {
                    min = i;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] -= min;
        }
        if(count != 0) {
            System.out.println(count);
            cutSticks(arr);
        }
    }
}
