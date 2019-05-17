public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2);
        Point p2 = new Point(4);
        Point p3 = new Point(5);
        Point p4 = new Point(8);
        Line line1 = new Line(p1,p2);
        Line line2 = new Line(p3,p4);

        Longer longer = new Longer();

        longer.ifLong(line1,line2);
    }
}
