package _While;

import java.io.IOException;

public class InputTest {

	public static void main(String[] args) throws IOException{
		System.out.println("숫자 입력 : ");
		int a = System.in.read()-48; //sysread는 1개 "문자" 입력
		System.in.read();
		System.in.read();
		
//		System.in.read() --> \n 을 읽어서 없애라 --> read가 엔터를 읽어버림.
//		System.in.read() --> \r 을 읽어서 없애라 --> flush 라고한다.
		
		
		System.out.println("숫자 입력 : ");
		int b = System.in.read()-48;
		
		System.out.println("결과 = " + a + " , " + b);
	}

	
}
/// 중요*** 엔터****
/// 는 커서를 맨앞으로 보낸다음 \r
/// 다음줄로 보낸다. \n

