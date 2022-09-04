package Backend_Java.lesson3;

public class Palindrome {

    public static boolean isPalindrome(String string){
        String clean = string.replaceAll("\\s+", "").toLowerCase();
        return recursivePalindrome(clean,0,clean.length()-1);
    }

    private static boolean recursivePalindrome(String string, int forward, int backward) {
        if (forward == backward) {
            return true;
        }
        if ((string.charAt(forward)) != (string.charAt(backward))) {
            return false;
        }
        if (forward < backward + 1) {
            return recursivePalindrome(string, forward + 1, backward - 1);
        }

        return true;
    }
}
