import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class commands{
  public void name(){
    Scanner input = new Scanner(System.in);
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.print("Hi there! I'm Atlas! What is your name?");
    try { Thread.sleep(1000);} catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
    System.out.print("\nName: ");
    String name = input.nextLine();
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.print("\nYour name is " + name + "!");
    try { Thread.sleep(1000);} catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
    System.out.print("\nI like that name.");
    try { Thread.sleep(2000);} catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
    System.out.print("\nNice to meet you, " + name + "!");
    try { Thread.sleep(2000);} catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }

  public void calculator(){
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.print("Calculator v1.0\n//Autocode 5/28/2016 2:47 PM");
    try { Thread.sleep(2000);} catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    try { Thread.sleep(1000);} catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
    System.out.print("I will add these numbers for you.");
    try { Thread.sleep(2000);} catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    Scanner input = new Scanner(System.in);
    System.out.print("First number: ");
    double num1 = input.nextDouble();
    System.out.print("Second number: ");
    double num2 = input.nextDouble();
    System.out.print("Answer: ");
    System.out.print(num1 + num2);
    try { Thread.sleep(1000);} catch(InterruptedException ex) { Thread.currentThread().interrupt(); }

    System.out.print("\n\nPress \"ENTER\" to continue...");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
  }

  public void commands(){
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.print("Here are the commands I understand:\n\ncommands\ncalculator\nname\nhello\ncreate\nspam\nrandom");
    System.out.print("\n\nPress \"ENTER\" to continue... ");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }

  public void hello(){
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("Hello to you as well!");
    try { Thread.sleep(3000);} catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
  }

  public void create(){
    Scanner input = new Scanner(System.in);
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.print("File info:\nName: ");
    String name = input.nextLine();
    System.out.print("Text: ");
    String text = input.nextLine();
    File file = new File (name + ".txt");
    try
    {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println (text);
        printWriter.close();
        System.out.print("File '" + name + "' created.");
    }
    catch (FileNotFoundException ex)
    {
        System.out.println("error");
    }
    System.out.print("\n\nPress \"ENTER\" to continue...");
    Scanner scanner2 = new Scanner(System.in);
    scanner2.nextLine();
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }

  public void spam(){
    Scanner input = new Scanner(System.in);
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.print("Spam files' info:\nName: ");
    String name2 = input.nextLine();
    System.out.print("Text: ");
    String text2 = input.nextLine();
    System.out.print("Spam amount: ");
    int spamNumber = input.nextInt();
    int starter = 1;
    while (starter < spamNumber + 1){
      File file2 = new File (name2 + " [" + starter + "].txt");
      try
      {
          PrintWriter printWriter = new PrintWriter(file2);
          printWriter.println (text2);
          printWriter.close();
          System.out.println("File '" + name2 + "' created. [" + starter + "]");
      }
      catch (FileNotFoundException ex)
      {
          System.out.println("error");
      }
      starter += 1;
      }
      System.out.print("\n\nPress \"ENTER\" to continue...");
      Scanner scanner3 = new Scanner(System.in);
      scanner3.nextLine();
      System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }
  public void random(){
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    System.out.println("This will generate random numbers.");
    System.out.print("Lowest number: ");
    int randNum1 = input.nextInt();
    System.out.print("Highest number: ");
    int randNum2 = input.nextInt() + 1;
    System.out.print("Generate amount: ");
    int amount = input.nextInt();
    System.out.println("\nRandom numbers:\n");
    for (int count = 1; count <= amount; count++){
      System.out.println(randNum1 + random.nextInt(randNum2 - randNum1));
    }
    System.out.print("\n\nPress \"ENTER\" to continue...");
    Scanner scanner2 = new Scanner(System.in);
    scanner2.nextLine();
  }
}
