import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    /*
    метод printPyramid
    два инпута:
    int
    char
    if (int < n){
    switch
    case "/" : print (or use while)
    }

     */
    public static void printPyramid() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of lines: ");
        int linesNumber = Integer.parseInt(reader.readLine());
        System.out.print("Enter symbol:  ");
        char symbol = reader.readLine().charAt(0);
        for (int i = 1; i < linesNumber + 1; i++) {
            String repeated = StringUtils.repeat(symbol, i);
            System.out.println(repeated);
        }
    }

    public static void main(String[] args) throws IOException {
        printPyramid();
    }
}
