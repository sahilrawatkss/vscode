package dsa.array;

import java.util.Scanner;

public class manupulate {
    public static void main(String[] args) {

        int n, k, l;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[][] arr2 = new int[k][3];
        int[][] arr = new int[k][n];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                l = i;
                while (l < k) {
                    if (j >= arr2[i][0] && j <= arr2[i][1]) {
                        arr[l][j] = arr[l][j] + arr2[i][2];
                    }
                    l++;
                }
                if (arr[i][j] > sum) {
                    sum = arr[i][j];
                }
            }

        }

        System.out.println(sum);

    }
}
