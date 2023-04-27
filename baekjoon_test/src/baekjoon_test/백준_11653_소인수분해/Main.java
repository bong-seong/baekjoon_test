package baekjoon_test.백준_11653_소인수분해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int n = Integer.parseInt( br.readLine() );
		
		if( n == 1 ) {
			return ;
		}
		
		int value = findValue(n);
		
		System.out.println( value );
		
		while( n > 0 ) {
			n = n/value;			
			value = findValue(n);
			if( value <= 0 ) {
				break;
			}
			System.out.println( value );
		}
		
	}
	
	public static int findValue( int n ) {
		
		int value = 0;
		
		for( int i=1; i<=n; i++ ) {
			if( n%i == 0 && i != 1 ) {
				value = i ;
				return value;
			}
		}
		return value;
	}
}