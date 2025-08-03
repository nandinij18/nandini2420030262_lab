package lab3;
public class Anagram {
    public static void main(String[] args) {
    	String num1 = "listen";
        String num2 = "silent";
        if (num1.length() != num2.length()) {
            System.out.println("Not Anagrams");
            return;
        }
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        for (int a= 0; a < arr1.length - 1; a++) {
            for (int b = a + 1; b < arr1.length; b++) {
                if (arr1[a] > arr1[b]) {
                    char c = arr1[a];
                    arr1[a] = arr1[b];
                    arr1[b] = c;
                }

                if (arr2[a] > arr2[b]) {
                    char c = arr2[a];
                    arr2[a] = arr2[b];
                    arr2[b] = c;
                }
            }
        }
        boolean isAnagram = true;
        for (int a = 0; a < arr1.length; a++) {
            if (arr1[a] != arr2[a]) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
