public class Shapes {
    public static void printBoard(int sidesOfBoard) {
        int count = 0;
        while (count < sidesOfBoard) {

            int index = 0;
            while (index < sidesOfBoard) {
                if ((index + count) % 2 == 0)
                    Util.print("+ ");
                else

                    Util.print("- ");

                index++;

            }
            Util.println("");
            count++;
        }
    }
}
