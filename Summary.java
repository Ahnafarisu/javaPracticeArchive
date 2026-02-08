

public class Main2 {
    public static void main(String[] args){
        //This java class is for data variables
        /*
        Variable= a varying value or information that acts accordingly to what it holds
        There are 2 types of variable-
         */
        //🔴Primitive  vs 🔵Reference
        //----------          ---------
        //int                 string
        //double              array
        //char                object
        //boolean
        // There are 2 ways to create a variable
        //1. First we declare the variable
        //2/ Then we assign a value within it
        int age = 20;
        //step 1- declared the age variable
        //step 2- assigned the value 20
        System.out.println(age);
        int age2 = 21;
        System.out.println("And I will be turning " + age2 + " next year.");
        //We use "+" sign to print string and integer value at the same time
        double marks = 50.5;
        double gpa = 3; //double refers to values with decimals
        double money = 120.67;
                System.out.println(marks);
        System.out.println("I have only " + money + "Tk");
        System.out.println("I got GPA " + gpa);

        char initial = 'A'; //char refers to a single character
        char symbol = '!'; // Single character only
        System.out.println("Since I got only " + gpa + ", I will only get " + money + "Tk");
        //Use off boolean (True and False)
        boolean isCSStudent = true;
        /*
        --Camelcase is a term referring to the situation where
        if the variable name takes up 2 words, we combine them and
        the first letter should be uppercase while any word after that should start with
        upper case.
        for example- emailSystem

        There is also another term called 'Snake Casing' where two words of a variable name is seperated by a underscore
        for example- Email_System
        */
        boolean teacher = false;
        boolean emailSystem = false;
        //📌The usage of boolean is seen in else and else-if statements
        int course = 110;
        if(isCSStudent){
            System.out.println("Welcome to CSE" + course + symbol);
            //use of boolean and if statement
        }
        else{
            System.out.println("You are not welcome here");
        }

        String email = "bracuspring2026@gmail.com";
        System.out.println("Your last used email was- " + email);
        System.out.println("The price for new email system will be " + money + " Taka only" + symbol);
        if (emailSystem){
            System.out.println("We only have some few systems left, so grab some quick " + symbol);

        }
        else {
            System.out.println("We are very sorry, we are currently unavailable to fill you in. ");
        }


      /*This file contains all the possible examples related to data variables, operation and task of assigning values and using them
        comments are added for better understanding */









    }
}
