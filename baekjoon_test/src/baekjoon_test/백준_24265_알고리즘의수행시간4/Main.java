package baekjoon_test.백준_24265_알고리즘의수행시간4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		long n = Long.parseLong( br.readLine() );
		
		System.out.println(  );
		
	}
}

/*
 
 	for( int i=1; i<=n-1; i++ ){
 		for( int j=i+1; j<n; j++ ){
 			
 			sum = sum + A[i] * A[j]; 
 			
 		}
 	}
 	
 	return sum;
 	
 	n = 7
 	7 * 6 / 2 = 21 ;
 	n * (n-1) / 2 = 21 ;
 	 
 	
 	n 이 7일때 
 		i가 1일때 > j = 2(1+1)		2<=7; 	j++		5
 				 				3<=7;	j++
 				 				4<=7;	j++
 				 				5<=7;	j++
 				 				6<=7;	j++
 				 				false
 				 				
 		i가 2일때 > j = 3(2+1)		3<=7;	j++		4
 				 				4<=7;	j++
 				 				5<=7;	j++
 				 				6<=7;	j++
 				 				false
 				 				
 		i가 3일때 > j = 4(3+1) 	4<=7;	j++		3
 				 				5<=7;	j++
 				 				6<=7;	j++
 				 				false
 				 				
 		i가 4일때 > j = 5(4+1)		5<=7;	j++		2
 				 				6<=7;	j++
 				 				false
 				 				
 		i가 5일때 > j = 6(5+1)		6<=7;	j++		1
 				 				false 
 		
 		i가 6일때 > j = 7(6+1)		false
 							
 
 */
