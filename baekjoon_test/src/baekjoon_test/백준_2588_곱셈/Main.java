package baekjoon_test.백준_2588_곱셈;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		short a = scanner.nextShort();
		short b = scanner.nextShort();
		
		System.out.println( b%10 * a);
		System.out.println( ((b%100)/10) * a  );
		System.out.println( (b/100) * a );
		
	}
}
