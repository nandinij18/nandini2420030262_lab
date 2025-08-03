package lab3;
public class FirstNonRepeating {
	    public static void main(String[] args) {
	        String input = "swiss";
	        char[] arr = input.toCharArray();
	        boolean found = false;
	        for (int i = 0; i < arr.length; i++) {
	        	 boolean isRepeating = false;
	            for (int j = 0; j < arr.length; j++) {
	                if (i != j && arr[i] == arr[j]) {
	                    isRepeating = true;
	                    break;
	                }
	            }
	            if (!isRepeating) {
	                System.out.println("First non-repeating character: " + arr[i]);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("No non-repeating character found.");
	        }
	    }
	}