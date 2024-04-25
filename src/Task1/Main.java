package Task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String userInput = scanner.nextLine();

        Pattern abbr = Pattern.compile("[A-Z]{2,6}");
        Matcher m = abbr.matcher(userInput);
        System.out.println("Были найдены аббревиатуры: ");
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
