import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.print("введіть:");
        String first=scaner.nextLine();
        String second=scaner.nextLine();
        if(first.length()>second.length()){
            System.out.println("кількість символів "+first+" є більшою за "+second);
        }

        else {
            System.out.println("кількість символів "+second+" є більшою за "+first);
        }

    }
}
