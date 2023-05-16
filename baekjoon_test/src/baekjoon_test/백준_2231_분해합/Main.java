package baekjoon_test.백준_2231_분해합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int n = Integer.parseInt( br.readLine() );
		
		int value = 0;
		
		for( int i=0; i<n; i++ ) {
			
			String toString = Integer.toString( i );
			
			if( i == value ) {
				System.out.println();
			}
			
		}
		
		// 자리수구하기
	}
}
