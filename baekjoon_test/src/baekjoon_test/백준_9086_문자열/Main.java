package baekjoon_test.백준_9086_문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in ) );
		
		int t = Integer.parseInt( br.readLine() );
		String[] array = new String[ t ];
		
		for( int i=0; i<t; i++ ) {
			array[i] = br.readLine();
		}
		
		for( int i=0; i<t; i++ ) {
			System.out.println( array[i].charAt(0) + "" + array[i].charAt( array[i].length() - 1) );
		}
	}
}
