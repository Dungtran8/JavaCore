package com.onemount;

public class Factorial {
	
	public static long factorial1(int n) {
        long rs = 1;
        if (n == 0 || n == 1) {
            return rs;
        } else {
            for (int i = 2; i <= n; i++) {
                rs *= i;
            }
            return rs;
        }
    }
	 
	public static long factorial2(int n) {
        if (n > 0) {
            return n * factorial2(n - 1);
        } else {
            return 1;
        }
    } // Su dung de quy
	
	public static void main(String[] args) {
		int a = 5;
		System.out.println("Giai thua cua "+ a + " la: " + factorial1(a));
		System.out.println("Giai thua cua "+ a + " la: " + factorial2(a));
	}
}
