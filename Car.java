package HomeWork;

public class Car {
    String carMark;
    boolean carMotorStart;
    boolean carMotorStop;
    boolean carDrive;
    int carGoStaticSpeed;

    public Car() {
        this.carMark = carMark;
        this.carMotorStart = carMotorStart;
        this.carMotorStop = carMotorStop;
        this.carDrive = carDrive;
        this.carGoStaticSpeed = carGoStaticSpeed;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public boolean isCarMotorStart() {
        return carMotorStart;
    }

    public void setCarMotorStart(boolean carMotorStart) {
        if (carMotorStart == true)
            this.carMotorStart = carMotorStart;
        else {
            System.out.println("Car motor is stoped");
        }
    }

    public boolean isCarMotorStop() {
        return carMotorStop;
    }

    public void setCarMotorStop(boolean carMotorStop) {
        if (carMotorStop == true)
            this.carMotorStop = carMotorStop;
        else {
            System.out.println("Car motor start");
        }
    }

    public boolean isCarDrive() {
        return carDrive;
    }

    public void setCarDrive(boolean carDrive) {
        if (carGoStaticSpeed > 0)
            this.carDrive = carDrive;
        System.out.println("Car Drive");
    }

    public int getCarGoStaticSpeed() {
        return carGoStaticSpeed;
    }

    public void setCarGoStaticSpeed(int carGoStaticSpeed) {
        this.carGoStaticSpeed = carGoStaticSpeed;
    }
}


