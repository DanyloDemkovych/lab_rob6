import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть слова:");
        String result = "";
        for (int i=0; i<5; i++) {
            result = result.concat(scanner.next()) + " ";
        }
        System.out.println(result);
    }
}
