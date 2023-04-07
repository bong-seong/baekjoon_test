package baekjoon_test.백준_2745_진법변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		StringTokenizer st = new StringTokenizer( br.readLine() , " ");
		
		String n = st.nextToken();
		int b = Integer.parseInt( st.nextToken() );
		
		long result = 0;	// 결과를 저장 할 변수
		int num = 0; 		// 실제 값이 들어가는 변수
		int square = 0; 	// 제곱 승
		
		for( int i=0; i<n.length(); i++ ) {
			
			char c = n.charAt(i);	// char 자료형에 입력받은값의 i번째 대입
			
			if( c >= '0' && c<= '9' ) { // 만약에 c 가 문자가아닌 0~9 사이일경우 
				num = c - '0' ; // 0 의 아스키코드값은 30 >> 1 = 31 , 2 = 32 ..... 때문에 숫자인 경우 실제값을 집어넣기위해 '0' = 30 을 빼고 넣는다
			}else {
				num = c - 55 ; // A=65 ~ Z=90  16,36 진법의 경우 A 값은 10진법 수로 10 , 36진법에서 Z 값은 10진법 수로 35 // 때문에 -55를 일괄적으로 하면 실제 10진법으로 표시했을때의 값을 얻을 수 있음
			}
			result += num * Math.pow( b, square++ );
		}
		System.out.println( result );
	}
}

/*
 
 	36의0승	35*1					35
	36의1승	35*36					1,260
	36의2승	35*36*36				45,360 
	36의3승	35*36*36*36		`		1,632,960 
	36의4승	35*36*36*36*36			58,786,560
	
	모두 더한값 > 결과
 
 */
