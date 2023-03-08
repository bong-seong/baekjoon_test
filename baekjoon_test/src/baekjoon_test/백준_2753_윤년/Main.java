package baekjoon_test.백준_2753_윤년;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		short value = scanner.nextShort();
		
		if( value%4 == 0 && value%100 != 0 || value%400 == 0 ) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}
}
