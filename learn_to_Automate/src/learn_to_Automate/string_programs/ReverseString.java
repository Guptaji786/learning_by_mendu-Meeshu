package src.learn_to_Automate.string_programs;

public class ReverseString {

    public static void main(String[] args) {

        int number = 123456;
        System.out.println(reverseNumberFunction(number));
    }

    public static int reverseNumberFunction(int number){

        int reverseNumber = 0;
        while(number > 0){

            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number = number / 10;
        }

        return reverseNumber;
    }
}
