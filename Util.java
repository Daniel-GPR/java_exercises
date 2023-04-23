public class Util {
    
    public static String readLine( String question ){
        System.out.print(question + "?: ");
        String input = System.console().readLine();

        return input;
    }

    public static int readInt( String question ){
        return makeInteger(readLine(question));
    }

    public static int makeInteger(String number){
        return Integer.parseInt(number);
    }

    public static void println(String message){
        System.out.println(message);
    }

    public static void print(String message){
        System.out.print(message);
    }

    public static int power(int number, int power){

        int result = 1;
        while( power>0 ){
            result *= number;
            power--;

        }
        return result;
    }


    public static int getNumberLength(int xDigitNumber) {
        int count = 0;

        int result = xDigitNumber / Util.power(10, count);

        while (result > 0) {
            count++;
            result = xDigitNumber / Util.power(10, count);
            
        }

        return count;

    }

    public static int getDigitAtPosition(int number, int pos) {
        return number / (1 * (Util.power(10, pos))) % 10;

    }


    public static int readNumberWithConstraint(int digitLength) {
        int givenNumber = Util.readInt("Enter a number that is " + digitLength + " digits long");

        while (Util.getNumberLength(givenNumber) != digitLength) {
            givenNumber = Util.readInt("Wrong number. Enter a number that is " + digitLength + " digits long");

        }
        return givenNumber;

    }

    public static int makeNumberFromArray(int[] newArray) {

        int index = 0;
        int result = 0;
        while (index < newArray.length) {
            result += (newArray[index] * (Util.power(10, index)));;
            index++;
        }

        return result;
    }

    public static boolean charArraysEqual(char[] arrayA, char[] arrayB) {
        
        if (arrayA.length != arrayB.length){
            return false;
        }

        int index = 0;
        while(index < arrayA.length) {
            if(arrayA[index] != arrayB[index]){
                return false;
            }
            index++;
        }
        return true;

    }
}
