import java.util.Scanner;//전역변수로 처리하는 법

public class CalculatorEx {
	static boolean flag; //boolean 참 거짓만 담을 수 있는 코드
	                          //반복문 처리할 변수
	int sign; //연산을 어떻게 할것인지 받은 입력 값을 기억하는거 -전역변수
	//sign함수 : 원하는 결과값이 양수,음수,0 이냐에 따라서 값을 반환해주는 함수
	int[]number; //연산할 숫자 변수
	int numberCount;//입력할 숫자 갯수
	

	public static void main(String[] args) {
		//순차적으로 계산 프로그램 지시하는 부분
		CalculatorEx cal=new CalculatorEx();
		//반복문 1,2,3이면 참 / 4이면 거짓
			
		flag = true;		
		while(flag) {
		int menuNumber=cal.MenuScrenn();
		//System.out.println(menuNumber);//메모 번호 임시 출력하는 것
		//menuNumber가 1이면 nuNumberInput()호출 
		//2이면 operationInput();
		//3이면 cal.calcuResult();
		//4이면 cal.exit();

		if(menuNumber==1) {
			cal.numberInput();
		}
		else if(menuNumber==2) {
			cal.operationInput();
		}
		else if(menuNumber==3) {
				cal.calcuResult();
		}
		else if(menuNumber==4) {
				cal.exit();
		}
		else {
			System.out.println("번호가 틀렸습니다.");
		}
		
	  }//while끝

	}//main끝
	
	//첫번재 화면이 나오는 메소드
	public int MenuScrenn() {
		System.out.println("====== 계산기 프로젝트 ======");
		System.out.println("개발자 : lee jongKyoung");
		System.out.println("개발일 : 2022.04.01");
		System.out.println("프로그램명 Cal.Ver.1.0");
		System.out.println("=========================");
		System.out.println("1. 계산할 숫자의 갯수");
		System.out.println("2. 연산의 종류");
		System.out.println("   1) + 2) - 3) * 4) / ");
		System.out.println("3. 계산된 답");
		System.out.println("4. 프로그램 종료하기");
		System.out.println("-------------------------");
		System.out.print("번호를 고르세요? →");		
		//키보드로 입력받기
		Scanner scanner=new Scanner(System.in);//System.in=키보드입력
		int choice=scanner.nextInt();//nextInt=정수로 값을 받기
		return choice;
		
	}
	//1번을 누르면 나오는 화면, 계산할 숫자를 입력하세요
	public void numberInput() {
		System.out.println("계산할 숫자의 갯수를 입력하세요? → ");
		Scanner scanner = new Scanner(System.in);
		numberCount = scanner.nextInt();
		int i=0;
		number = new int[5]; //배열
		
		while(i<numberCount) { //0<3 참, 1<3 참, 3<3 거짓말
			  //참이면 이곳을 실행한다.
			System.out.println("숫자는? ");
			number[i]=scanner.nextInt();
			i=i+1; //1, i++
		}
		/*while(조건문) {
	      참이면 수행하는 부분
	    } 거짓이면 반복하지 않고 반복문의 뒤로 감*/
	}	
	//2번을 누르면 나오는 화면, 연산 종류를 고르는 화면
	public void operationInput() {
		System.out.println("---- 연산의 종류를 고르세요 ----");
		System.out.println("    1) + 2) - 3) * 4) / ");
		System.out.println("연산의 종류는?");
		Scanner scanner=new Scanner(System.in);
		sign=scanner.nextInt();
		//생각 sing 변수안의 자료는 지금 함수속에서만 있어야 할까? 아니
		//아니면 다른 함수에서도 사용해야할까? 응
		//해결방법? 1)전역변수로 사용한다. 2)함수끼리 값을 주고 받는다. -선택
		
		
		
	}
	//3번을 누르면 나오는 화면, 계산된 결과가 나오는 화면
	public void calcuResult() {
		// 입력값 입력값 입력값 덧셈 1 > number[0] + number[1] + number[2] 
		
		System.out.println("------ 계산된 결과 ------");
		
		//반복문 안에 + - * / 판단
		//반복문의 갯수는 numberCount 변수안에 들어 있는 것이랑 같다.
		int result=0; //연산된 값을 담을 변수
		double divResult=0.0; //나눗셈의 결과물을 담을 변수
		
		for(int i=0; 1<numberCount; i++) {//for - 반복문, i++ = i=i+1
		
		
		if(sign==1){
			System.out.print(number[i]+" ");// i (여백)
			if(i+1 !=numberCount);{
			System.out.print(" + ");//!=i = 같지않다	
			}
			result= result+number[i];
		
		}//덧셈
		
		
		else if(sign==2){
			if(i==0) {
				result=number[i];
			}else {
				result=result-number[i];}			
			System.out.print(number[i]+" ");
			if(i+1 !=numberCount);{
				System.out.print(" - ");
			}
			}
		// 뺄셈
		
		else if(sign==3){
			if(i==0) {
				result=number[i];
			}else {
				result=result*number[i];
			}			
			System.out.print(number[i]+" ");
			if(i+1 !=numberCount);{
				System.out.print(" * ");
		}
		
			}//곱셈
		
				
		
		
		else if(sign==4){
			if(i==0) {
				divResult=number[i];
			}else {
				divResult=divResult/number[i];
			}
			System.out.print(number[i]+" ");
			if(i+1 !=numberCount);{
				System.out.print(" / ");
		}
			
		}//나눗셈
		
		}//end for
		
		if(sign==4) {
			System.out.printf("%s %.2f", " = ", divResult);
			System.out.println();
		}else {
			System.out.print(" = "+result);
		}
	}
	//4번을 누르면 나오는 화면
	public void exit() {		
		System.out.println("계산기 프로그램을 종료합니다.");
		System.out.println("감사합니다.");
		flag=false;
		
	}
}
