package baekjoon_test.백준_10757_큰수AB더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		StringTokenizer st = new StringTokenizer( br.readLine() , " " );
		
		// 입력값 저장 변수
		String A = st.nextToken();
		String B = st.nextToken();
		
		int length = 0; // 받은 두개의 수 중 자릿수가 더 큰 수 찾기
		
		if( A.length() > B.length() ) {
			length = A.length();
		}else {
			length = B.length();
		}
		
		// 더할 두개의 큰 수를 담을 배열 ( 한 글자씩 저장 )
		int[] Aarray = new int[ length + 1 ];
		int[] Barray = new int[ length + 1 ];
		
		// A 배열 - 역순으로 저장 
		for( int i=A.length()-1 , idx=0; i>=0; i-- , idx++ ) {
			Aarray[idx] = A.charAt(i) -'0' ; // 그냥 저장하게되면 실제 1~9 숫자가 아닌 다른 수로 저장하기때문에 '0' 을 빼줌 
		}
		
		// B 배열
		for( int i=B.length()-1 , idx=0; i>=0; i-- , idx++ ) {
			Barray[idx] = B.charAt(i) - '0' ;
		}
		
		// 저장한 두 배열을 더한다
		for( int i=0; i<length; i++ ) {
			int value = Aarray[i] + Barray[i]; // value 변수에 더한 값을 담는다
			Aarray[i] = value%10; // value 값에 10으로 나눈후 나머지값을 구하면 일의자리수만 저장할 수 있다.
			Aarray[i+1] += (value/10); // 이후 10으로 나눈 값의 몫을 다음 인덱스에 미리 더해준다. 
		}
		
		StringBuilder sb = new StringBuilder();
		// StringBuilder 를 사용한 문자열 더하기 
		
		if( Aarray[ length ] != 0 ) { // 배열을 선언할때 혹시모를 자릿수 증가를 위해 length+1 을해주었는데 이때문에 맨앞자리가 0이 출력될수도 있음 
			sb.append( Aarray[ length ] );// 때문에 0이 아닐경우에만 추가를 해준다. 
		}
		for( int i=length-1; i>=0; i-- ) { // 이후 배열을 뒤집어 Stringbulder 객체에 추가한다.
			sb.append( Aarray[i] );
		}
		
		System.out.println( sb );
	}
}

/*
9223372036854775807 
9223372036854775808
18446744073709551615
18446744073709551615
00446744073709551615
51615590737044764400
*/