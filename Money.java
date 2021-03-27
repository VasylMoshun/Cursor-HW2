package HomeWork;

import java.util.Objects;

public class Money {
    public long Uah;
    public byte kopeck;
    float number = 4;

    public Money(long Uah, byte kopeck) {
        this.Uah = Uah;
        this.kopeck = kopeck;
    }
        public Money addition(Money money) {
        long resultUah = Uah + money.Uah;
        int resultKopeck = (byte) (kopeck + money.kopeck);
        if (resultKopeck >= 100) {
            resultUah++;
            resultKopeck = (byte) (resultKopeck - 100);
        }
        return new Money(resultUah, (byte) resultKopeck);
    }
    public Money subtraction(Money money) {
        long resultUah = Uah - money.Uah;
        int resultKopeck = (kopeck - money.kopeck);
        if (resultKopeck < 0) {
            resultUah--;
                        resultKopeck = (byte) (100 + resultKopeck);
        }
        return new Money(resultUah, (byte) resultKopeck);
    }
    public Money multiplicationOnNumber(float number) {
        double moneyToKop = (Uah * 100 + kopeck) / 100d;
        double moneyMultiplication = moneyToKop * number;
        long resultUah = (long) moneyMultiplication;
        long resultKopeck = (long) (moneyMultiplication % resultUah) * 100;
        if (resultKopeck > 100) {
            resultUah += resultUah / 100;
            resultKopeck -= resultKopeck * 100;
        }
            return new Money(resultUah, (byte) resultKopeck);

    }
    public Money divisionOnNumber(float number) {
        if (Uah == 0 && kopeck == 0)
            System.out.println("can not division for 0");
            double moneyToKop = (Uah * 100 + kopeck) / 100d;
            double moneyMultiplication = moneyToKop / number;
            long resultUah = (long) moneyMultiplication;
            int resultKopeck = (int) (moneyMultiplication % resultUah) * 100;
            return new Money(resultUah, (byte) resultKopeck);
        }
    public Money multiplicationOnMoney (Money money) {
        double moneyToKop1 = ((Uah * 100) + kopeck) / 100d;
        double moneyToKop2 = ((money.Uah * 100) + money.kopeck) / 100d;
        double moneyMultiplication = moneyToKop1 * moneyToKop2;
        long resultUah = (long) moneyMultiplication;
        int resultKopeck = (int) (moneyMultiplication % resultUah) * 100;
        if (resultKopeck > 100) {
            resultUah += resultUah / 100;
            resultKopeck -= resultKopeck * 100;
        }
            return new Money(resultUah, (byte) resultKopeck);
            }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Uah == money.Uah &&
                kopeck == money.kopeck;
    }
    @Override
    public String toString() {
        return Uah + "," + kopeck;
    }

}










