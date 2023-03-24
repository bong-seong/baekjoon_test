package baekjoon_test.백준_3003_킹퀸룩비숍나이트폰;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int[] chesse = { 1 , 1 , 2 , 2 , 2 , 8 };
		int i = 0;
		
		StringTokenizer st = new StringTokenizer( br.readLine() , " ");
		
		while( st.hasMoreTokens() ) {
			System.out.print( chesse[i] - Integer.parseInt( st.nextToken() )  + " ");
			i++ ;
		}
	}
}
