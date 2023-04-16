
public class Main {
 
    public static void main(String[] args) {
        int result = power(3, 3);
        Utilities.println(String.valueOf(result));

    }


    public static int power(int number, int power) {
        int count = 1;
        int result  = 1;
        
        while(count <= power){
            result *= number ;
            count++;
        }

        return result;

    }

}
