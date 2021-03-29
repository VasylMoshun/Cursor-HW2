package homework;

public class Money {
    public long uah;
    public byte kopeck;

    public Money(long uah, byte kopeck) {
        this.uah = uah;
        this.kopeck = kopeck;
    }

    public Money addition(Money money) {
        long resultUah = uah + money.uah;
        int resultKopeck = (byte) (kopeck + money.kopeck);
        if (resultKopeck >= 100) {
            resultUah++;
            resultKopeck = (byte) (resultKopeck - 100);
        }
        return new Money(resultUah, (byte) resultKopeck);
    }

    public Money subtraction(Money money) {
        long resultUah = uah - money.uah;
        int resultKopeck = (kopeck - money.kopeck);
        if (resultKopeck < 0) {
            resultUah--;
            resultKopeck = (byte) (100 + resultKopeck);
        }
        return new Money(resultUah, (byte) resultKopeck);
    }

    public double MoneyToKopeck() {
        double MoneyToKopeck = (uah * 100 + kopeck / 100d);
        return MoneyToKopeck;
    }

    public Money multiplicationOnNumber(float number) {
        double moneyMultiplication = MoneyToKopeck() * number;
        long resultUah = (long) moneyMultiplication;
        long resultKopeck = (long) ((moneyMultiplication % resultUah) * 100);
       if (resultKopeck > 100) {
           resultUah += resultKopeck / 100;
           resultKopeck -= resultUah * 100;
       }

        return new Money(resultUah, (byte) resultKopeck);

    }

    public Money divisionOnNumber(float number) {
        if (uah == 0 && kopeck == 0)
            System.out.println("can not division for 0");
        double moneyMultiplication = MoneyToKopeck() / number;
        long resultUah = (long) moneyMultiplication;
        long resultKopeck = (long) ((moneyMultiplication % resultUah) * 100);
        if (resultKopeck > 100) {
            resultUah += resultKopeck / 100;
            resultKopeck -= resultUah * 100;
        }
        return new Money(resultUah, (byte) resultKopeck);
    }

    public Money multiplicationOnMoney(Money money) {
        double moneyToKop1 = MoneyToKopeck();
        double moneyToKop2 = ((money.uah * 100) + money.kopeck) / 100d;
        double moneyMultiplication1 = moneyToKop1 * moneyToKop2;
        long resultUah = (long) moneyMultiplication1;
        long resultKopeck = (long) ((moneyMultiplication1 % resultUah) * 100);
        if (resultKopeck > 100) {
            resultUah += resultKopeck / 100;
            resultKopeck -= resultUah * 100;
        }
        return new Money(resultUah, (byte) resultKopeck);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return uah == money.uah &&
                kopeck == money.kopeck;
    }

    @Override
    public String toString() {
        return uah + "," + kopeck;
    }

}










