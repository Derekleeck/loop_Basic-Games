package _While;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int input;
		int mul=1;	
		while (true) {
			System.out.println("숫자 입력 : ");	
			input = scn.nextInt();
			if (input == 0) break;
			if (input < 0) continue;		
			
			// 팩토리얼
//			3! => 1*2*3
//			5! => 1*2*3*4*5
//			num! => 1*2*3*~~~*num
			for(int i=1; i<=input; i++) {
			mul *= i;
			}
			System.out.println(input + "의 팩토리얼 값은 " + mul);
		}
		System.out.println("프로그램 종료합니다.");
	

	}

}

/*

[문제] 팩토리얼 계산 - while, for, break, continue
- 0이 입력되면 종료한다.
- 음수가 들어오면 다시 입력한다.

[실행결과]
숫자 입력 : 3
3! = 6
숫자 입력 : 5 
5!(팩토리얼) = 120
숫자입력 : -100
숫자입력 : -5
숫자입력 : 3
3! + 6

**항상 탈출구 먼저 만드는 거 잊지말자*

*/

