import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        int sum = 0;
        
        for(int i=0; i<5; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        int avg = sum/5;
        
        Arrays.sort(numbers);
        int middle = numbers[2];
        
        System.out.println(avg);
        System.out.println(middle);
        
    }
}
