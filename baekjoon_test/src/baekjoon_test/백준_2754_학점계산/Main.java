package baekjoon_test.백준_2754_학점계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		String input = br.readLine();
		
		Map<String, Double> scoreList = new HashMap<>();
		
		scoreList.put("A+", 4.3);
		scoreList.put("A0", 4.0);
		scoreList.put("A-", 3.7);
		scoreList.put("B+", 3.3);
		scoreList.put("B0", 3.0);
		scoreList.put("B-", 2.7);
		scoreList.put("C+", 2.3);
		scoreList.put("C0", 2.0);
		scoreList.put("C-", 1.7);
		scoreList.put("D+", 1.3);
		scoreList.put("D0", 1.0);
		scoreList.put("D-", 0.7);
		scoreList.put("F", 0.0);
		
		System.out.println( scoreList.get( input ) );
		
		
	}
}
 

