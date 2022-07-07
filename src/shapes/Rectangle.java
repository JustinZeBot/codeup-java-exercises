package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}