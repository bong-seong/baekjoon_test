package baekjoon_test.백준_1978_소수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int n = Integer.parseInt( br.readLine() );
		
		StringTokenizer st = new StringTokenizer( br.readLine() , " " );
		
		
		int realcount = 0; // 실제 소수에 해당하는경우 증가시킬 변수
		
		for( int i=0; i<n; i++ ) {
			
			int count = 0; // 소수인지아닌지 판단하기 위해 선언한 함수
			
			int value = Integer.parseInt( st.nextToken() );
			// 소수인지 판단할 값이 저장 
			
			for( int j=1; j<=value; j++ ) { // 소수판단할 값 만큼 반복하여 나머지를 구한다
				if( value%j == 0 ) { // 이때 나머지가 0 일경우
					count++; // count 증가
				}
			}
			
			if( count == 2 ) { // 만약에 count 가 2이면 , 소수 특성상 1과 본인과같은값 딱 둘로만 나눌수있기에 2인경우 소수
				realcount++; // 소수의 갯수 카운트를 증가시킨다.
			}
		}
		
		System.out.println( realcount );
		
	}
}
