package _While;

public class DoWhileTest {

	public static void main(String[] args) {
		int a = 1;
		do {
			a++;
			System.out.print(a + " ");
		}
			while(a<10);
			System.out.print("\n");
			
			
			char ch = 'A';
			int count = 0;
			do {
				System.out.print(ch + " ");
				ch++;
				count++;
				if(count%6 == 0) System.out.println();
			}while(ch<='Z');
		

		
	}

}
