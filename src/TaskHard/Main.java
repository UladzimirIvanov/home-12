package TaskHard;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        /*Программа на вход получает произвольный текст. В этом тексте может быть номер
        документа(один или несколько), емейл и номер телефона. Номер документа в формате:
        xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
        может содержать не всю информацию, т.е. например, может не содержать номер
        телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
        формате:
        email: teachmeskills@gmail.com
        document number: 1423-1512-51
        и т.д*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String userText = scanner.nextLine();

        Pattern docNumber = Pattern.compile("[0-9]{4}-?[0-9]{4}-?[0-2]{2}\\b");
        Pattern phoneNumber = Pattern.compile("[+]\\(?(29|33|44)\\)?[0-9]{7}");
        Pattern email = Pattern.compile("\\S+@(gmail|mail).(com|ru)\\b");

        Matcher mDoc  = docNumber.matcher(userText);
        Matcher mPhone = phoneNumber.matcher(userText);
        Matcher mEmail = email.matcher(userText);

        /*while (mDoc.find() && mPhone.find() && mEmail.find()){
            System.out.println("Document number: " + mDoc.group());
            System.out.println("Phone number: " + mPhone.group());
            System.out.println("email: " + mEmail.group());
        }*/

        while (mDoc.find()){
            System.out.println("Document number: " + mDoc.group());
        }
        while (mPhone.find()){
            System.out.println("Phone number: " + mPhone.group());
        }
        while (mEmail.find()){
            System.out.println("email: " + mEmail.group());
        }

    }
}
