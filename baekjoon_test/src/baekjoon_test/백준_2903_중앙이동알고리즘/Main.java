package baekjoon_test.백준_2903_중앙이동알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		
		// ((2의n제곱+1)+(2의n-1제곱)) X ((2의n제곱+1)+(2의n-1제곱))
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int n = Integer.parseInt( br.readLine() ) ;
		
		
		double a = Math.pow(2, n)+1 ;
		
		
		System.out.println( (int)(a*a) ) ;
	}
}
