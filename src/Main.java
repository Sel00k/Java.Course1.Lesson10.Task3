import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.printf( "Введите строку : " );
        String text = scanner.nextLine();
        String[] words = text.toLowerCase().split( "\\s+" );
        text.
        for ( String word : words ){
            char[] charArray = word.toCharArray();
            Arrays.sort( charArray );
            String str = new String( charArray );

            System.out.println( str );
        }

        scanner.close();
    }
}
