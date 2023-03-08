package baekjoon_test.백준_1330_두수비교하기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		short A = scanner.nextShort();
		short B = scanner.nextShort();
		
		if( A > B ) { System.out.println( ">" ); }
		else if( A < B ) { System.out.println( "<" );}
		else if( A == B ) { System.out.println( "==" );}
	}
}
