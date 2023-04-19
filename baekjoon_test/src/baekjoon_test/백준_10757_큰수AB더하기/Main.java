package baekjoon_test.백준_10757_큰수AB더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		StringTokenizer st = new StringTokenizer( br.readLine() , " " );
		
		char[] Aarray = st.nextToken().toCharArray();
		char[] Barray = st.nextToken().toCharArray();
		int index = 1;
		
		int[] result;
		
		while( Aarray.length > index || Barray.length > index ) {
		
			int a = Aarray[ Aarray.length-index ] - '0' ;
			int b = Barray[ Barray.length-index ] - '0' ;
			
			
			
			index++;
		}
	}
}

/*
9223372036854775807 
9223372036854775808
*/