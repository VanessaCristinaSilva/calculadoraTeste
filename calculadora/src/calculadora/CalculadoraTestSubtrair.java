package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTestSubtrair {

    @Test
    void testSubtrairDoisNumerosPositivos() {
        Calculadora c = new Calculadora();
        double subtrair = c.subtrair(2, 1);
        assertEquals(1, subtrair);
    }
    
    @Test
    void testSubtrairDoisNumerosPositivosX() {
        Calculadora c = new Calculadora();
        double subtrair = c.subtrair(2, 1);
        assertEquals(2, subtrair);
    }
    @Test
    void testSubtrairUmNumeroZero() {
        Calculadora c = new Calculadora();
        double subtrair = c.subtrair(7, 0);
        assertEquals(7, subtrair);
    }
    
    @Test
    void testSubtrairUmNumeroZeroX() {
        Calculadora c = new Calculadora();
        double subtrair = c.subtrair(7, 0);
        assertEquals(9, subtrair);
    }
    
    @Test
    void testSubtrairDoisNumerosZero() {
        Calculadora c = new Calculadora();
        double subtrair = c.subtrair(0, 0);
        assertEquals(0, subtrair);
    }
    
    @Test
    void testSubtrairDoisNumerosZeroX() {
        Calculadora c = new Calculadora();
        double subtrair = c.subtrair(0, 0);
        assertEquals(4, subtrair);
    }

    @Test
    void testSubtrairUmNumeroNegativo() {
        Calculadora c = new Calculadora();
        double subtrair = c.subtrair(4, -2);
        assertEquals(2, subtrair);
    }
    
    @Test
    void testSubtrairUmNumeroNegativoX() {
        Calculadora c = new Calculadora();
        double subtrair = c.subtrair(4, -2);
        assertEquals(3, subtrair);
    }
}