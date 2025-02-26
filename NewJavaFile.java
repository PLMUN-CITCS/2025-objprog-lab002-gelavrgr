// File: VariablesAndCaseSensitivity.java
public class VariablesAndCaseSensitivity {
    public static void main(String[] args) {
        // Declare an Integer Variable
        int studentAge = 15;

        // Declare a Double Variable
        double itemPrice = 29.99;

        // Declare a String Variable
        String studentName = "Alice";

        // Demonstrate Case Sensitivity (Variable 1)
        int counter = 10;

        // Demonstrate Case Sensitivity (Variable 2)
        int Counter = 20;

        // Output the Values (Age)
        System.out.println("Student Age: " + studentAge);

        // Output the Values (Price)
        System.out.println("Item Price: $" + itemPrice);

        // Output the Values (Name)
        System.out.println("Student Name: " + studentName);

        // Output Case Sensitivity Variables
        System.out.println("Counter: " + counter);
        System.out.println("Counter (Different Case): " + Counter);
    }
}
