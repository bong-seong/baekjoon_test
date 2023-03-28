package baekjoon_test.백준_4344_평균은넘겠지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		StringTokenizer st = new StringTokenizer( br.readLine() , " " );
		
		int c = Integer.parseInt( st.nextToken() );	
		int sum = 0;
		int result = 0 ;
		
		while( st.hasMoreTokens() ) {
			
			int[] score = new int[ c ];
			
			sum += Integer.parseInt( st.nextToken() );
			result = sum / c ;
			
			
		}
		
		
		System.out.println( sum );
		System.out.println( result );
	}
}
