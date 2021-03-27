package HomeWork;

import java.util.Objects;

public class Money {
    public long Uah;
    public byte kopeck;

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

    public Money multiplication(Money money) {
        long moneyToKop = (Uah * 100) + kopeck;
        long moneyMoneyToKop = (money.Uah * 100) + money.kopeck;
        double moneyMultiplication = moneyToKop * moneyMoneyToKop;
        double resultUah1 = moneyMultiplication / 1000;
        double resultKopeck1 = (moneyMultiplication % 1000);
        byte resultKopeck = (byte) Math.round(resultKopeck1);
        long resultUah = Math.round(resultUah1);
        return new Money(resultUah, resultKopeck);
    }

    public Money division(Money money) {
        if (money.Uah == 0 && money.kopeck == 0)
            System.out.println("can not division for 0");
        long moneyToKop = (Uah * 100) + kopeck;
        long moneyMoneyToKop = (money.Uah * 100) + money.kopeck;
        double resultUah1 = moneyToKop / moneyMoneyToKop;
        double resultKopeck1 = (byte) moneyToKop % moneyMoneyToKop;
        byte resultKopeck = (byte) Math.round(resultKopeck1);
        long resultUah = Math.round(resultUah1);
        return new Money(resultUah, resultKopeck);
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










