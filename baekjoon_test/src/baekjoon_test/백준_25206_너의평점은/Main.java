package baekjoon_test.백준_25206_너의평점은;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		double calculate = 0; 	// 학점과 점수가 계산되어 저장될 변수
		double sum = 0;			// 학점이 계산되어 저장될 변수
		double grade = 0;		// 등급별 점수를 저장할 변수
		
		for( int i=0; i<20; i++ ) { // for 반복문 총 20개과목이므로 20번 반복
			
			// 입력값을 받아 공백기준으로 문자를 잘라 String 배열에 저장
			String[] array = br.readLine().split(" ");
			// 이때 , 과목명은 [0] , 점수는 [1] , 받은점수는 [2] 에 각각 저장된다
			
			// for 반복문으로 입력받은 값의 길이만큼 반복문
			for( int j=0; j<array.length; j++ ) {
				
				if( array[2].equals("A+") ) {			// 만약 학점이 A+ 인경우 grade 값에 4.5 대입
					grade = 4.5 ;						// equals 를 활용하여 값을 비교하고 각 점수에 맞는 값을 대입
				}else if( array[2].equals("A0") ) {
					grade = 4.0 ;
				}else if( array[2].equals("B+") ) {
					grade = 3.5 ;
				}else if( array[2].equals("B0") ) {
					grade = 3.0 ;
				}else if( array[2].equals("C+") ) {
					grade = 2.5 ;
				}else if( array[2].equals("C0") ) {
					grade = 2.0 ;
				}else if( array[2].equals("D+") ) {
					grade = 1.5 ;
				}else if( array[2].equals("D0") ) {
					grade = 1.0 ;
				}else if( array[2].equals("F") ) {
					grade = 0 ;		
				}else if( array[2].equals("P") ) {
					array[1] = "0";	// P 일경우에는 계산에서 제외되므로 "0" 대입 >> 추후 파싱되어 인트값으로 변환 >> 학점*0 이므로 0 >> 계산포함 X 
				}
			}
			calculate += Double.parseDouble( array[1] ) * grade; 	// if 조건문에 의해 구분되어진 점수와 학점을 곱함
			sum += Double.parseDouble( array[1] );  				// 추후, 누적계산된 calculate 와 계산될 학점 합산값을 누적더하기로 구한다
		}
		System.out.printf( "%.6f" ,calculate/sum );					// 문제에서 제시된 계산법으로 (학점x점수)/학점총합 하여 결과 도출
	}
}

/*
 
	인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!
	치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
	전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
	인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다
	
	A+	4.5
	A0	4.0
	B+	3.5
	B0	3.0
	C+	2.5
	C0	2.0
	D+	1.5
	D0	1.0
	F	0.0
	
	P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.
	과연 치훈이는 무사히 졸업할 수 있을까?
	
	20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
	치훈이의 전공평점을 출력한다.

	ObjectOrientedProgramming1 3.0 A+
	IntroductiontoComputerEngineering 3.0 A+
	ObjectOrientedProgramming2 3.0 A0
	CreativeComputerEngineeringDesign 3.0 A+
	AssemblyLanguage 3.0 A+
	InternetProgramming 3.0 B0
	ApplicationProgramminginJava 3.0 A0
	SystemProgramming 3.0 B0
	OperatingSystem 3.0 B0
	WirelessCommunicationsandNetworking 3.0 C+
	LogicCircuits 3.0 B0
	DataStructure 4.0 A+
	MicroprocessorApplication 3.0 B+
	EmbeddedSoftware 3.0 C0
	ComputerSecurity 3.0 D+
	Database 3.0 C+
	Algorithm 3.0 B0
	CapstoneDesigninCSE 3.0 B+
	CompilerDesign 3.0 D0
	ProblemSolving 4.0 P								3.284483

*/