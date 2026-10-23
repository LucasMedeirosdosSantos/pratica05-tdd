package com.gqs.pratica5.tdd;

public class CalculadoraNota {

    public boolean podeFazerAI(double a1, double a2, double a3, double frequencia) {
    double notaFinal = a1 + a2 + a3;

    if (notaFinal >= 70 || frequencia < 75) {
        return false;
    }

    return (a1 + a3 >= 40) || (a2 + a3 >= 40);
}

public boolean podeFazerAI(double a1, double a2, double a3, double frequencia) {
    return (a1 + a2 + a3 < 70)
            && (frequencia >= 75)
            && ((a1 + a3 >= 40) || (a2 + a3 >= 40));
}

}