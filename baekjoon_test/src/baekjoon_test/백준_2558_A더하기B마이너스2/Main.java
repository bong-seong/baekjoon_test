package baekjoon_test.백준_2558_A더하기B마이너스2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int a = Integer.parseInt( br.readLine() );
		int b = Integer.parseInt( br.readLine() );
		
		System.out.println( a+b );
	}
}
