package baekjoon_test.백준_2744_대소문자바꾸기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in) );
		
		char[] array = br.readLine().toCharArray();
		
		for( int i=0; i<array.length; i++ ) {
			if( array[i] > 91 ) { // 대문자이면
				array[i] = (char)(array[i] - 32);
			}else {
				array[i] = (char)(array[i] + 32);
			}
		}
	}
}

// 65~90 대문자 , 97~122 소문자
