import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phone number");
        String number = scanner.nextLine();
        System.out.println(phoneNumber(number));
    }

    public static String phoneNumber (String number) {
        String okNumber;
        char hyphen = '-';
        String begin="05";
        String none="     ";
        if (number.charAt(0)=='0'&&number.charAt(1)=='5'&&Character.isDigit(number.charAt(2))&&number.charAt(3)==hyphen
                &&Character.isDigit(number.charAt(4))&&Character.isDigit(number.charAt(5))&&Character.isDigit(number.charAt(6))
                &&Character.isDigit(number.charAt(7))&&Character.isDigit(number.charAt(8))&&Character.isDigit(number.charAt(9))){
            return number;
        }
        if (number.charAt(0)=='9'&&number.charAt(1)=='7'&&number.charAt(2)=='2'&&number.charAt(3)=='5'
                &&Character.isDigit(number.charAt(4))&&Character.isDigit(number.charAt(5))&&Character.isDigit(number.charAt(6))
                &&Character.isDigit(number.charAt(7)) &&Character.isDigit(number.charAt(8))&&Character.isDigit((number.charAt(9)))){
            number=begin+number.charAt(4)+hyphen+number.charAt(5)+number.charAt(6)+number.charAt(7)+number.charAt(8)+
                    number.charAt(9)+number.charAt(10)+number.charAt(11);
            return number;
        }

        if (number.charAt(0)=='0'&&number.charAt(1)=='5'&&Character.isDigit(number.charAt(2))&&Character.isDigit(number.charAt(3))
                &&Character.isDigit(number.charAt(4)) &&Character.isDigit(number.charAt(5))&&Character.isDigit(number.charAt(6))
                &&Character.isDigit(number.charAt(7))&&Character.isDigit(number.charAt(8))&&Character.isDigit(number.charAt(9))) {
            number=begin+number.charAt(2)+hyphen+number.charAt(3)+number.charAt(4)+number.charAt(5)+number.charAt(6)+
                    number.charAt(7)+number.charAt(8)+number.charAt(9);
return number;
        }
        else number=none;
        return number;
    }
}