package pl.marcelmudrak.firsttests;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class NumberRepresentationTest {

    @Test
    void testDoubleRepresentation() {
        double a = 0.02;
        double b = 0.03;
        double c = b - a;

        System.out.println("Double 0.02 - 0.03:");
        System.out.println(c);
        System.out.println("Double 0.003 - 0.002:");
        System.out.println(a - b);
    }

    @Test
    void testFloatRepresentation() {
        float a = 0.002f;
        float b = 0.003f;
        float c = b - a;

        System.out.println("Float 0.002 - 0.003:");
        System.out.println(c);
        System.out.println("Float 0.003 - 0.002:");
        System.out.println(a - b);
    }

    @Test
    void testBigDecimalRepresentation() {
        BigDecimal a = new BigDecimal("0.002");
        BigDecimal b = new BigDecimal("0.003");
        BigDecimal c = a.subtract(b);

        System.out.println("Big Decimal 0.02 - 0.03:");
        System.out.println(c);
    }
}
