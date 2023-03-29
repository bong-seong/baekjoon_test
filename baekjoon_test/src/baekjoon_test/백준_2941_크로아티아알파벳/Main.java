package baekjoon_test.백준_2941_크로아티아알파벳;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		String[] array = br.readLine().split("");
		
		// 크로아티아 알파벳 배열 선언 [ 추후 해당하는것과 일치하는 것을 찾기 위함 ]
		String[] alpa = { "c=" , "c-" , "dz=" , "d-" , "lj" , "nj" , "s=" , "z=" };
		
		int index = 0; // i 인덱스값과 별개로 split 된 문자조합을 비교하기 위한 인덱스 선언
		int count = 0; // equals 비교로 입력받은 문자와 크로아티아 알파벳형식이 같을 경우 카운트하여 출력히가 위한 변수
		
		// array 입력받은 단어의 길이만큼 반복
		for( int i=0; i<array.length; i++ ) {
			// 입력받은 단어와 크로아티아 알파벳을 비교하기 위한 for 반복문
			for( int j=0; j<alpa.length; j++ ) {
				if( alpa[j].equals( array[index] + array[index+1 > array.length-1 ? index : index+1] ) ) {
					// 만약에 alap 배열에서 array 인덱스번째와 인덱스번째 +1 조합이 일치하면 
					// ljes=njak 를 입력받을경우 array[0] == l + array[1] == j >> lj
					// 이때 지속해서 index값이 올라가 배열에 없는 인덱스를 호출하지 않도록 삼항연산자를 사용하여 인덱스이상 값이 증가하지 못하게 함
					count++ ;
				}
				if( alpa[j].equals( array[index] + array[index+1 > array.length-1 ? index : index+1 ] + array[index+2 > array.length-1 ? index : index+2 ] ) ) {
					// 위 if 문과 마찬가지로 3개조합의 문자를 찾기 위한 제어문 
					count++ ;
				}
			}
			index++ ;
		}
		// 이후 전체 길이에서 count 값을 마이너스 하게 될 경우 문제에서 요구하는 출력결과를 얻을 수 있다.
		System.out.println( array.length - count );
		
	}
}
