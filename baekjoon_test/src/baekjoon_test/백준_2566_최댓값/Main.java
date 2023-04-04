package baekjoon_test.백준_2566_최댓값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int[][] array = new int[9][9];
		int max = -1;
		int row = 0;
		int col = 0;
		
		StringTokenizer st;
		
		for( int i=0; i<array.length; i++ ) {
			
			st = new StringTokenizer( br.readLine() , " " );
			
			for( int j=0; j<array.length; j++ ) {
				
				// 입력받은 값을 2차원배열에 저장 [0][0] 일때 3 >> [0][1] 일때 23 >>> [0][2] 일때 85 ......
				array[i][j] = Integer.parseInt( st.nextToken() );
				
				if( array[i][j] > max ) { // 대입된 값과 max 변수와 대입해서 max 보다 크면 대입 아니면 X
					max = array[i][j];
					row = i+1 ; 		// if 조건에의해 해당값이 맥스값일경우 row 변수에 행번호를 대입 이때, 
										// 인덱스로들어가기때문에 + 1 ... 1행 1열은 [0][0] 이다
					col = j+1 ;			// 행과 마찬가지로 열도 대입
				}
				
			}
		}
		
		System.out.println( max );
		System.out.print( row + " " + col );
		
	}
}
 