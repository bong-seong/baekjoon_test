package baekjoon_test.백준_2438_별찍기1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) ;
		
		String star = "";
		for( int i=0; i<n; i++ ) {
			star += "*";
			System.out.println( star );
		}
		
	}
}
