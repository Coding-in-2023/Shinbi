import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sugar = scanner.nextInt();
        scanner.close();

        int bag = -1; // 최소 봉지 개수를 저장할 변수, 초기값을 -1로 설정하여 불가능한 경우를 체크

        // 5kg 봉지로 가능한 만큼 나누어보고, 남은 무게가 3kg로 나누어질 수 있는지 확인
        for (int kg_5 = sugar / 5; kg_5 >= 0; kg_5--) {
            int remainWeight = sugar - (5 * kg_5);
            if (remainWeight % 3 == 0) {
                bag = kg_5 + (remainWeight / 3);
                break;
            }
        }

        System.out.println(bag);
    }
}
