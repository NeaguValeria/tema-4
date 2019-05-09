import java.util.Scanner;

public class TimeTable {

    public static void main(String[] args) {
        timeTable();

    }
    public static int getNumberOfDigits(int number) {
        String result = String.valueOf(number);
        return result.length();
    }
    public static void timeTable() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int spaces = getNumberOfDigits(size)+ 3;
        System.out.println("*" + "|");
        for (int row = 1; row <= size; row++) {
            System.out.print("|");
            for (int col = 1; col <= size; col++) {
                System.out.printf("%" + spaces + "d", row * col);
            }

            System.out.println();
        }
    }
}
