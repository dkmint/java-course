package com;

public class Main {

    public static void main(String[] args) {
		byte b = 100;
		short sh = 200;
		int i = 40000;
		long l = 50000 + (b + sh + i) * 10;
        System.out.println(l);
        short shTotal = (short) (1000 + 10 * (b + sh + i));
		System.out.println(shTotal);
		float f = 5.25f;

		double convert = 0.45359237;
		double pd = 200;
		double kg = pd * convert;
		System.out.println(kg);

		char ch = 'D';
		char uch = '\u0044';
		char cch = '\u00A9';
		System.out.println(ch);
		System.out.println(uch);
		System.out.println(cch);
	}
}
