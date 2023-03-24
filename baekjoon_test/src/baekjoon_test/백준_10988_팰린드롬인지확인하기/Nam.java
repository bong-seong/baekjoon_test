package baekjoon_test.백준_10988_팰린드롬인지확인하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nam {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		String value = br.readLine();
		
		// 인덱스값으로 활용할 i , j 를 미리 선언 이때, j는 감소하면서 역으로 내려오기때문에 length-1 
		int i = 0;
		int j = value.length()-1;
		
		int result = 1; // 결과를 저장할 변수 선언 
		
		while( i <= j ) { // while 무한루프를 사용하여 i 가 j 값보다 작거나 같을때까지 반복
			char f = value.charAt(i); // charAt 를 활용하여 i번째 글자 char 자료형 변수에 대입 
			char e = value.charAt(j); // charAt 를 활용하여 j번재 글자 char 자료형 변수에 대입 
			
			// 입력값이 level 일 경우 
			// i=0 , j=4 	=>		charAt(0) = l , charAt(4) = l		i++ / j--
			// i=1 , j=3 	=>		charAt(1) = e , charAt(3) = e		i++ / j--
			// i=2 , j=2 	=>		charAt(2) = v , charAt(2) = v
			// i=3 , j=1	조건식불일치 whlie 종료
			
			if( f != e ) { // 만약 일치하지 않는경우 result 에 0값 대입 후 whlie 종료
				result = 0;
				break;
			}
			i++; j--; 
		}
		System.out.println( result ); // 결과 프린트
	}
}
