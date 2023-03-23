package baekjoon_test.백준_27866_문자와문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		// BufferedReader 사용하여 입력객체 생성
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		// 입력받은 값을 s 에 대입 
		String s = br.readLine();
		// 몇번째 문자인지 입력받기
			// 이때, 버퍼리더로 입력받은 값은 String 자료형이므로 int 형으로 형변환 필수
		int i = Integer.parseInt( br.readLine() ) ;
		
		// charAt : String 으로 저장된 문자열중에서 한글자만 char 타입으로 변환 
			// 입력받은 값에 -1 하여 인덱스값으로
		System.out.println( s.charAt( i-1 ) );
		System.out.println( s.length() );
		
	}
}
