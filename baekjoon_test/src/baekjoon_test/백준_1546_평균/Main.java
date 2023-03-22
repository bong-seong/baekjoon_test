package baekjoon_test.백준_1546_평균;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt(); 			// 과목갯수
		int m = 0;							// 최고점
		int[] score = new int [ n ];		// 입력점수
		double[] fake = new double[ n ];	// 입력점수계산				
		double sum = 0;						// 계산된점수의 총 합
		double result = 0; 					// 새로운 평균
		
		for( int i=0; i<n; i++ ) {
			
			score[i] = scanner.nextInt();
			if( score[i] > m ) {
				m = score[i];
			}
			System.out.println("score : " + score[i] );
		}
		System.out.println( score[0] +" "+ score[1] +" "+ score[2] );
		System.out.println( m );
		
		for( int i=0; i<n; i++ ) {
			fake[i] = score[i]/m*100;
			System.out.println( fake[i] );
			sum += fake[i];
			System.out.println( sum );
		}
		
		result = sum/n;
		System.out.println( result );
		
		
	}
}
/*
	세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 
	이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
	예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
	세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
	
	첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 
	이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
	
	첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
	
	3
	40 80 60 							75.0
	
	3
	10 20 30							66.666667
	
	4
	1 100 100 100						75.25
	
	5
	1 2 4 8 1 16						38.75
*/
