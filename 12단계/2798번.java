import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 카드의 숫자들을 배열에 넣는다. 
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }
        
        int result = findSum(N, M, cards); 
        System.out.println(result);
        
        sc.close();
    }
    
    public static int findSum(int N, int M, int[] cards) { 
        int closeNum = 0;
        
        // 세 장의 카드를 선택하기 위한 삼중 반복문 
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    
                    // 현재까지의 합이 M 이하이면서 최대 합과 비교해서 더 큰 경우이면
                    // 업데이트
                    if (sum <= M && sum > closeNum) {
                        closeNum = sum;
                    }
                }
            }
        }
        return closeNum; 
    }
}
