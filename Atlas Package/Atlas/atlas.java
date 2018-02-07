import java.io.*;
import java.util.Scanner;

public class atlas{
  public static void main(String[] args) throws FileNotFoundException {
    boolean loop = true;
    Scanner input = new Scanner(System.in);
    commands commandObject = new commands();

    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.print("\nAtlas v7\n//Autocode 5/28/2016 8:01 PM, updated 5/31/2016 12:59 PM");
    try { Thread.sleep(2000);} catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
    commandObject.name();

    while (loop){
      System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.print("Use 'commands' for a list of commands that I know.");
      try { Thread.sleep(2000);} catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
      System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.print("\nEnter command: ");

      String command = input.nextLine();
      switch (command){
        case "name":
          commandObject.name();
        break;
        case "calculator":
          commandObject.calculator();
        break;
        case "commands":
          commandObject.commands();
        break;
        case "hello":
          commandObject.hello();
        break;
        case "create":
          commandObject.create();
        break;
        case "spam":
          commandObject.spam();
        break;
        case "random":
          commandObject.random();
        break;
        default:
          System.out.println("\n\nSorry, I don't know that command. Try again?");
        break;
      }
    }
  }
}
