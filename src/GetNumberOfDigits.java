import java.util.Scanner;

public class GetNumberOfDigits {
    public static void main(String[] args) {
        getNumberOfDigits1();

    }
    public static int getNumberOfDigits(int number) {
        String result = String.valueOf(number);
        return result.length();
    }

    public static void getNumberOfDigits1() {
        System.out.println("input:");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        System.out.println("output:" + getNumberOfDigits(s));
    }
}
