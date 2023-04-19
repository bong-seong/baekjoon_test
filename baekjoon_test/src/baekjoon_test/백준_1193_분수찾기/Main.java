package baekjoon_test.백준_1193_분수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int x = Integer.parseInt( br.readLine() );
		
		int max = 1;	// 그룹 내 최대값
		int i = 2;		
		
		while( x > max ) {  // 입력받은 값이 max 값 보다 작을때까지 반복 
			max += i; 		// 각 그룹은 첫번째 1 이후 +2 , +3 , +4 의 규칙을 가짐 때문에 두번째 그룹의 최대값은 3, 세번째그룹의 최대값은 6 ... 
			i++;			// 하여, 해당 규칙으로 최대값을 찾음
		}
		// System.out.println( "max : " + max );
		// System.out.println( "i : " + (i-1) );
		
		int min = max - (i-2) ; // 최소값 // 최소값의 경우 max 값에서 그룹번째(i) - 2 
		/*
		 	만약 네번째 그룹이라면 
		 	11 12 13 14 15 가 해당하고 위 while 문에 의해 i 값은 6이 된다 
		 	이때, i 값에 -2 한후 max(15) - 4 = 11 이라는 최소값 결과를 확인할 수 있다.
		 	
		 	다섯번째 그룹은 
		 	16 17 18 19 20 21 , i 값은 7
		 	21-7-2 = 16 
		 	
		 	위와같은 패턴을 확인 할 수 있다.
		 	
		 */
		int location = 0; // 그룹내 몇번째인지 찾아 저장할 변수
		
		// System.out.println("min : " + min );
		
		if( i%2 == 0 ) { // 그룹번째가 짝수인지 홀수인지에따라 정방향으로 위치를 체크할지 , 역방향으로 체크할지 ( 지그재그이므로 )
			for( int j=max; j>=min; j-- ) { // i 값에 따라 결정되며 각각 홀수번째는 위에서 아래대각선으로 향한다.
				if( j < x ) {				// 짝수일 경우 아래에서 위대각선방향으로 순서 결정
					break;					// 때문에 if 조건으로 홀수,짝수일 경우 for 반복문을 다르게사용하여 위치값을 구해 저장한다.
				}
				location++;
			}
		}else {
			for( int j=min; j<=max; j++ ) {
				if( j > x ) {
					break;
				}
				location++;
			}
		}
		
		// System.out.println("location : " + location );
		
		int mo = i;
		int ja = 0;
		
		for( int j=0; j<location; j++ ) { // 이렇게 구해진 위치에 분수 규칙을 정의한다.
			ja++;							// 분수의 경우 위치가 대각선 아래로갈수록 분모가 감소하고 분자는 반대로 증가하게된다
			mo--;							// 해당 규칙을 표현
		}
		System.out.println( ja+"/"+mo );
	}
}

/*

	1				+2 1		+1
	2 3				+3 2		+2
	4 5 6			+4 3		+3
	7 8 9 10		+5 4		+4
	11 12 13 14 15	+6 			+5
	16 17 18 19 20 21
	
	분모는 감소
	분자는 증가
	

 */
