public class Line {
    int odc;
    int start, end;

    public Line(Point point) {
    this.start = point.start;
    this.end = point.end;

        odc = point.end - point .start;
    }
}


