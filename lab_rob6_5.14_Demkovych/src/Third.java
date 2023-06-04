import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, number3;
        System.out.println("введіть 1 дробове число: ");
        if (scanner.hasNextDouble()) {
            number1 = scanner.nextDouble();
            System.out.println("введіть 2 дробове число: ");
            if (scanner.hasNextDouble()) {
                number2 = scanner.nextDouble();
                System.out.println("введіть 3 дробове число: ");
                if (scanner.hasNextDouble()) {
                    number3 = scanner.nextDouble();
                    if (number1 >= number2 && number1 >= number3) {
                        System.out.println(number1 + " найбільше дробове число");
                    } else if (number2 >= number1 && number2 >= number3) {
                        System.out.println(number2 + " найбільше дробове число");
                    } else {
                        System.out.println(number3 + " найбільше дробове число");
                    }
                } else System.out.println("ви ввели не дробове число");
            } else System.out.println("ви ввели не дробове число");
        } else System.out.println("ви ввели не дробове число");
    }
}
