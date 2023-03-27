package baekjoon_test.백준_1157_단어공부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		char[] array = br.readLine().toCharArray();	// 입력값을 받아 char 배열에 각각 저장
		int[] count = new int[26];					// 값을 비교 후 빈도수를 확인하기 위한 배열
		int max = -1;								// 최대값 비교를 위한 변수 선언
		char c = 0;									// 실제 결과값을 대입할 변수 선언


		// for 반복문 실행
		for( int i=0; i<array.length; i++ ) {
			if ( ( array[i] >= 65 && array[i] <= 90 ) ) {	// 만약에 입력받은 값이 대문자 알파벳 범위 내에 있을경우 아스키코드값 A [65] ~ Z [90]
				count[ array[i] - 'A' ] ++ ;				// 알파벳범위의 배열에 해당하는 인덱스번째 구하기 ( 만약에 'C' 인 경우 아스키코드값 67 >> 65를 빼게되면 2
			}												// >> 0번째 인덱스자리 [a]
															// >> 1번째 인덱스자리 [b]
															// >> 2번째 인덱스자리 [c] ... 그러므로 해당하는 알파벳번째의 인덱스값 ++ 증가

			if( ( array[i] >= 97 && array[i] <= 122 ) ) {	// 대소문자를 구별하지 않으므로 두번째 if 문으로 소문자일경우도 동시에 체크하여 해당하는 알파벳번째의 값을 ++ 증가
				count[ array[i] - 'a' ] ++ ;
			}
		}

		// 위 알고리즘에 의해 최종적으로 증가된 count 배열에서 가장 큰 수 찾기
		for( int i=0; i<count.length; i++ ) {
			if( max < count[i] ) { 				// max 값보다 count[i]번째의 값이 큰경우 max 에 count[i] 번째 값 대입
				max = count[i];
				c = (char)( i + 'A' ) ;			// 그리고 해당하는 i 인덱스값에 전에 빼주었던 값을 대입 'C' 일경우 2번째인덱스이므로 2+65 >> 67 >> 'C' (아스키코드값)
			}
			else if( max == count[i] ) {		// 만약에 max 값과 count[i] 번째의 값이 일치하는 경우 ( 동일하게 사용된 알파벳이있으면 ) c 변수에 ? 대입
				c = '?' ;
			}
		}

		System.out.println( c );
	}
}
