import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static int sumOfDivisors(int start, int end, int a, int b) {
        return IntStream.rangeClosed(start, end).filter(num -> num % a == 0 || num % b == 0).sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(sumOfDivisors(start, end, a, b));

        scanner.close();
    }
}