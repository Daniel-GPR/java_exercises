
public class Palindrome {

    public static boolean isPalindrome(String word) {
        char[] split = word.toCharArray();

        int length = split.length;
        char[] reverseArray = new char[length];
        int index = 0;

        while (index < length) {
            reverseArray[index] = split[length - 1 - index];
            index++;
        }
        if(Util.charArraysEqual(split, reverseArray)){
            return true;
        }else{
            return false;
        }

    }


}
