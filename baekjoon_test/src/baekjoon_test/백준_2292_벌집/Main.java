package baekjoon_test.백준_2292_벌집;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int n = Integer.parseInt( br.readLine() );
		int i = 1;
		int range = 2;
		
		if( n == 1 ) {
			i = 1;
		}else {
			while( range <= n ) {
				range = n+6*i ;
				i++;
			}
		}
		
		
		
		System.out.println( i );
	}
}
/* 
	13+6*1 = 19 ++ false
	= 2
	
	
*/