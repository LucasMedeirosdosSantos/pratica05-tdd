package com.gqs.pratica5.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraNotaTest {
    
@Test
void deveRejeitarA1MaiorQue30() {
CalculadoraNota calc = new CalculadoraNota();
assertThrows(IllegalArgumentException.class,
() -> calc.calcularNotaFinal(35, 20, 30));

} 

@Test
void deveAprovarComNotaEFrequenciaSuficientes() {
    assertEquals("APROVADO", situacao(80, 90));
}

@Test
void deveReprovarComNotaBaixa() {
    assertEquals("REPROVADO", situacao(60, 90));
}

@Test
void deveReprovarPorFrequenciaMesmoComNotaAlta() {
    assertEquals("REPROVADO", situacao(95, 74));
}

@Test
void deveAprovarComFrequenciaExatamente75() {
    assertEquals("APROVADO", situacao(70, 75));
}
}
