package Arrays;

import java.util.Arrays;

public class references {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,4,5};
        int[] brr;
        brr=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(brr));
        System.out.println(Arrays.toString(arr));
    }
}
