package java0508;

public class Cylinder extends Circle {
    private double h;

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r); // 透過父類別public Circle(double x, double y, double r){}初始化
        this.h = h;
    }

    public void setHeight(double h) {
        this.h = h;
    }
}

