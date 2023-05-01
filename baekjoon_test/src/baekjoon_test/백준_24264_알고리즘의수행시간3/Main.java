package baekjoon_test.백준_24264_알고리즘의수행시간3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in) );
		
		long n = Long.parseLong( br.readLine() );
		
		System.out.println( n*n );
		System.out.println( 2 );
		
	}
}
/*

	자료형 주의 최대 n 값 500,000 이므로 500,000 x 500,000 이면 int 범위를 초과한다.

*/