import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        for (int i=0; i<5; i++) {
            result += scanner.next().substring(0, 1) + " ";
        }
        System.out.println(result);
    }
}
