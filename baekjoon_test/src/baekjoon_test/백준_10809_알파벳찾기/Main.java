package baekjoon_test.백준_10809_알파벳찾기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		String value = br.readLine();
		String[] valueArray = value.split("");
		
		String[] array = { "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z" } ;
		
		int[] intArray = new int[ array.length ];
		for( int i=0; i<intArray.length; i++ ) {
			intArray[i] = -1;
		}
		
		for( int i=0; i<array.length; i++ ) {
			for( int j=0; j<valueArray.length; j++ ) {
				if( array[i].equals( valueArray[j] ) && intArray[i] < 0 ) {
					intArray[i] = j;
				}			
			}
		}
		for( int i=0; i<intArray.length; i++ ) {
			System.out.print( intArray[i] + " " );
		}
	}
}
