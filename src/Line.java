public class Line {
    int odc;


    Point p1;
    Point p2;


    public Line(Point point1, Point point2) {
    this.p1 = point1;
    this.p2 = point2;

        odc = p2.start - p1.start;
    }
}


