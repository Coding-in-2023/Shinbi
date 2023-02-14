import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		//입력받은 String값을 char로 변환하고
		//int 타입인 x에 저장하므로써 아스키 코드 값 저장.
		int x = sc.next().charAt(0);

		System.out.print(x);
	}
	
	}
