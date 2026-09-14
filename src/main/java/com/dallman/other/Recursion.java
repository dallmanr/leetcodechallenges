package com.dallman.other;

public class Recursion {

    static void main() {
        System.out.println(addAllNumbersUpTo(100));
    }

    static int addAllNumbersUpTo(int n) {
        System.out.println(n);
        if (n > 0) {
            return n + addAllNumbersUpTo(n - 1);
        } else  {
            return 0;
        }
    }
}
