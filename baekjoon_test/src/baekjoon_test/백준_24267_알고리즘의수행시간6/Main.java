package baekjoon_test.백준_24267_알고리즘의수행시간6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in) );
		
		long n = Long.parseLong( br.readLine() );
		
		System.out.println( (n-2)*(n-1)*n/6 );
		System.out.println( 3 );
		
	}
}
/*


	for( int i=0; i<n-2; i++ ) {
		for( int j=i+1; j<n-1; j++ ) {
			for( int k=j+1; k<n; k++ ) {
				sum = sum + A[i] * A[j] * A[k];
			}
		}
	}
	return sum;
	
	
	
	n = 7 이라 가정했을때,
	15+10+6+4 
	(n-2) * (n-1) * n 
	
	i = 1			1<5			i++					15
		j=2				2<6			j++
			k=3				3<7			k++
			k=4				4<7			k++
			k=5				5<7			k++
			k=6				6<7			k++
			false
		j=3				3<6			j++
			k=4				4<7			k++
			k=5				5<7			k++
			k=6				6<7			k++
			false
		j=4				4<6			j++
			k=5				5<7			k++
			k=6				6<7			k++
			false
		j=5				5<6			j++
			k=6				6<7			k++
			false
		false
	
	i = 2											10
		j=3				3<6			j++
			k=4				4<7			k++
			k=5				5<7			k++
			k=6				6<7			k++
			false
		j=4				4<6			j++
			k=5				4<7			k++
			k=6				5<7			k++
			false
		j=5				5<6			j++
			k=6				5<7			k++
			false
		false
		
	i = 3											6
		j=4				4<6			j++
			k=5				5<7			k++
			k=6				6<7			k++
			false
		j=5				5<6			j++
			k=6				5<7			k++
			false
		false
	
	i = 4											4
		j=5				4<6			j++
			k=6				6<7			k++
			false
		j=5				5<6			j++
			false
		false
	false
*/