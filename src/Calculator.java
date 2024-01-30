import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operand1 = Integer.parseInt(scanner.nextLine());

        char operator = scanner.nextLine().charAt(0);

        int operand2 = Integer.parseInt(scanner.nextLine());

        int result = 0;

        if (operator == '+') {
            result = operand1 + operand2;
        } else if (operator == '-') {
            result = operand1 - operand2;
        } else if (operator == '*') {
            result = operand1 * operand2;
        } else if (operator == '/') {
            if (operand2 != 0) {
                result = operand1 / operand2;
            } else {
                System.out.println("На ноль делить нельзя");
            }
        } else {
            System.out.println("Ошибка");
        }
        System.out.println("Итого: " + result);

    }
}