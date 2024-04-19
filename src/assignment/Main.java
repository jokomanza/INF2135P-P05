package assignment;

public class Main {

    public static void main(String[] args) {

        Dot dot1 = new Dot(1, 2);
        Dot dot2 = new Dot(3, 4);
        System.out.println("Distance: " + calculateDistance(dot1, dot2));
    }

    private static long calculateDistance(Dot dot1, Dot dot2) {
        long x1 = dot1.getX();
        long y1 = dot1.getY();
        long x2 = dot2.getX();
        long y2 = dot2.getY();
        return (long) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}


