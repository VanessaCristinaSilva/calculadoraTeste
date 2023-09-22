package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTestDividir {

    @Test
    void testDividirDoisNumerosPositivos() {
        Calculadora c = new Calculadora();
        double dividir = c.dividir(50, 2);
        assertEquals(25, dividir);
    }
    
    @Test
    void testDividirDoisNumerosPositivosX() {
        Calculadora c = new Calculadora();
        double dividir = c.dividir(50, 2);
        assertEquals(45, dividir);
    }

    @Test
    void testDividirUmNumeroZero() {
        Calculadora c = new Calculadora();
        double dividir = c.dividir(5, 0);
        assertEquals(5, dividir);
    }
    
    @Test
    void testDividirUmNumeroZeroX() {
        Calculadora c = new Calculadora();
        double dividir = c.dividir(5, 0);
        assertEquals(8, dividir);
    }

    @Test
    void testDividirDoisNumerosZero() {
        Calculadora c = new Calculadora();
        double dividir = c.dividir(0, 0);
        assertEquals(0, dividir);
    }

    @Test
    void testDividirDoisNumerosZeroX() {
        Calculadora c = new Calculadora();
        double dividir = c.dividir(0, 0);
        assertEquals(1, dividir);
    }
    @Test
    void testDividirUmNumeroNegativo() {
        Calculadora c = new Calculadora();
        double dividir = c.dividir(10, -5);
        assertEquals(5, dividir);
    }
    @Test
    void testDividirUmNumeroNegativoX() {
        Calculadora c = new Calculadora();
        double dividir = c.dividir(10, -5);
        assertEquals(9, dividir);
    }
}

