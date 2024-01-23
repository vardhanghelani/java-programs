/**
 * area
 */
public class area {
    public static void main(String[] args) {
        int r;
        Innerarea obj = new Innerarea();
        double a1 = obj.circle(10);
        System.out.println(a1);
        double a2 = areaofrect(10, 20);
        System.out.println(a2);

    }

    static double areaofrect(int x, int y) {
        return x * y;
    }
}

class Innerarea {
    double circle(int r) {
        return Math.PI * r * r;
    }
}