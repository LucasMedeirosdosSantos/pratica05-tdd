package com.gqs.pratica5.tdd;

 public class CalculadoraNota {
    private static final double VALOR_MAXIMO_a1_a2 = 30.0; 
    private static final double VALOR_MAXIMO_a3 = 40.0;
 /*  public static final double NOTA_MINIMA_APROVACAO = 70;
    public boolean estaAprovadoPorNota(double notaFinal) {
        return notaFinal >= NOTA_MINIMA_APROVACAO; */  
        public double calcularNotaFinal(double a1, double a2, double a3) {
    validarNota(a1, VALOR_MAXIMO_a1_a2,"A1");

validarNota(a2, VALOR_MAXIMO_a1_a2 ,"A2");

validarNota(a3, VALOR_MAXIMO_a3,"A3");
return a1 + a2 + a3;
    }
    private void validarNota(double nota, double notaMaxima, String nomeAvaliacao) {
        if (nota < 0 || nota > notaMaxima) {
            throw new IllegalArgumentException(nomeAvaliacao + " deve estar entre 0 e " + notaMaxima);
        }
    }
}