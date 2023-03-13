package pl.marcelmudrak.creditcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class CreditCardTest {

    @Test
    void firstRun() {
        boolean value = true;

//        assertTrue(value);
    }

    @Test
    void secondRun() {
        boolean value = false;
    }

    @Test
    void testSchema() {
        //Arrange // Given // Input

        //Act // When // Action

        //Assertion // Then // Expected // Output
    }

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
}
