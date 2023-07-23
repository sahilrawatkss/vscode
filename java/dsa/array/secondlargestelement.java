package dsa.array;

public class secondlargestelement {
    public static void main(String[] args) {
        int[] arr = new int[]{100, 40, 3, 45, 67, 8, 1, 12};
        int first, second, third;
        first = second = third = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
        }
            System.out.println("Second largest number is " + second);
        }
    }