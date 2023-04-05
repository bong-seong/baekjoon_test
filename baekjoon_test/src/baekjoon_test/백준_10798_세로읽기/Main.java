package baekjoon_test.백준_10798_세로읽기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		char[][] array = new char[5][15]; 	// 고정 2차원배열 선언 (1~15 글자 입력이됨) 
		String value = null;				// 입력값을 받은 변수 선언
		int max =0;							// 입력받은 값의 길이를 담을 변수
		
		for( int i=0; i<5; i++ ) { // 배열명[][] 에서 앞쪽에 해당하는 인덱스를 위한 for 문 5 고정크기
			
				// 변수 입력받기
				value = br.readLine() ;
				
				if( value.length() > max ) {
					// 만약에 입력받은 값이 max 값보다 클시 max 변수에 길이 대입
					max = value.length();
				}
				
				for( int j=0; j<value.length(); j++ ) {
					// array[i][j] 에 순서대로 입력받은 값 대입
					array[i][j] = value.charAt(j);
				}
		}
	
		for( int i=0; i<max; i++ ) {
			for( int j=0; j<5; j++ ) {
				
				if( array[j][i] == '\0') continue;
				System.out.print(array[j][i]);
				
			}
		}
		
		/*
		 	출력부 
		 	- 출력시 세로로 출력을 해야함 >> [0][0] [1][0] [2][0] ..... 
		 	때문에, for 문을 저장할때와 반대로 돌려 출력 
		 	이때 값이 없을경우 continue ( [][] 에서 두번째 [] 는 길이가 고정이아닌 가변이기때문에 값이 없을수도 있음 때문에 초기값인 '\0' 일경우
		 	countinue
		 */
		 
	}
}
