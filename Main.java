package HomeWork;

public class Main {

    public static void main(String[] args) {
        // Task1
        Circle circle1 = new Circle();
        circle1.setRadius(4.2);
        Circle circle2 = new Circle();
        circle2.setRadius(-3);
        System.out.println("Radius circle1: = " + circle1.getRadius() + "\n Square circle1: =" + circle1.square() + "\n");
        //Task2
        for (int i = 0; i < 50; i++) {
            new CountObjects();
        }
        System.out.println("Numbers of objects: " + CountObjects.getNumber() + "\n");
        //Task3
        Car car = new Car();
        car.setCarMark("BMW");
        car.setCarGoStaticSpeed(60);
        car.setCarDrive(true);
        car.setCarMotorStop(false);
        System.out.println("car manufacturer:" + car.getCarMark() + "\n car speed:  " + car.getCarGoStaticSpeed() + "\n");
        //Task4
        Fractions fractions1 = new Fractions(2L, (short) 3);
        Fractions fractions2 = new Fractions(1L, (short) 4);
        System.out.println(fractions1.toString() + " + " + fractions2.toString() + " = " + fractions1.addition(fractions2).toString());
        System.out.println(fractions1.toString() + " - " + fractions2.toString() + " = " + fractions1.subtraction(fractions2).toString());
        System.out.println(fractions1.toString() + " * " + fractions2.toString() + " = " + fractions1.multiplication(fractions2).toString());
        System.out.println(fractions1.toString() + " " + " / " + " " + fractions2.toString() + " = " + fractions1.division(fractions2).toString());
        boolean result;
        result = fractions1.equal(fractions2);
        System.out.println(fractions1.toString() + " == " + fractions2.toString() + " = " + result);
        result = fractions1.comparison(fractions2);
        System.out.println(fractions1.toString() + " > " + fractions2.toString() + " = " + result + "\n");
        //Task5
        Money money1 = new Money(88L, (byte) 8);
        Money money2 = new Money(3L, (byte) 7);
        System.out.println(money1.toString() + " + " + money2.toString() + " = " + money1.addition(money2).toString());
        System.out.println(money1.toString() + " - " + money2.toString() + " = " + money1.subtraction(money2).toString());
        System.out.println(money1.toString() + " * " + 4 + " = " + money1.multiplicationOnNumber(4).toString());
        System.out.println(money1.toString() + " / " + 4 + " = " + money1.divisionOnNumber(4).toString());
        System.out.println(money1.toString() + " * " + money2.toString() + " = " + money1.multiplicationOnMoney(money2).toString());
        System.out.println(money1.toString() + " == " + money2.toString() + " - " + money1.equals(money2));
    }
}





