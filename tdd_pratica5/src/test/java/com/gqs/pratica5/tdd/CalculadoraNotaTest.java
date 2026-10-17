package com.gqs.pratica5.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraNotaTest {

    private final CalculadoraNota calc = new CalculadoraNota();

    @Test
    void deveRejeitarA1MaiorQue30() {
        assertThrows(IllegalArgumentException.class,
            () -> calc.calcularNotaFinal(35, 20, 30));
    }

    @Test
    void deveAprovarComNotaEFrequenciaSuficientes() {
        assertEquals("APROVADO", calc.situacao(80, 90));
    }

    @Test
    void deveReprovarComNotaBaixa() {
        assertEquals("REPROVADO", calc.situacao(60, 90));
    }

    @Test
    void deveReprovarPorFrequenciaMesmoComNotaAlta() {
        assertEquals("REPROVADO", calc.situacao(95, 74));
    }

    @Test
    void deveAprovarComFrequenciaExatamente75() {
        assertEquals("APROVADO", calc.situacao(70, 75));
    }
}