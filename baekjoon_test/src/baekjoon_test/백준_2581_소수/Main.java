package baekjoon_test.백준_2581_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int m = Integer.parseInt( br.readLine() );
		int n = Integer.parseInt( br.readLine() );
		
		int length = n-m; 
		
		if( length <= 0 ) { // ArrayIndexOutOfBoundsException 예외를 방지하기 위한 코드
			length = 1;		// 배열의 길이를 n-m 으로 했다고 가정, 조건에서 m 은 n과 같거나 작은수라고했을때 n == m 일때 배열의 길이가 0이 되어버림
		}					// 하여 예외가 발생하며 오류가 날 수 있음 그래서 해당사항을 방지하기 위해 n과 m 이 같을경우 1을 대입
		
		int[] array = new int[ length ];
		int index = 0;
		int sum = 0;
		
		for( int i=m; i<=n; i++ ) {
			
			int count = 0;
			
			for( int j=1; j<=i; j++ ) {
				if( i%j == 0 ) {
					count++;
				}
			}
			
			if( count == 2 ) {
				array[index] = i;
				index++;
			}
		}
		
		for( int i=0; i<array.length; i++ ) {
			if( array[i] == 0 ) { 
				break; 
			}
			sum += array[i];
		}
		
		if( array[0] == 0 ) {
			System.out.println(-1);
		}else {
			System.out.println( sum );
			System.out.println( array[0] );
		}		
	}
}
