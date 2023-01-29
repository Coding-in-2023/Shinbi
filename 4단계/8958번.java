import java.util.Scanner;


public class Main {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

//시험 본 과목의 개수 N
int N = sc.nextInt();

String[] array = new String[N];
for(int i=0; i<N; i++) {
	array[i] = sc.next(); //입력받는 값이 String일 경우 sc.next()
}

for(int i=0; i<N; i++) {
int count = 0;
int sum = 0;

for(int j=0;j<array[i].length();j++) {
	//charAt(): String으로 저장된 문자열 중에서
	//한글자만 선택해서 char 타입으로 변환해준다.
	if(array[i].charAt(j)=='O') {
		count++;
	}
	else {
		count=0;
	}
	sum += count;
}

System.out.println(sum);
sc.close();

}
}
}
