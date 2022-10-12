package com.datastrc;
//2D arrays
public class P2 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];

        int[][] b = {{10, 20, 30}, {10, 200, 30}, {100, 20, 300}};
        //System.out.println(b[0][1]);//op-20
        //enhanced for loop
        for (int[] i : b) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i[j] + " ");
            }
            System.out.println();
    }
            int[] c = {10, 20, 10, 30, 40, 20};
            for (int m = 0; m < c.length; m++) {
                for (int j = m + 1; j < c.length; j++) {
                    if (c[m] == c[j]) {
                        System.out.println(c[m]);
                    }
                }
            }
            //only for 0-9
            int[] arr = {1, 1, 0, 3, 4};
            for (int k = 0; k < arr.length; k++) {
                arr[arr[k] % arr.length] = arr[arr[k] % arr.length] + arr.length;
            }
            for (int l = 0; l < arr.length; l++) {
                if (arr[l] >= arr.length * 2) {
                    System.out.print(l + " ");
                }
            }

        }



}
