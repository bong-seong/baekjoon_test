package baekjoon_test.백준_1316_그룹단어체커;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int n = Integer.parseInt( br.readLine() );
		
		int[] array;
		boolean result;
		int count = 0;
	
		
		for( int i=0; i<n; i++ ) {
			
			array = new int [ 26 ];
			String s = br.readLine();
			int index = s.charAt(0) - 'a';
			array[index]++;
			result = true;
			
			for( int j=1; j<s.length(); j++ ) {
				index = s.charAt(j) - 'a';
				
				if( s.charAt(j) != s.charAt(j-1) ) {
					
					array[index]++;
					
					if( array[index] == 2 ) {
						result = false;
						break;
					}
				}
			}
			if( result ) {
				count++;
			}
		}
		
		System.out.println( count );
	}
}
