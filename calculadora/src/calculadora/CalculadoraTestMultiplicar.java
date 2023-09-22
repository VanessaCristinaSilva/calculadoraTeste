package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTestMultiplicar {

    @Test
    void testMultiplicarDoisNumerosPositivos() {
        Calculadora c = new Calculadora();
        double multiplicar = c.multiplicar(2, 5);
        assertEquals(10, multiplicar);
    }
    @Test
    void testMultiplicarDoisNumerosPositivosX() {
        Calculadora c = new Calculadora();
        double multiplicar = c.multiplicar(2, 5);
        assertEquals(18, multiplicar);
    }

    @Test
    void testMultiplicarUmNumeroZero() {
        Calculadora c = new Calculadora();
        double multiplicar = c.multiplicar(4, 0);
        assertEquals(0, multiplicar);
    }
    @Test
    void testMultiplicarUmNumeroZeroX() {
        Calculadora c = new Calculadora();
        double multiplicar = c.multiplicar(4, 0);
        assertEquals(2, multiplicar);
    }

    @Test
    void testMultiplicarDoisNumerosZero() {
        Calculadora c = new Calculadora();
        double multiplicar = c.multiplicar(0, 0);
        assertEquals(0, multiplicar);
    }
    @Test
    void testMultiplicarDoisNumerosZeroX() {
        Calculadora c = new Calculadora();
        double multiplicar = c.multiplicar(0, 0);
        assertEquals(4, multiplicar);
    }
    @Test
    void testMultiplicarUmNumeroNegativo() {
        Calculadora c = new Calculadora();
        double multiplicar = c.multiplicar(-2, 2);
        assertEquals(-4, multiplicar);
    }
    @Test
    void testMultiplicarUmNumeroNegativoX() {
        Calculadora c = new Calculadora();
        double multiplicar = c.multiplicar(-2, 2);
        assertEquals(-7, multiplicar);
    }
}