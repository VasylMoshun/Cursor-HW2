package HomeWork;

public class Circle {
    public double radius;
    public double pi;
    public double square;

    public Circle() {
        this.radius = radius;
        this.pi = pi;
    }

    public static void main(String[] args) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else {
            System.out.println("Radius incorrect");
        }
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        if (pi == 3.14)
            this.pi = pi;
        else {
            System.out.println("Pi incorrect");
        }
    }

    public double square() {
        return square = getPi() * getRadius() * getRadius();
    }
}
