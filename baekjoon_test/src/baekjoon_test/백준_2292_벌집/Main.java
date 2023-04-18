package baekjoon_test.백준_2292_벌집;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int n = Integer.parseInt( br.readLine() );
		int count = 1;
		int range = 2;
		
		if( n == 1 ) {
			System.out.print( 1 );
		}else {
			while( range <= n ) {
				range = range+(6*count) ;
				count++;
			}
			System.out.print( count );
		}
	}
}
/* 
	13+6*1 = 19 ++ false
	= 2
	
	
*/