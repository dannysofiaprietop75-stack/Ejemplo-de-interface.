package com.mycompany.sistemaacademico;

public class Examen implements Evaluable {
    private String materia;
    private double calificacion;

    public Examen(String materia, double calificacion) {
        this.materia = materia;
        this.calificacion = calificacion;
    }

    @Override
    public double calcularNotaFinal() {
        System.out.println("Calculando nota del examen de la materia: " + materia);
        return this.calificacion;
    }
}