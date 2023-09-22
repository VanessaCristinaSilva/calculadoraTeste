package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTestSomar {

    @Test
    void testMultiplicarDoisNumerosPositivos() {
        Calculadora c = new Calculadora();
        double somar = c.somar(3, 5);
        assertEquals(8, somar);
    }
    
    @Test
    void testMultiplicarDoisNumerosPositivosX() {
        Calculadora c = new Calculadora();
        double somar = c.somar(3, 5);
        assertEquals(9, somar);
    }

    @Test
    void testMultiplicarUmNumeroZero() {
        Calculadora c = new Calculadora();
        double somar = c.somar(0, 6);
        assertEquals(6, somar);
    }
    @Test
    void testMultiplicarUmNumeroZeroX() {
        Calculadora c = new Calculadora();
        double somar = c.somar(0, 6);
        assertEquals(0, somar);
    }

    @Test
    void testMultiplicarDoisNumerosZero() {
        Calculadora c = new Calculadora();
        double somar = c.somar(0, 0);
        assertEquals(0, somar);
    }
    
    @Test
    void testMultiplicarDoisNumerosZeroX() {
        Calculadora c = new Calculadora();
        double somar = c.somar(0, 0);
        assertEquals(2, somar);
    }

    @Test
    void testMultiplicarUmNumeroNegativo() {
        Calculadora c = new Calculadora();
        double somar = c.somar(0, -2);
        assertEquals(-2, somar);
    }
    
    @Test
    void testMultiplicarUmNumeroNegativoX() {
        Calculadora c = new Calculadora();
        double somar = c.somar(0, -2);
        assertEquals(-5, somar);
    }
}