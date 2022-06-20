package _While;

import java.util.Random;
import java.util.Scanner;

public class RPSGameHW {

	public static void main(String[] args) {
						
		Scanner scn = new Scanner(System.in);
		Random rn = new Random();
		
		int money = 1000;
		RPSGameHW mt = new RPSGameHW();
		
		System.out.print("얼마를 배팅하시겠습니까? : ");
		int bat = scn.nextInt();
		

		do {
			int com = rn.nextInt(3)+1;
							
			System.out.print("가위(1) | 바위(2) | 보(3) | 중 한 가지를 선택하세요 : ");
			int user = scn.nextInt();
			
			System.out.println();
				
			System.out.println("배팅 금액 입력 : " + bat);
			System.out.println("결과를 보시려면 Enter를 입력해주세요");
			
			String Enter = scn.nextLine();
			scn.nextLine();
			
			if (user == com) {System.out.println("비겼습니다.");
			}
			
			else if (com==1 && user==3 || com==2 && user==1 || com==3 && user==2) {
					System.out.println("이겼습니다.");
			}
			else {System.out.println("졌습니다.");
			}
		}	while (money-bat < bat);
			
	}
	
}	

/*
break는 if문과 상관없이 while문을 빠져나온다는 것을 기억하자.!!!!!!!!!!!!!!!!!!!!!!!!!!!

[문제] 가위, 바위, 보 게임 - while, if
- 가위(1), 바위(2), 보자기(3) 지정한다.
- 돈이 떨어지면 다시 게임할거냐고 물어보세요
- money=1000원을 무조건 가지고 시작한다.
- 현금이 마이너스이면 [또 할래(y/n)]
- 만약 또 한다면 insert coin ? 현금을 입력받는다.

[실행결과]
가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
배팅 금액 입력 : 200
결과를 보시려면 Enter를 치세요... (선택)
컴퓨터 : 바위   나 : 보자기
You Win
당신의 잔액은 1200원 입니다.

가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
배팅 금액 입력 : 500
결과를 보시려면 Enter를 치세요... (선택)
컴퓨터 : 가위   나 : 보자기
You Lose!!
당신의 금액 700원 입니다.

가위(1),바위(2),보(3) 중 번호 입력 : 1 (user)
배팅 금액 입력 : 500
결과를 보시려면 Enter를 치세요... (선택)
컴퓨터 : 가위   나 : 가위
You Draw!!
당신의 금액 -700원 입니다.

또 할래(y/n)? 

insert coin ?

*/