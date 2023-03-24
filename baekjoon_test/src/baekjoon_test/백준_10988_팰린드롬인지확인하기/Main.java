package baekjoon_test.백준_10988_팰린드롬인지확인하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		// 입력값을 split 으로 한글자씩 분해하여 배열에 저장
		String[] value = br.readLine().split("");
		
		// for 반복문을 활용해 문자열을 뒤집어 저장할 배열
		String[] re = new String[ value.length ];
		
		// for 반복문을 뒤집어사용할때 인덱스값으로 활용하기 위한 임시인덱스값
		int index = 0;
		
		// 두 배열을 비교하여 비교결과에따라 증가하는 카운트값
		int count = 0;
		
		// fof 반복문, i 는 배열의길이-1 [ 인덱스값 ] 으로 하고 i가 0이될때까지 반복 감소
		for( int i=value.length-1; i>=0; i-- ) {
			re[index] = value[i]; // 정상적으로 저장된 문자열을 뒤집어 re 배열에 저장
			index++; 			// 인덱스는 0부터 순차적으로 올라가야하므로 대입이끝나면 증가
		}
		
		// 두개의 배열을 반복문을 돌려 equals로 비교 true 이면 count 증가
		for( int i=0; i<value.length; i++ ) {
			if( re[i].equals( value[i] )  ) {
				count++ ;
			}
		}
		
		// 최종적으로 카운트값과 배열의 길이가 같다면 팰린드롬으로 판단 1 프린트 , 아닐경우 0 프린트
		if( count == value.length ) { System.out.println( 1 ); }
		else { System.out.println( 0 ); }
	}
}
