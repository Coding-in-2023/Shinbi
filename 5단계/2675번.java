import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //테스트 케이스 개수 입력받기 
        
        for(int i = 0; i<T; i++) //테스트 케이스 횟수 만큼
        {
        	int R = sc.nextInt(); //반복 횟수 입력받기
        	String st = sc.next(); //문자열 입력받기 
        	
        for(int j=0; j<st.length(); j++) { //문자열 하나하나에 대해서 
        	
         for(int k=0; k<R; k++) { //반복횟수 만큼
        	 System.out.print(st.charAt(j)); //문자열 반복하여 출력 
         }

        }
        System.out.println();
        }
    }
}
