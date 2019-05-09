import java.util.Scanner;

public class MyMathematicalOperations {

    public static void main(String[] args) {
        myMathematicalOperations();
    }

    public static void myMathematicalOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input: ");
        String s = scanner.nextLine();
        String[] splited = s.split("\\s+");
        int a = Integer.valueOf(splited[0]);
        int b = Integer.valueOf(splited[2]);
        String operator = splited[1];
        int result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
            default:
                System.out.println(" error a = " + a + " b =" + b + " operator =" + operator);
        }
        System.out.println(result);
    }
}
