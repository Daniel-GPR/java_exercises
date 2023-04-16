public class Utilities {
    
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
}
