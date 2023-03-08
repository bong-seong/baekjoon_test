package baekjoon_test.백준_9498_시험성적;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		byte score = scanner.nextByte();
		
		if( score <= 100 && score >= 90 ) {
			System.out.println( "A" );
		}else if( score <= 89 && score >= 80) {
			System.out.println( "B" );
		}else if( score <= 79 && score >= 70 ) {
			System.out.println( "C" );
		}else if( score <= 69 && score >= 60 ) {
			System.out.println( "D" );
		}else {
			System.out.println( "F" );
		}
		
	}
}
