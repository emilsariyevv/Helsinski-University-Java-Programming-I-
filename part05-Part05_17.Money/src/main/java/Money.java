public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {

        int sumEuros = this.euros + addition.euros;
        int sumCents = this.cents + addition.cents;

        if (sumCents >= 100) {
            sumEuros = sumEuros + sumCents / 100;
            sumCents = sumCents % 100;
        }

        return new Money(sumEuros, sumCents);
    }

    public boolean lessThan(Money compared) {

        if (this.euros < compared.euros) {
            return true;
        } 
        else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser) {

        int decreaseEuros = this.euros - decreaser.euros;
        int decreaseCents = this.cents - decreaser.cents;

        if (decreaseCents < 0) {
            decreaseCents = decreaseCents + 100;
            decreaseEuros = decreaseEuros - 1;
        }

        if (decreaseEuros < 0) {
            return new Money(0, 0);
        }

        return new Money(decreaseEuros, decreaseCents);
    }
}