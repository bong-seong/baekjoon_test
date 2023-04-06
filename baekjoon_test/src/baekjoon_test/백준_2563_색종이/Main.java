package baekjoon_test.백준_2563_색종이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int n = Integer.parseInt( br.readLine() ); // 색종이의 수
		int max = 0;
		
		int[][] array = new int[n][2]; 
		
		for( int i=0; i<n; i++ ) {
			
			StringTokenizer st = new StringTokenizer( br.readLine() , " ");
			
			for( int j=0; j<n; j++ ) {
				for( int k=0; k<st.countTokens(); k++ ) {
					array[i][j] = Integer.parseInt(st.nextToken()) ;
				}
			}
		}
		
		for( int i=0; i<n; i++ ) {
			for( int j=0; j<2; j++ ) {
				System.out.print( array[i][j] + " " );
			}
			System.out.println();
		}
		
		
	}
}
