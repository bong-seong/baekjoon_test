package baekjoon_test.백준_25206_너의평점은;

public class Main {
	public static void main(String[] args) {
		
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