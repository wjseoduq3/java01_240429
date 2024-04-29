
package helloworld240429;

public class Test01 {

	public static void main(String[] args) {
		
		int x;  // 정수 변수 x 선언(비어있지는 않음, 의미없는 값있음)
		x = 10; // x를 10으로 초기화(10->초깃값)
		int y = 20;
		int z;
		
		// int x, y, z; // 타입이 같을 때 한번에 선언 가능
		// 이미 선언된 변수를 다시 선언하는 것은 불가, 값을 바꾸는 것은 가능
		x = 100;  // 가능
		
		int a = 100;  //정수 변수 a를 선언과 동시에 100으로 초기화
		long k = 10^6L;  //long은 끝에 L을 붙임
		
		z = a + y;  //y값이 초기화되지않아 에러 발생 
		
		System.out.println("수학점수는 " + a + "점입니다!");
		
		char c = 'A';
		
		double e1 = 10.1;
		float e2 = 3.14f;  // float는 반드시 뒤에 f 붙여줘야함
		
		String f = "Korea";  // 문자는 대문자 String, 예약어가 아니라 class 임
		
		boolean s = true;
		boolean ss = false;
		
		
		System.out.println("큰따옴표\" \"를 찍어봅시다.");
		
		
		
	}
	
	int a = 10;  // 전역변수 a를 새로 선언한 것임
	
	

}
