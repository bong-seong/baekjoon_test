package baekjoon_test.백준_19532_수학은비대면강의입니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		StringTokenizer st = new StringTokenizer( br.readLine() , " ");
		
	
		int a = Integer.parseInt( st.nextToken() );
		int b = Integer.parseInt( st.nextToken() );
		int c = Integer.parseInt( st.nextToken() ); // 위쪽 식 답
		
		int d = Integer.parseInt( st.nextToken() );
		int e = Integer.parseInt( st.nextToken() ); 
		int f = Integer.parseInt( st.nextToken() ); // 아래쪽 식 답
		
		for( int x = -999; x<=999; x++ ) {
			
			int sum1 = 0 ;
			int sum2 = 0 ;
			
			for( int y = -999; y<=999; y++ ) {
				
				sum1 = (a*x) + (b*y);
				sum2 = (d*x) + (e*y);
				
				if( sum1 == c && sum2 == f) {
					System.out.println( x + " " + y );
				}
			}
		}
	}
}

/*
	
	1x + 3y = -1  >> 
	4x + 1y = 7
	
	x = -3y-1
	4(-3y-1)+1y= 7
	
	-12y-4+y =7
	
	-12y+y = 11
	
	-11y=11
	
	y = -1
	
	x + 3(-1) = -1
	x - 3 = -1
	
	x = 2
	
*/
