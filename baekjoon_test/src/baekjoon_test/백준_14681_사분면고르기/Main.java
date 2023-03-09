package baekjoon_test.백준_14681_사분면고르기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		short x = scanner.nextShort();
		short y = scanner.nextShort();
		
		if( x > 0 && y > 0 ) {
			System.out.println(1);
		}else if( x < 0 && y > 0 ) {
			System.out.println(2);
		}else if( x < 0 && y < 0 ) {
			System.out.println(3);
		}else if( x > 0 && y < 0 ) {
			System.out.println(4);
		}
		
	}
}
