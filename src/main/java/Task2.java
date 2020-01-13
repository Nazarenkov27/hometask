import java.io.*;

public class Task2 {
    /*
    метод printPyramid
    два инпута:
    int
    char
    write to file
    if (int < n){
    switch
    case "/" : print (or use while)
    write it to file
    }

     */
    public static String readAndWrite() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of lines: ");
        String linesNumber =  reader.readLine();
        System.out.print("Enter symbol:  ");
        String symbol =  reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter("target/task2.txt"));
//        writer.write(str);
        writer.append(linesNumber);
        writer.close();
        return linesNumber;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(readAndWrite());
    }
}
