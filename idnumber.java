public class studentID {
    public static void main(String[] args){
        int studentID = 1000054943;
        int number = studentID % 100;
        System.out.println(number);
        int firstDigit = number / 10; //3
        int secondDigit = number % 10; //4
        System.out.println(secondDigit * 10 + firstDigit);


    }
}
