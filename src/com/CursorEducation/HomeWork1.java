package com.CursorEducation;

public class HomeWork1 {
    public static void main(String[] args) {
        byte b = 12;
        short sh = 55;
        int i = 100;
        long l = -123;
        float f = 134.54f;
        double d = -55.654;

        char a = 'b';
        boolean isTrue = true;

        System.out.println(b + d);
        System.out.println(i - sh);
        System.out.println(l * i);
        System.out.println(f / d);
        System.out.println(a + " " + i);
        System.out.println(isTrue);

        int j;
        for (j = 100; j <= 102; j++) {
            System.out.println("Operation increment from 100 to " + j);
        }
        while (j > 100) {
            System.out.println("Operation decrement from 102 to " + j);
            j--;
        }
    }
}
