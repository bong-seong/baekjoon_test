package baekjoon_test.백준_11720_숫자의합;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int n = Integer.parseInt( br.readLine() );
		
		String[] array = new String[ n ];
		array = br.readLine().split("");
		
		int result = 0;
		
		for( int i=0; i<n; i++ ) {
			result += Integer.parseInt( array[i] );
		}
		System.out.println( result );
		
	}
}
