package pl.marcelmudrak.creditcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class CreditCardTest {

    @Test
    void doesItAssignLimit() {
        // Arrange
        CreditCard card = new CreditCard("1234-5678");
        //Act
        card.assignLimit(BigDecimal.valueOf(1000));
        //Assert
        assertEquals(BigDecimal.valueOf(1000), card.getCurrentBalance());
    }
    @Test
    void doesItAssignDifferentCardLimit() {
        // Arrange
        CreditCard card1 = new CreditCard("1234-5678");
        CreditCard card2 = new CreditCard("1234-5679");
        //Act
        card1.assignLimit(BigDecimal.valueOf(1000));
        card2.assignLimit(BigDecimal.valueOf(1100));
        //Assert
        assertEquals(BigDecimal.valueOf(1000), card1.getCurrentBalance());
        assertEquals(BigDecimal.valueOf(1100), card2.getCurrentBalance());
    }

    @Test
    void doesItDenyCardBelow100() {
        CreditCard card1 = new CreditCard("1234-5678");

    }

    @Test
    void doesItDenyWithdrawLimit() {
        // Arrange
        CreditCard card1 = new CreditCard("1234-5678");
        CreditCard card2 = new CreditCard("1234-5679");
        CreditCard card3 = new CreditCard("1234-5680");

        //Act
        card1.assignLimit(BigDecimal.valueOf(1000));
        card1.withdraw(BigDecimal.valueOf(700));

        card2.assignLimit(BigDecimal.valueOf(1000));
        card2.withdraw(BigDecimal.valueOf(1200));

        card3.assignLimit(BigDecimal.valueOf(99));
        card3.withdraw(BigDecimal.valueOf(80));

        //Assert
        assertEquals(BigDecimal.valueOf(300), card1.getCurrentBalance());
        assertEquals(BigDecimal.valueOf(1000), card2.getCurrentBalance());
        assertEquals(null, card3.getCurrentBalance());

    }
}
