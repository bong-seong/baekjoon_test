package baekjoon_test.백준_2563_색종이;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		StringTokenizer st;
		
		int n = Integer.parseInt( br.readLine() );
		
		boolean[][] array = new boolean [100][100]; 
		
		for( int i=0; i<n; i++ ) {
			
			st = new StringTokenizer( br.readLine() , " ");
			
			int width = Integer.parseInt( st.nextToken() );
			int height = Integer.parseInt( st.nextToken() );
			
			for( int j=height; j<height+10; j++ ) {
				for( int k=width; k<width+10; k++ ) {
					array[j][k] = true;
					
				}
			}
		}
		
		int count = 0;
		
		for( int i=0; i<array.length; i++ ) {
			for( int j=0; j<array.length; j++ ) {
				if( array[i][j] ) {
					count++;
					
				}
				System.out.print( array[i][j] + "\n");
			}
		}
		System.out.println(count);
	}
}