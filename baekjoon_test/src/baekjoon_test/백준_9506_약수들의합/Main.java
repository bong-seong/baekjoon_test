package baekjoon_test.백준_9506_약수들의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		
		try {
		
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			
			while( true ) {
				
				int n = Integer.parseInt( br.readLine() );
				
				if( n == -1 ) { break; } // -1 입력시 while 무한루프 종료
				
				int[] array = new int[n];
				
				for( int i=1; i<=array.length; i++ ) { // for 반복문을 활용해 입력받은 n 까지 1씩 증가하며 나머지를 구한뒤 배열에저장 [ 0 , 0 , 0 , 2 , 1 , 0 ] 이 배열에 담긴다 n%i 값
					array[i-1] = n%i;
				}
				
				
				int[] measure = new int[n]; // 이후 인덱스값을 활용해 실제 약수를 다시 배열에 담음 n%i 한 배열의 인덱스값이 실제 약수 
				
				for( int i=0; i<array.length; i++ ) { 
					if( array[i] == 0 ) {
						measure[i] = i+1; 
					}
				} // 최종적으로 [ 1 , 2 , 3 , 0 , 0 , 6 ] 이 배열에 저장된다. 
				
				int sum = 0;
				
				for( int i=0; i<measure.length; i++ ) {
					if( measure[i] != 0 && measure[i] != n ) {
						sum += measure[i];
					}
				} // 저장된 약수배열에 누적더하기하여 값을 구해 sum 담는다 이때 마지막수 = 입력받은값은 누적더하기에 포함하지 않는다
				
				StringBuilder sb = new StringBuilder();
				
				if( sum == n ) { // sum 을 비교하여 입력받은값과 일치한다면 ... 
					for( int i=0; i<measure.length; i++ ) {
						if( measure[i] != 0 ) { // 약수들을 StringBulder 하여 문제에서 요구한 출력형식을 만들어준다.
							if( measure[i] == measure[measure.length-1] ) { // 이때 배열의 값이 n 과 같을경우 ( 마지막인덱스가 항상 n 값 ) 
								sb.setLength( sb.length()-3 ); // 구성한 StringBuilder 에 길이를 조절하여 " + " 공백포함 총 세칸을 줄여주고 for 반복문 break
								break;
							}
							sb.append( measure[i] + " + " );
						}
					}
					System.out.println( n + " = " + sb ); // 스트링빌더 구성 후 출력
				}else {
					System.out.println( n + " is NOT perfect." ); // 완전수가 아닌경우 출력
				}
			}
			
		}catch (Exception e) {
			System.out.println( e );
		}
	}
}
