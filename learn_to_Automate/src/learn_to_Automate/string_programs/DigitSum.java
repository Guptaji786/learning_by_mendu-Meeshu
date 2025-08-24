package src.learn_to_Automate.string_programs;

public class DigitSum {

    public static void main(String[] args) {

        int number = 56;
        System.out.println(calculateDigitSum(number));


    }

    public static int calculateDigitSum(int number){

        int sum = 0;
        while(number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;

    }

}
