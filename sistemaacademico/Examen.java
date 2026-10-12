package com.mycompany.sistemaacademico;

public class Examen implements Evaluable {
    private String materia;
    private double calificacion;
    private int numeroPreguntas;

    public Examen(String materia, double calificacion, int numeroPreguntas) {
        this.materia = materia;
        this.calificacion = calificacion;
        this.numeroPreguntas = numeroPreguntas;
    }

    @Override
    public double calcularNotaFinal() {
        System.out.println("-> Evaluando examen escrito de " + materia);
        return this.calificacion;
    }

    @Override
    public String obtenerDetallesEvaluacion() {
        return "Examen [Materia: " + materia + ", Preguntas: " + numeroPreguntas + "]";
    }

    @Override
    public boolean estaAprobado() {
        return this.calificacion >= 3.0; // Nota mínima aprobatoria
    }
}
