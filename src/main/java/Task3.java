import java.io.*;
import java.util.Scanner;

public class Task3 {
    /*
    Руками создаете файл lektorium1.txt.
    В него сами руками запишите число от 0 до 10.
    Задача - считать это число с файла, возвести его в квадрат и записать в файл с названием lektorium2.txt.
     */
    public static void readAndWrite() throws IOException {
        File readFile = new File("src/main/resources/lektorium1.txt");
        Scanner myReader = new Scanner(readFile);
        int readNumber = Integer.parseInt(myReader.nextLine());
        myReader.close();
        File writtenFile = new File ("src/main/resources/lektorium2.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(writtenFile));
        writer.write(Integer.toString(readNumber*readNumber));
        writer.close();

    }

    public static void main(String[] args) throws IOException {
        readAndWrite();
    }
}
