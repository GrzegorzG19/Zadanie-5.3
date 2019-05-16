public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2,10);
        Point p2 = new Point(4,9);
        Line point1 = new Line(p1);
        Line point2 = new Line(p2);

        Longer longer = new Longer();

        longer.ifLong(point1,point2);
    }
}
