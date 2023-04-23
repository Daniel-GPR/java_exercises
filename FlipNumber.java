public class FlipNumber {

    public static void start() {
        int givenNumber = Util.readInt("Enter a number");
        int flipped = flipNumber(givenNumber);

        Util.println(String.valueOf(flipped));
    }

    public static int flipNumber(int givenNumber) {
        int digitLength = Util.getNumberLength(givenNumber);

        int[] array = new int[digitLength];
        int index = 0;
        while (index < digitLength) {

            array[index] = Util.getDigitAtPosition(givenNumber, index);
            index++;
        }
        int[] newArray = new int[digitLength];

        index = 0;
        while (index < digitLength) {
            newArray[index] = array[digitLength - 1 - index];
            index++;

        }

        return Util.makeNumberFromArray(newArray);

    }
}
