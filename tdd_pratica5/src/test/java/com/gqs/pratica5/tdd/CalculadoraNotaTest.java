package com.gqs.pratica5.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraNotaTest {

    private final CalculadoraNota calc = new CalculadoraNota();

    @Test
void devePermitirAIQuandoA2MaisA3Atinge40() {
    assertTrue(calc.podeFazerAI(10, 20, 30, 80));
}

@Test
void devePermitirAIQuandoA1MaisA3EhExatamente40() {
    assertTrue(calc.podeFazerAI(10, 5, 30, 80));
}

@Test
void naoDevePermitirAIQuandoNotaFinalJaFoiAprovada() {
    assertFalse(calc.podeFazerAI(25, 25, 30, 80));
}

@Test
void naoDevePermitirAIQuandoFrequenciaAbaixoDe75() {
    assertFalse(calc.podeFazerAI(10, 20, 30, 70));
}

@Test
void naoDevePermitirAIQuandoNenhumaSomaAtinge40() {
    assertFalse(calc.podeFazerAI(5, 5, 30, 80));
}
}