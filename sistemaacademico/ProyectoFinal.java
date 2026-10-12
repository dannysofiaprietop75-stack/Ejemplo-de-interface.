package com.mycompany.sistemaacademico;

public class ProyectoFinal implements Evaluable {
    private String tituloProyecto;
    private double calificacionDocumento;
    private double calificacionSustentacion;

    public ProyectoFinal(String tituloProyecto, double calificacionDocumento, double calificacionSustentacion) {
        this.tituloProyecto = tituloProyecto;
        this.calificacionDocumento = calificacionDocumento;
        this.calificacionSustentacion = calificacionSustentacion;
    }

    @Override
    public double calcularNotaFinal() {
        System.out.println("-> Evaluando proyecto de software: " + tituloProyecto);
        // Ponderación: 60% documento y 40% sustentación
        return (this.calificacionDocumento * 0.6) + (this.calificacionSustentacion * 0.4);
    }

    @Override
    public String obtenerDetallesEvaluacion() {
        return "Proyecto [Título: " + tituloProyecto + ", Nota Doc: " + calificacionDocumento + ", Nota Sustentación: " + calificacionSustentacion + "]";
    }

    @Override
    public boolean estaAprobado() {
        return calcularNotaFinal() >= 3.0;
    }
}
