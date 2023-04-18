package baekjoon_test.백준_1193_분수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int x = Integer.parseInt( br.readLine() );
		
		int max = 1;	// 증가한 범위의 최대값
		int i = 2;		// 증가값
		
		while( x > max ) {
			
			max += i; 
			i++;
		}
		// System.out.println( "max : " + max );
		// System.out.println( "i : " + (i-1) );
		
		int min = max - (i-2) ; // 최소값 
		int location = 0;
		
		// System.out.println("min : " + min );
		
		for( int j=min; j<=max; j++ ) {
			if( j > x ) {
				break;
			}
			location++;
		}
		// System.out.println("location : " + location );
		
		int mo = i;
		int ja = 0;
		
		for( int j=0; j<location; j++ ) {
			ja++;
			mo--;
		}
		System.out.println( ja+"/"+mo );
	}
}

/*

	1				+2 1		+1
	2 3				+3 2		+2
	4 5 6			+4 3		+3
	7 8 9 10		+5 4		+4
	11 12 13 14 15	+6 			+5
	16 17 18 19 20 21
	
	분모는 감소
	분자는 증가
	

 */
