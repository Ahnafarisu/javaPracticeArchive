public class shortestpath {
    public static void main(String []args){
        int length = 10;
        int width = 13;
        int squares = length * length + width * width;
        double shortestPath = Math.sqrt(squares);
        System.out.println("The shortest straight line distance (diagonal) is: " + shortestPath);

    }
}
