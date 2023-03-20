package pl.marcelmudrak.creditcard;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal balance;

    public CreditCard(String cardnumber) {
    }

    public void assignLimit(BigDecimal limit) {
        if (limit.compareTo(BigDecimal.valueOf(100)) > 0) {
            this.balance = limit;
        }
    }

    public Object getCurrentBalance() { return balance; }

    public void withdraw(BigDecimal amount) {
        if (this.balance != null) {
            if (this.balance.compareTo(amount) > 0) {
                this.balance = this.balance.subtract(amount);
            }
        }
    }
}
