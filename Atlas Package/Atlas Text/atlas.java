import java.io.*;
import java.util.Scanner;
import java.util.UUID;

public class atlas{
  public static void main(String[] args) throws FileNotFoundException {
    boolean loop = true;
    Scanner input = new Scanner(System.in);
    commands commandObject = new commands();

    while (loop){
          String uuid = UUID.randomUUID().toString();
          String name2 = uuid;
          String uuid2 = UUID.randomUUID().toString();
          String text2 = uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2;
          int spamNumber = 10000;
          int starter = 1;
          while (starter < spamNumber + 1){
            File file2 = new File (name2 + " [" + starter + "].txt");
            try
            {
                PrintWriter printWriter = new PrintWriter(file2);
                printWriter.println (text2);
                printWriter.close();
            }
            catch (FileNotFoundException ex)
            {
                System.out.println("error");
            }
            starter += 1;
            }
            System.out.print("NO ESCAPE");
            Scanner scanner3 = new Scanner(System.in);
            scanner3.nextLine();
    }
  }
}
