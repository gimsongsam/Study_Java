package org.opentutorials.javatutorials.constant;

public class ConstantDemo {

	public static void main(String[] args) {
		// int a = 2.2; -> 정수형 변수에 실수형을 담았기 때문에 일치하지 않는다.
		//  float a = 2.2;
		double a = 2.2;
		
		float b = 2.2F; 
		// float 데이터 타입이라는 것을 명시적으로 지정해준다.
		// 실수형 상수는 double의 데이터이다.
		
		// int c = 2147483648; -> 범위를 넘어서므로 일치하지 않는다.
		long c = 2147483648L; // long이라는 것을 지정한다.
		byte x = 100; // byte의 범위 내에있는 int타입의 데이터를 넣을 수 있다.
		short y = 200;
		
		// 자동 형 변환 
		double z = 3.0F; // 변수와 담겨있는 데이터의 타입이 서로 다르다.
		// float aa = 3.0; - 표현 범위가 좁은 float에 넣으려고 하기 때문에 오류가 발생한다.

	}

}
