package baekjoon_test.백준_2903_중앙이동알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class vari {

	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int n = Integer.parseInt( br.readLine() );
		int result = 1;
		
		for( int i=0; i<n; i++ ) {
			result *= 2 ;
		}
		System.out.println( (result+1)*(result+1) );
	}
}
