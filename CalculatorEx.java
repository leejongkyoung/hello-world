import java.util.Scanner;//���������� ó���ϴ� ��

public class CalculatorEx {
	static boolean flag; //boolean �� ������ ���� �� �ִ� �ڵ�
	                          //�ݺ��� ó���� ����
	int sign; //������ ��� �Ұ����� ���� �Է� ���� ����ϴ°� -��������
	//sign�Լ� : ���ϴ� ������� ���,����,0 �̳Ŀ� ���� ���� ��ȯ���ִ� �Լ�
	int[]number; //������ ���� ����
	int numberCount;//�Է��� ���� ����
	

	public static void main(String[] args) {
		//���������� ��� ���α׷� �����ϴ� �κ�
		CalculatorEx cal=new CalculatorEx();
		//�ݺ��� 1,2,3�̸� �� / 4�̸� ����
			
		flag = true;		
		while(flag) {
		int menuNumber=cal.MenuScrenn();
		//System.out.println(menuNumber);//�޸� ��ȣ �ӽ� ����ϴ� ��
		//menuNumber�� 1�̸� nuNumberInput()ȣ�� 
		//2�̸� operationInput();
		//3�̸� cal.calcuResult();
		//4�̸� cal.exit();

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
			System.out.println("��ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		
	  }//while��

	}//main��
	
	//ù���� ȭ���� ������ �޼ҵ�
	public int MenuScrenn() {
		System.out.println("====== ���� ������Ʈ ======");
		System.out.println("������ : lee jongKyoung");
		System.out.println("������ : 2022.04.01");
		System.out.println("���α׷��� Cal.Ver.1.0");
		System.out.println("=========================");
		System.out.println("1. ����� ������ ����");
		System.out.println("2. ������ ����");
		System.out.println("   1) + 2) - 3) * 4) / ");
		System.out.println("3. ���� ��");
		System.out.println("4. ���α׷� �����ϱ�");
		System.out.println("-------------------------");
		System.out.print("��ȣ�� ������? ��");		
		//Ű����� �Է¹ޱ�
		Scanner scanner=new Scanner(System.in);//System.in=Ű�����Է�
		int choice=scanner.nextInt();//nextInt=������ ���� �ޱ�
		return choice;
		
	}
	//1���� ������ ������ ȭ��, ����� ���ڸ� �Է��ϼ���
	public void numberInput() {
		System.out.println("����� ������ ������ �Է��ϼ���? �� ");
		Scanner scanner = new Scanner(System.in);
		numberCount = scanner.nextInt();
		int i=0;
		number = new int[5]; //�迭
		
		while(i<numberCount) { //0<3 ��, 1<3 ��, 3<3 ������
			  //���̸� �̰��� �����Ѵ�.
			System.out.println("���ڴ�? ");
			number[i]=scanner.nextInt();
			i=i+1; //1, i++
		}
		/*while(���ǹ�) {
	      ���̸� �����ϴ� �κ�
	    } �����̸� �ݺ����� �ʰ� �ݺ����� �ڷ� ��*/
	}	
	//2���� ������ ������ ȭ��, ���� ������ ���� ȭ��
	public void operationInput() {
		System.out.println("---- ������ ������ ������ ----");
		System.out.println("    1) + 2) - 3) * 4) / ");
		System.out.println("������ ������?");
		Scanner scanner=new Scanner(System.in);
		sign=scanner.nextInt();
		//���� sing �������� �ڷ�� ���� �Լ��ӿ����� �־�� �ұ�? �ƴ�
		//�ƴϸ� �ٸ� �Լ������� ����ؾ��ұ�? ��
		//�ذ���? 1)���������� ����Ѵ�. 2)�Լ����� ���� �ְ� �޴´�. -����
		
		
		
	}
	//3���� ������ ������ ȭ��, ���� ����� ������ ȭ��
	public void calcuResult() {
		// �Է°� �Է°� �Է°� ���� 1 > number[0] + number[1] + number[2] 
		
		System.out.println("------ ���� ��� ------");
		
		//�ݺ��� �ȿ� + - * / �Ǵ�
		//�ݺ����� ������ numberCount �����ȿ� ��� �ִ� ���̶� ����.
		int result=0; //����� ���� ���� ����
		double divResult=0.0; //�������� ������� ���� ����
		
		for(int i=0; 1<numberCount; i++) {//for - �ݺ���, i++ = i=i+1
		
		
		if(sign==1){
			System.out.print(number[i]+" ");// i (����)
			if(i+1 !=numberCount);{
			System.out.print(" + ");//!=i = �����ʴ�	
			}
			result= result+number[i];
		
		}//����
		
		
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
		// ����
		
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
		
			}//����
		
				
		
		
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
			
		}//������
		
		}//end for
		
		if(sign==4) {
			System.out.printf("%s %.2f", " = ", divResult);
			System.out.println();
		}else {
			System.out.print(" = "+result);
		}
	}
	//4���� ������ ������ ȭ��
	public void exit() {		
		System.out.println("���� ���α׷��� �����մϴ�.");
		System.out.println("�����մϴ�.");
		flag=false;
		
	}
}
