package baekjoon_test.백준_10809_알파벳찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nam {

	public static void main(String[] args) throws IOException {
		
		// char 배열 선언
		char[] array;

		// 입력객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열.toCharArray() : 문자열을 한글자씩 쪼개서 char 태입 배열에 저장하는 메소드 
		array = br.readLine().toCharArray();
		
		for( int i='a'; i<='z'; i++ ) {
			// i='a'=97		<=		i='z'=122
			for( int j=0; j<array.length; j++ ) {
				// j는 0 , char 배열의 길이만큼 반복증가
				if( array[j] == i ) { // 만약에 array의[j] 인덱스값과 i값이 일치하는 경우 아스키코드값 비교 
					System.out.print( j + " " );
					break; // 해당 인덱스값을 프린트 후 중단 --> i='b'=98 로 진행
				}

				if( j == array.length-1 ) {
					System.out.print( -1 + " " );
				}
				
				// 만약에 j 인덱스값이 위 조건에 충족하지못하고 [ 일치하는알파벳이 없을경우 ] -1 프린트 
				// 일치하는 알파벳값이 있는경우 break 에 의해 for문이 종료되지만 그렇지않고 마지막인덱스까지 갔다는것은 
				// 일치하는 알파벳이 없는것
			}
		}
	}
}
