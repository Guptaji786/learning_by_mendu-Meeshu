package learn_to_Automate.string_programs;

public class DigitSum {

    public static void main(String[] args) {

//        int number = 56;
//        System.out.println(calculateDigitSum(number));
    	int n =13;
    	System.out.println(digit_sum(n));


    }

//    public static int calculateDigitSum(int number){
//
//        int sum = 0;
//        while(number > 0) {
//            int digit = number % 10;
//            sum = sum + digit;
//            number = number / 10;
//        }
//        return sum;
//
//    }
    public static int digit_sum(int n) 
    {
    	int sum =0;
    	while(n >0) 
    	{
    		int d = n%10;
    		sum = sum+d;
    		n = n/10;
    	}
    	return sum;
    	
    }
    
    

}
