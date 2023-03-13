package pl.marcelmudrak.creditcard;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal balance;
    public CreditCard(String cardnumber) {

    }

    public void assignLimit(BigDecimal limit) {
        this.balance = limit;
    }

    public Object getCurrentBalance() {
        return balance;
    }
}
