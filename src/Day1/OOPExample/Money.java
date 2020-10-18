package Day1.OOPExample;

import java.math.BigDecimal;

public abstract class Money {
    // Final for immutability.
    private final String currency;
    private final BigDecimal amount;

    public Money(String currency, BigDecimal amount){
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
