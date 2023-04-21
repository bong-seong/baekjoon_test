package baekjoon_test.백준_2501_약수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		StringTokenizer st = new StringTokenizer( br.readLine() , " " );
		
		int n = Integer.parseInt( st.nextToken() );
		int k = Integer.parseInt( st.nextToken() );
		
		int[] array = new int [n];
		int i = 1;
		
		while( n >= i ) {
			array[i-1] = n%i ;
			i++;
		}
		
		int count = 0;
		
		for( int j=0; j<array.length; j++ ) {
			if( array[j] == 0 ) {
				count++;
			}
			if( count == k ) {
				System.out.println( j+1 );
				break;
			}
		}
		if( count < k ) {
			System.out.println( 0 );
		}
	}
}
