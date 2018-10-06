package zad9_1;

import java.util.Objects;

public class Line2D extends Shape2D {

    private Point lineStart, lineEnd;

    public Line2D(Point lineStart, Point lineEnd) {
        this.lineStart = lineStart;
        this.lineEnd = lineEnd;
    }

    public Point getLineStart() {
        return lineStart;
    }

    public void setLineStart(Point lineStart) {
        this.lineStart = lineStart;
    }

    public Point getLineEnd() {
        return lineEnd;
    }

    public void setLineEnd(Point lineEnd) {
        this.lineEnd = lineEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line2D line2D = (Line2D) o;
        return Objects.equals(lineStart, line2D.lineStart) &&
                Objects.equals(lineEnd, line2D.lineEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineStart, lineEnd);
    }

    @Override
    public String toString() {
        return "Start Point: " + lineStart + ", End Point: " + lineEnd;
    }
}
