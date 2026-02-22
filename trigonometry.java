public class trigonometry {
    public static void main(String[] args){
        double a = 4.5;
        double b = 9.5;
        double c = a * a + b * b;
        double c2 = Math.sqrt(c);
        double sinA = a / c;
        double sinB = b /c;
        double cosA = b / c;
        double cosB = a / c;
        System.out.println("The values of SinA, SinB, CosA and CosB are given below respectively: ");
        System.out.println(sinA);
        System.out.println(sinB);
        System.out.println(cosA);
        System.out.println(cosB);


    }
}
