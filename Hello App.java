import java.util.Scanner;

public class Hello App {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(Systrem.in);
    System.out.print("Please enter your name: ");
    String name = scanner.nextline();
    System.out.println("Hello, " + name + "!");
    
    scanner.close();
  }
}
