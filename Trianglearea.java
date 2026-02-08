public class area{
    public static void main(String[] args){
        int S_Variable = 25;
        //we know Heron's formula- S = (a+b+c)/2
        //So S er values assign korlam
                int A = 10;
                int B = 20;
                int C = 20;
                //3 ta side er values dilam
        int s1 = S_Variable - A; //Basically s-a
        int s2 = S_Variable - B; //Basically s-b
        int s3 = S_Variable - C; //Basically s-c
        int s4 = S_Variable * s1 * s2 * s3; //s(s-a)(s-b)(s-c)
        double area = Math.sqrt(s4); //puratar upor just root square korlam
        System.out.println(area);

        /* Simple Java Code to determine the area of
            a triangle using the Heron's formula 
            (predetermined Values) */




    }
}
