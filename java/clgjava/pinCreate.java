package clgjava;

import java.util.Scanner;

public class pinCreate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Codes:");
        int pin1 = sc.nextInt();
        int pin2 = sc.nextInt();
        int pin3 = sc.nextInt();
        int pass = 0;
        int max = 0;
        int min = 0;
        int i = 1;
        while (i < 4) {
            max = Math.max(pin1 % 10, max);
            max = Math.max(max, pin2 % 10);
            max = Math.max(max, pin3 % 10);
            min = Math.min(pin1 % 10, pin2 % 10);
            min = Math.min(pin3 % 10, min);
            pass = 10 * pass + min;
            pin1 = pin1 / 10;
            pin3 = pin3 / 10;
            pin2 = pin2 / 10;
            i++;
        }
        pass = pass * 10 + max;
        StringBuilder pins=new StringBuilder(String.valueOf(pass));
        System.out.println("Pin:"+pins.reverse());
    }
}

