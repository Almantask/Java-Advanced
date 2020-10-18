package Day1.OOPExample;

import java.math.BigDecimal;

public class Litas extends Money{
    public Litas(BigDecimal amount) {
        super("LIT", amount);
    }

    public Euro toEuro(){
        return new Euro(getAmount().multiply(new BigDecimal("0.33")));
    }
}
