package baekjoon_test.백준_2720_세탁소사장동혁;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int t = Integer.parseInt( br.readLine() );
		
		for( int i=0; i<t; i++ ) {
			
			int quarter = 0;
			int dime = 0;
			int nickel = 0;
			int penny = 0 ;
			
			
			int value = Integer.parseInt( br.readLine() );
			
			quarter = value/25 ;
			if( value/25 > 4 ) {
				
			}
			if( value >= 100 ) {
				value = value - (( value/100 ) * 100);
			}
			
			dime = value/10;
			if( value >= 10 ) {
				
			}
			if( value >= 5 ) {
				
			}
			 
			
			System.out.print( quarter + " " + dime + " " + nickel + " " + penny + "\n");
		}
	}
}
