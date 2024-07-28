
import.java.util.scanner

public class ReadUserInput {
    public static void main (String[] args){
    Scanner scanner= new Scanner(System.in);
    // read and print a string
    System.out.print("Enter a string:");
    String userInputString=scanner.nextLine();
    System.out.println("You have entered a string:" + userInputString);

    //read and print an integer
    System.out.print("Enter an integer:");
    int userInputInt = scaner.nextInt();
    System.out.println("You have entered an integer:" + userInputInt);

    //read and print a floating point number
    System.out.print("Enter a floating point number:");
    double userInputDouble = scanner.nextDouble();
    System.out.println("You have entered a floating point number:" + userInputDouble);
}
    
}
