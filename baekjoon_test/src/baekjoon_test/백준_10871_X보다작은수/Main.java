package baekjoon_test.백준_10871_X보다작은수;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		// 입력객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 배열의 길이를 입력받을 변수 선언
		int amount = scanner.nextInt();
		
		// 배열에 저장된 값과 비교할 값을 받을 변수 선언
		int x = scanner.nextInt();
		
		// 값이 들어갈 배열 선언 이때 길이는 입력받은 amount 로 함
		int[] array = new int[ amount ];
		
		// for 반복문을 활용하여 길이만큼 ( array.length 또는 amount ) 반복하고 i 1씩증가
		for( int i=0; i<amount; i++ ) {
			// 배열의 i 번째에 입력값 반복 대입
			array[i] = scanner.nextInt();
		}
		
		// for 반복문을 활용하여 배열내 값이 입력받은 x 의 값보다 작다면 print 
		for( int i=0; i<amount; i++ ) {
			if( array[i] < x ) {
				System.out.print( array[i]+" ");
			}
		}
	}
}

/*

	정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

	첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
	둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

	X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

	10 5									1 4 2 3
	1 10 4 9 2 3 8 5 7 6

*/