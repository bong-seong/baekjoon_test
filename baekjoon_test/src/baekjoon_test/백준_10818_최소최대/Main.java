package baekjoon_test.백준_10818_최소최대;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 입력객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 추후 입력되는 값의 수 
		int N = scanner.nextInt();
		
		int max = -1000001; // max 초기값 설정
		int min = 1000001; // min 초기값 설정 
		
		// N 의 수만큼 반복하여 i 증가하며 a 를 입력받아 비교한다.
		for( int i=0; i<N; i++ ) {
			int a = scanner.nextInt();
			if( min > a ) { // 입력값 a 가 min 보다 작을때 min 에 a값 대입 
				min = a; // 만약 a 가 20 이라면 1000001 > 20 true 로 min = 20 
			}			// 이후, 반복문에의해 a 에 10 입력되는경우 20 > 10 true 로 min = 20 ... 최종적으로 입력값중 가장 작은수가 min 에 대입
			if( max < a ) { // 입력값 a 가 max 보다 클경우 a 값에 대입 
				max = a; // 만약 a가 20 이라면 -1000001 < 20 true 로 max = 20 대입
			}			// 이후 반복문에 의해 a 에 10 입력되는경우 20 < 10 false 로 max = 20 유지 .. 최종적으로 입력값중 가장 큰 값이 max 에 대입 
		}
		System.out.println( min + " " + max );
	}
}
