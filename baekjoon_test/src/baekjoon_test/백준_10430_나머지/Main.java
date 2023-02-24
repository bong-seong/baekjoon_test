package baekjoon_test.백준_10430_나머지;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		short a = scanner.nextShort();
		short b = scanner.nextShort();
		short c = scanner.nextShort();
		
		System.out.println( (a+b)%c );
		System.out.println( ((a%c)+(b%c))%c );
		System.out.println( (a*b)%c );
		System.out.println( ((a%c)*(b%c))%c );
	}
}
