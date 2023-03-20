package baekjoon_test.백준_10807_개수세기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 입력받기 위한 입력객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 배열의 개수를 입력받아 할당할것이므로 해당 갯수도 입력받음
		byte amount = scanner.nextByte();
		
		// 새로운 배열을 선언 , 이때 배열의 길이는 입력받는다.
		byte[] value = new byte[ amount ];
		
		// 추후, 정수가 몇개인지 카운트하기 위한 변수 선언
		byte count = 0;
		
		// for 반복문을 활용하여 배열의 길이만큼 반복하여 배열에 값 입력
		for( int i=0; i<value.length; i++ ) {
			value[i] = scanner.nextByte();
		}
		
		// 배열내에 있는 수와 비교할 수를 입력받는 변수 선언 
		byte ch = scanner.nextByte() ;
		
		// for 반복문을 활용하여 배열 내 값들을 모두 입력받은 ch 값과 대입하고, 만약에 ch와 배열내 값이 일치할경우 count 1씩 증가
		for( int i=0; i<value.length; i++ ) {
			if( ch == value[i] ) {
				count++;
			}
		}
		
		// count 콘솔출력 ( 배열 내 입력한 ch 값이 몇개인지 찾아 콘솔로 출력
		System.out.println( count );
	}
	
}

/*

	총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
	
	첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 
	셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
	
	첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
	
	11
	1 4 1 2 4 2 4 2 3 4 4			3
	2

*/