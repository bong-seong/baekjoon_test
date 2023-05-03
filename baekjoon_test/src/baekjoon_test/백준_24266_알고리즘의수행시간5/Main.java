package baekjoon_test.백준_24266_알고리즘의수행시간5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		BigInteger n = new BigInteger( br.readLine() );
		
		System.out.println( n.pow(3) );		
		System.out.println( 3 );
		
	}
}
