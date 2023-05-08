package baekjoon_test.백준_11653_소인수분해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int n = Integer.parseInt( br.readLine() );
		
		if( n == 1 ) {
			return ;
		}
		
		int value = findValue(n);
		
		System.out.println( value );
		
		while( n > 0 ) {
			n = n/value;			
			value = findValue(n);
			if( value <= 0 ) {
				break;
			}
			System.out.println( value );
		}
		
	}
	
	// 각 수의 최소 약수값을 찾기 위한 함수
	// 특정 수를 소인수분해하기위해선 최종 소수가 나올때까지 최소 약수로 나누어주어야한다.
	// 때문에 반복적인 작업이 필요한대 이때문에 따로 함수를 구성하여 최소약수를 매번 구하는데에 활용하였다.
	public static int findValue( int n ) {
		
		int value = 0;
		
		for( int i=1; i<=n; i++ ) {
			if( n%i == 0 && i != 1 ) {
				value = i ;
				return value;
			}
		}
		return value;
	}
}