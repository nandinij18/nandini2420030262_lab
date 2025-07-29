package lab2;
public class sumofdigit {
	    public static void main(String[] args) {
	        int number = 1234;
	        int sum = 0;
	        int temp = number;

	        while (temp > 0) {
	            int digit = temp % 10;
	            sum = sum + digit;
	            temp = temp / 10;
	        }

	        System.out.println("Sum of digits: " + sum);

	        if (sum % 5 == 0) {
	            System.out.println("Divisible by 5");
	        } else {
	            System.out.println("Not divisible by 5");
	        }
	    }
	}


