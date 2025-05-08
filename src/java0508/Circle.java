package java0508;

public class Circle {
    private double x, y;
    private double r;

//    public Circle() {
//    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }
}
