import java.io.*;
import java.util.Scanner;

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
    System.out.print("Here are the commands I understand:\n\ncommands\ncalculator\nname\nhello\ncreate\nspam");
    System.out.print("\n\nPress \"ENTER\" to continue...");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }

  public void hello(){
    System.out.println("Hello to you as well!");
    try { Thread.sleep(3000);} catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
  }
}
