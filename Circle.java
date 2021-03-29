package homework;

public class Circle {
    public double radius;
    public double square;

    public Circle() {
        this.radius = radius;
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

    public double square() {
        double a = 2;  //power
        square = square = Math.PI * Math.pow(getRadius(), a);
        return square;
    }
}
