package baekjoon_test.백준_2798_블랙잭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		StringTokenizer st = new StringTokenizer( br.readLine() , " " );
		
		int n = Integer.parseInt( st.nextToken() );
		int m = Integer.parseInt( st.nextToken() );
		
		st = new StringTokenizer( br.readLine() , " " );
		
		int[] array = new int[n];
		int result = 0;
		
		for ( int i=0; i<n; i++ ) {
			array[i] = Integer.parseInt( st.nextToken() ) ;
		}
		
		
		// 삼중 FOR 반복문 사용 
		// 배열에 입력된 수가 5 6 7 8 9 라 가정했을때
		/*
		   	5 + 6 + 7
		   	5 + 6 + 8
		   	5 + 6 + 9
		   	5 + 7 + 8
		   	5 + 7 + 9
		   	...
		   	
		   	모든 수를 대입하여 세개의 수를 sum 
		   	
		 */
		for( int i=0; i<n-2; i++ ) {
			for( int j=i+1; j<n-1; j++ ) {
				for( int k=j+1; k<n; k++ ) {
					
					int sum = array[i] + array[j] + array[k] ;
					
					if( sum == m ) {
						result = sum ;
						break;
					}
					
					if( result < sum && sum < m ) {
						result = sum ;
					}
				}
			}
		}
		
		System.out.println( result );
	}
}
