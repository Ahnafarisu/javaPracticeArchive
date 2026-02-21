import java.util.Scanner;
public class nasa {
    public static void main(String[] args){
        //Coding Task 1
        Scanner sc = new Scanner(System.in);
        System.out.println("How much time has passed since the mission? (in minutes)");
        long minutes = sc.nextLong();
        long hour = minutes / 60;
        long days = hour / 24; //803765 hours
        long years = days / 365; // 10 years
       //modulus can be used too
        long days2 = years * 365;
        long remainedDays = days - days2;

        System.out.println(minutes + " minutes" + " is " + "approximately " + years + " years " + "and " + remainedDays + " days");





    }
}
