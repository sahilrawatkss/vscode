//package dsa.array;
//import java.util.Scanner;
//
//public class newmanupulate {
//    public static void main(String[] args) {
//
//        int n, k, l;
//        long sum = 0;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        k = sc.nextInt();
//
//        long[][] arr2 = new long[k][3];
//        long[][] arr = new long[k][n];
//
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr2[i][j] = sc.nextLong();
//            }
//        }
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < n; j++) {
//                l = i;
//                while (l < k) {
//                    if (j >= arr2[i][0] && j <= arr2[i][1]) {
//                        arr[l][j] = arr[l][j] + arr2[i][2];
//                    }
//                    l++;
//                }
//                if (arr[i][j] > sum) {
//                    sum = arr[i][j];
//                }
//            }
//
//        }
//
//        System.out.println(sum);
//
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println("");
//        }
//    }
//}
//
