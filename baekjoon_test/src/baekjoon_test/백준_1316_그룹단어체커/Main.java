package baekjoon_test.백준_1316_그룹단어체커;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int n = Integer.parseInt( br.readLine() );
		int count = 0;
		int check = 0;
		
		for( int i=0; i<n; i++ ) {
			
			char[] array = br.readLine().toCharArray(); 
			
			for( int k=0; k<array.length; k++ ) {
				count = 0;
				if( array[k] != array[ k-1 < 0 ? 0 : k-1 ] ) {
					for( int j=0; j<array.length; j++ ) {
						if( array[k] == array[j] ) {
							count++;
						}
					}
				}
				if( count > 1 ) {
					break;
				}
			}
			check++;
		}
		System.out.println( check );
	}
}
