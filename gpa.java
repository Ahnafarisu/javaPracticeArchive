//CGPA based scholarship determiner program
import java.util.Scanner;
  public class gpa{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your CGPA: ");
    double cgpa = sc.nextDouble();
    System.out.println("Enter the amount of credits you completed: ");
    int credits = sc.nextInt();
     if(cgpa>=3.95 && credits>=100){
    int amount = 50000;
    int new_amount = amount + (amount * 10/100);
    System.out.println("Your scholarship amount is " + new_amount + "Taka");
    System.out.println("Excellence performance, you get a bonus gift");
    }
    else if(cgpa>=3.90 && credits>=100){
    System.out.println("Your scholarship amount is 50,000 taka");
    }
    else if(cgpa>=3.75 && credits>=80){
    System.out.println("Your scholarship amount is 30,000 taka");
    }
    else if(cgpa>=3.50 && credits>=60){
    System.out.println("Your scholarship amount is 20,000 taka");
    
    }
    else{
    System.out.println("No scholarship.");
    }
     
    }
  }
