package shapes;

public class Square extends Quadrilateral {
    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }
}
