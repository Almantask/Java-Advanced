package Day1.OOPExample;

import java.math.BigDecimal;

public class Euro extends Money{
    public Euro(BigDecimal amount) {
        super("EUR", amount);
    }

    public Litas toLitas(){
        return new Litas(getAmount().multiply(new BigDecimal("3.5")));
    }
}
