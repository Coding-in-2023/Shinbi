import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] st = sc.next().split("");
        int n = sc.nextInt();
        
        System.out.println(st[n-1]); 
      //인덱스는 0부터 시작하니까 정확한 값을 얻기 위해서는 n-1의 값으로 찾는다. 
        }
}
