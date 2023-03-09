package baekjoon_test.백준_2884_알람시계;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextByte();
		int M = scanner.nextByte();
		
		if( M-45 < 0 ) {
			M = 60-45+M;
			H--;
		}
	}
}
