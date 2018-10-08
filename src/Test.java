import point.*;

public class Test {
    public static void main(String[] args) {
        Point2D point = new Point2D(3,4);
        System.out.println(point.toString());
        point = new Point3D(point.getX(),point.getY(),10);
        System.out.println(point.toString());
    }
}
