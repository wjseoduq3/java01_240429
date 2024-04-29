package helloworld240429;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
		System.out.println(a/b);  // 0이 출력 ->정수 vs 정수 연산의 결과는 무조건 정수로 출력
		
		double c = 3.5;
		double d = 7.0;
		
		System.out.println(c+d);
		System.out.println(c/d); 
		System.out.println(d/c); 
		
		int e = 10;
		double f = 2.5;
		System.out.println(e+f);  // 정수 vs 실수 연산은 실수로 결과 나옴
		System.out.println(e/f);
		
		int r1;
		r1 = (int) (e/f);  // casting 함수
		System.out.println(r1);
		
		int r2;
		r2 = e/(int)f;  // 결과가 다름
		System.out.println(r2);
		
		String str1 = (String)"3" + 10;
		String str2 = "3" + 10;
		System.out.println(str1);  // 정수 vs 실수 연산은 실수로 결과 나옴
		System.out.println(str2);
		
		
		// String을 기본타입으로 강제변환
		String numStr1 = "10";
		// int numInt1 = (int)numStr1; java에서는 불가//
		
		// wrapper class //
		int numInt1 = Integer.parseInt(numStr1);
		
		String numStr2 = "3.14";
		double numDouble1 = Double.parseDouble(numStr2);
		
		String numStr3 = "true";
		boolean numLogic = Boolean.parseBoolean(numStr3); 
		
		// 기본타입을 String으로 강제변환
		int num1 = 100;
		// String str2 = (String)100; java에서는 불가//
		
		String str10 = String.valueOf(num1);
			
	}

}
