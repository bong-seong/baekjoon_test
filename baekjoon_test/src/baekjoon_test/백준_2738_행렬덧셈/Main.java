package baekjoon_test.백준_2738_행렬덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() , " " );
		
		int n = Integer.parseInt( st.nextToken() );
		int m = Integer.parseInt( st.nextToken() );
		
		int[][] arrayA = new int[n][m];
		
		for( int i=0; i<n; i++ ) {
			for( int j=0; j<m; i++ ) {
				
				st = new StringTokenizer( br.readLine() );
				
				arrayA[i][j] = Integer.parseInt( st.nextToken() );
				
			}
		}
		
		/*
		 	A array
		 	
		 	[0][0] = 1	/	[0][1] = 1	/	[0][2] = 1
		 	[1][0] = 2	/   [1][1] = 2  /   [1][2] = 2
		 	[2][0] = 0  /   [2][1] = 1  /   [2][2] = 0
		 	
		 	B array
		 	
		 	[0][0] = 3	/	[0][1] = 3	/	[0][2] = 3
		 	[1][0] = 4	/   [1][1] = 4  /   [1][2] = 4
		 	[2][0] = 5  /   [2][1] = 5  /   [2][2] = 100
		 	
		 	으로, 각각 A[0][0] + B[0][0] / A[0][1] + B[0][1] .... 
		 	
		 	때문에 출력은 
		 	4 4 4
		 	6 6 6
		 	5 6 100
		 
		 
		 */
		
		
	}
}
