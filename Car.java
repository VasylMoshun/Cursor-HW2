package homework;

public class Car {

    String mark;
    boolean motorStart;
    boolean drive;
    int goStaticSpeed;

    public Car() {
        this.mark = mark;
        this.goStaticSpeed = goStaticSpeed;
    }

    public int getGoStaticSpeed() {
        return goStaticSpeed;
    }

    public void setGoStaticSpeed(int goStaticSpeed) {
        this.goStaticSpeed = goStaticSpeed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void Motor() {
        if (goStaticSpeed > 0)
            motorStart = true;
        drive = true;
        if (goStaticSpeed < 0)
            motorStart = false;
    }

    public void info() {
        System.out.println("car manufacturer:" + "" + getMark());
        System.out.println("car speed: " + getGoStaticSpeed());
        Motor();
        System.out.println("Car motor start" + " " + motorStart);
        System.out.println("Car Drive" + " " + drive);

    }
}


