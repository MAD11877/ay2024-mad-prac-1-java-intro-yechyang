import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter height");
    double height = myObj.nextDouble(); 

    System.out.println("Enter weight");
    double weight = myObj.nextDouble();
    double BMI = weight / (height * height);
    System.out.println("BMI is: " + BMI);
    
    myObj.close();
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
  }
}
