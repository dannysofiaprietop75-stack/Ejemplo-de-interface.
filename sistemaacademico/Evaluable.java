package com.mycompany.sistemaacademico;

public interface Evaluable {
    // Métodos abstractos que toda clase evaluable debe implementar
    double calcularNotaFinal();
    String obtenerDetallesEvaluacion();
    boolean estaAprobado();
}