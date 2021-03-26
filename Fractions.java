package HomeWork;

public class Fractions {
    private long numerator;
    private short denominator;

    public Fractions(long numerator, short denominator) {
        if (denominator == 0)
            System.out.println("Denominator can not be null");
        else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public Fractions addition(Fractions fractions) {
        long resultNumerator = numerator * fractions.denominator + fractions.numerator * denominator;
        short resultDenominator = (short) (denominator * fractions.denominator);
        return new Fractions(resultNumerator, resultDenominator);
    }

    public Fractions subtraction(Fractions fractions) {
        long resultNumerator = numerator * fractions.denominator - fractions.numerator * denominator;
        short resultDenominator = (short) (denominator * fractions.denominator);
        return new Fractions(resultNumerator, resultDenominator);
    }

    public Fractions multiplication(Fractions fractions) {
        long resultNumerator = numerator * fractions.numerator;
        short resultDenominator = (short) (denominator * fractions.denominator);
        return new Fractions(resultNumerator, resultDenominator);
    }

    public Fractions division(Fractions fractions) {
        long resultNumerator = numerator * fractions.denominator;
        short resultDenominator = (short) (denominator * fractions.numerator);
        return new Fractions(resultNumerator, resultDenominator);
    }

    public boolean equal(Fractions fractions) {
        return ((double) numerator / denominator == (double) fractions.numerator / fractions.denominator);
    }

    public boolean comparison(Fractions fractions) {
        return ((double) numerator / denominator > (double) fractions.numerator / fractions.denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}