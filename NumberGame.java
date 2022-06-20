package _While;

import java.io.IOException;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) throws IOException{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("1~100 사이의 난수를 발생하였습니다. \n 맞추어보세요\n");
		int com = (int)(Math.random()*100)+1;

		int count = 0;
	
		
		while (true) { 
			int ans = scn.nextInt();
			System.out.println("숫자 입력 : " + ans);
						
			count ++;
		
			if (ans == com) break;
			
			if(ans > com) System.out.println(ans + "보다 작습니다.다시 입력하세요 : ");
			else System.out.println(ans + "보다 큽니다. 다시 입력하세요 : ");
			
		}
		System.out.println();
		System.out.println(count + "번만에 맞추셨습니다.");
		System.out.println("프로그램을 종료합니다.");
		
	}
}

