package baekjoon_test.백준_4344_평균은넘겠지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		

		int c = Integer.parseInt( br.readLine() ); 	// 전체 성적입력 횟수를 입력받는 변수
		int length = 0;								// 둘째줄 맨 첫번째값인 입력성적갯수를 담는 변수 >> 추후 만들어지는 배열의 길이로 활용필요하기때문에 전역변수로 따로 처리
		int index = 0;								// while문에서 독자적인 인덱스값으로 활용하기 위한 변수
		double sum = 0;								// 입력받은 각 점수의 합계를 저장할 변수
		double aver = 0;							// 합계와 length 값을 활용한 평균계산값을 담을 변수
		double count = 0;							// 평균보다 높은점수를 기록한 학생의 수를 카운트하기 위한 변수
		double result = 0;							// 최종계산 [ 평균점수보다 높은점수를 기록한 학생의 비율 ]
		
		for( int i=0; i<c; i++ ) {
			
			StringTokenizer st = new StringTokenizer( br.readLine() , " " );
			length = Integer.parseInt( st.nextToken() ); // 매 케이스중 맨앞 숫자는 앞으로 입력할 점수의 갯수이므로 따로 length 변수에 담아 저장해둔다 
			double[] imsi = new double[ length ]; // 입력한 점수들을 임시로 저장할 배열 선언 이때 길이값은 length 를 활용
			
			sum = 0; // for 반복문이 돌면서 각 케이스마다 sum 을 활용하기에 각 케이스에서 sum 을 활용하기 전에 값을 초기화해준다
			
			while( st.hasMoreTokens() ) { // nextToken 했을때 값이 있으면 true 없으면 false >> 값이 없을때까지 무한반복
				imsi[index] = Double.parseDouble( st.nextToken() ); // 배열의 인덱스번째에 입력된 값들을 순차적으로 저장
				sum += imsi[index] ; // 입력된값들이 sum 변수에 누적더하기되어 총점 구하기
				index++; // 인덱스값 증가
			}
			
			index = 0; // 추후 실행되는 반복문에서 다시 활용이 필요하기때문에 값 초기화
			count = 0; // 마찬가지로 추후 실행되는 반복문에서 다시 활용하기위해 값 초기화
			aver = sum/length; // 계산된 총점에 length 를 나누어 평균값 계산
				
			for( int j=0; j<imsi.length; j++ ) { // 이후 임시 배열에 저장된 값을 for 반복문을 돌려 계산된 평균값과 비교
				if( imsi[j] > aver ) { // 만약에 배열의 값이 평균값 초과이면 count++ 
					count++; // 입력받은 점수중 평균점수를 넘은 학생 수 카운트
				}
			}
			
			// 최종적으로 평균값 이상인 학생수 / 입력한점수의갯수 * 100 하여 평균이상인 학생의 비율을 구한다
			result = count/length*100 ;
			System.out.printf("%.3f%% \n" , result );
			
		}
	}
}

