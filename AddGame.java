package _While;

import java.util.Scanner;

public class AddGameHW {

	public static void main(String[] args) {
		
		int count = 0;
		for (int i=1; i<6;i++) {
				
			int a = (int)(Math.random()*90)+10;
			System.out.print("\t" + a);
			int b = (int)(Math.random()*90)+10;
			System.out.print("\t" + b);
			int sum = a + b;
			
			Scanner scn = new Scanner(System.in);
			System.out.println();
			System.out.print("위 두 숫자를 더하면 무엇일까요? : ");
			int ans = scn.nextInt();
			
			System.out.println();
			
			System.out.println("[" + i + "] " + a + " + " + b + " = " + ans);
			
			System.out.println();
			
			if (ans != sum ) {
				for(int j=1; j<2; j++) { 
					System.out.println("다시 풀어보세요 : ");
					int anw = scn.nextInt();
					
					if (anw==sum) System.out.println("정답입니다. 다음문제로 넘어갑니다.");
					else if (ans != sum) System.out.println("또 틀렸습니다 다음 문제로 넘어갑니다..");
					System.out.println();
				}
				
			}	
			else if (ans == sum) {
			System.out.println("딩동댕...참잘했어요");
			
			System.out.println();
			count ++;
			
			}		
			
			
		}
		System.out.println("당신은 총 5문제 중에서 " + count + " 문제를 맞추셨습니다." + " 점수는 " + 20*count + "점 입니다." );	
			
	}
}

/*
 [문제] 덧셈
 
- 10 ~ 99사이의 난수를 2개(a, b) 발생하여 출력
- 문제는 총 5문제 제공한다
- 맞추면 20점씩 계산
- 틀리면 1번의 기회를 더 준다. (다중 for문)

[실행결과]
    a    b
[1] 25 + 36 = 52
틀렸당
[1] 25 + 36 = 61
딩동뎅

[2] 10 + 12 = 22
딩동뎅...참 잘했어요

[5] 12 + 90 = 100
틀렸다
[5] 12 + 90 = 150
틀렸다...정답은 102 입니다.

당신은 총 5문제중에서 x문제 맞추어서 xx점 입니다.
*/
