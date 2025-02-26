# **2025-OBJPROG-LAB002**

Week 02 - Introduction to Java Programming

Laboratory # 02 - Guided Coding Exercise: Variable Declarations & Case-Sensitivity

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 02 - Guided Coding Exercise: Variable Declarations & Case-Sensitivity**

   **Objective:**
   - Create variables with different native data types (integers, decimals, strings).
   - Understand the importance of case-sensitivity in identifiers.

   **Desired Output:**
   ```txt
   Student Age: 15
   Item Price: $29.99
   Student Name: Alice
   Counter: 10
   Counter (Different Case): 20
   ```

   **File Naming Convention:**
   - `VariablesAndCaseSensitivity.java`

   **Notable Observations (to be discussed after completing the exercise):**
- Case Sensitivity: The most important observation is the demonstration of Java's case sensitivity. The difference in output between counter and Counter clearly shows that Java treats these as distinct variables. This reinforces the importance of careful naming and consistent capitalization.
- Variable Declaration and Initialization: The exercise reinforces the process of declaring variables of different data types (int, double, String) and initializing them with values. This is a fundamental concept in Java (and most programming languages).
- Data Type Selection: Students should observe how different data types are used for different kinds of data (age as an integer, price as a double, name as a String). This highlights the importance of choosing the correct data type.
- Output using System.out.println(): The activity uses System.out.println() to display the values of variables. This is the standard way to produce output in Java console programs, and students get practice using it.
- String Concatenation: The use of + to combine strings and variables within the System.out.println() statements (e.g., "Student Age: " + studentAge) demonstrates string concatenation, a common operation.
- Naming Conventions: While not a "result" in the same way as the output, the activity emphasizes the importance of following naming conventions (camelCase). Students should observe how this improves code readability.

   **Java Programming Best Practices:**
   - Descriptive Naming: Choose variable names that clearly indicate their purpose (e.g., studentAge instead of age). This makes your code easier to read and understand.
   - Camel Case: Follow Java's camelCase convention for variable names. Start with a lowercase letter, and capitalize the first letter of each subsequent word (e.g., itemPrice, studentName).
   - Case Sensitivity Matters: Java is case-sensitive. counter and Counter are treated as completely different variables. Be mindful of capitalization.
   - Comments: While the exercise didn't heavily emphasize them, get into the habit of adding comments to explain your code. This is crucial for maintainability and collaboration. Even simple comments help!
   - Data Types: Use the appropriate data type for your variables (e.g., int for whole numbers, double for decimals, String for text).
   - Consistent Indentation: Although not explicitly in the instructions, consistent indentation greatly improves readability. Most IDEs will automatically handle this for you.
      
   **Step-by-Step Instructions:**

   1. Class and Main Method
      - Create a file named `VariablesAndCaseSensitivity.java`.
      - Define the class `VariablesAndCaseSensitivity`.
      - Inside the class, define the `main` method.  This is where your program starts running.
      ```Java
      public class VariablesAndCaseSensitivity {
          public static void main(String[] args) {
      
          }
      }
      ```
      
   2. Declare an Integer Variable
      - Inside the `main` method, declare an integer variable named `studentAge` and initialize it with a whole number (e.g., 15).
      ```Java
      int studentAge = 15;
      ```
            
   3. Declare a Double Variable
      - Below the `studentAge` declaration, declare a double variable named `itemPrice` and initialize it with a decimal number (e.g., 29.99).
      ```Java
      double itemPrice = 29.99;
      ```

   4. Declare a String Variable
      - Below the `itemPrice` declaration, declare a String variable named `studentName` and initialize it with a name (e.g., "Alice").  Remember that Strings are enclosed in double quotes.
      ```Java
      String studentName = "Alice";
      ```

   5. Demonstrate Case Sensitivity (Variable 1)
      - Declare an integer variable named `counter` and initialize it with a number (e.g., 10).
      ```Java
      int counter = 10;
      ```

   6. Demonstrate Case Sensitivity (Variable 2)
      - Declare another integer variable named `Counter` (notice the capital 'C'). Initialize it with a different number (e.g., 20).
      ```Java
      int Counter = 20;
      ```

   7. Output the Values (Age)
      - Use `System.out.println()` to display the value of the `studentAge` variable along with a descriptive label (e.g., "Student Age: ").
      ```Java
      System.out.println("Student Age: " + studentAge);
      ```

   8. Output the Values (Price)
      - Use `System.out.println()` to display the value of the `itemPrice` variable with a label (e.g., "Item Price: $").
      ```Java
      System.out.println("Item Price: $" + itemPrice);
      ```

   9. Output the Values (Name)
      - Use `System.out.println()` to display the value of the `studentName` variable with a label (e.g., "Student Name: ").
        ```Java
        System.out.println("Student Name: " + studentName);
        ```

   10. Output Case Sensitivity Variables
      - Use `System.out.println()` to display the value of both `counter` and `Counter` variables, each with its own label. This will demonstrate that Java treats them as two distinct variables.
        ```Java
        System.out.println("Counter: " + counter);
        System.out.println("Counter (Different Case): " + Counter);
        ```

   11. Compile and Run
       - Save the file as `VariablesAndCaseSensitivity.java`.
       - Compile the code using `javac VariablesAndCaseSensitivity.java` in your terminal or command prompt.
       - Run the compiled code using `java VariablesAndCaseSensitivity`.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 02 - Session 01 - Exercise 01"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```

