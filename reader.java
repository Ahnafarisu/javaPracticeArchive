import java.util.Scanner; //imports the java package for scanner usage
public class input {
    public static void main(String[] args){
        System.out.println("Welcome to the makeshift calculator"); //We are making a calc
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter your operator sign: ");
        char operator = sc.next().charAt(0); //takes the input as a single string word and converts it into char
        System.out.println("Input your second number: ");
        double num2 = sc.nextDouble();

        double result; //result = the name of the logic we want to work with

        if (operator == '+'){   //inside the first bracket the logic seats
            result  = num1 + num2;
        }
        else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;

        } else if (operator == '/') {
            result = num1 / num2;

        } else{
            System.out.println("Invalid Operator!");
            return;
        }
        System.out.println("The result of the calculation is: " + result);




    }
}
