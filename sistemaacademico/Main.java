package com.mycompany.sistemaacademico;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE EVALUACIÓN ACADÉMICA (INTERFACES) ===");
        System.out.println();

        // Creamos un arreglo o lista de elementos que implementan Evaluable (Polimorfismo)
        Evaluable[] evaluaciones = {
            new Examen("Programación Orientada a Objetos", 4.5, 20),
            new ProyectoFinal("Sistema IoT para Invernadero", 4.8, 4.2),
            new Examen("Cálculo Integral", 2.8, 10)
        };

        // Recorremos las evaluaciones de forma genérica gracias a la interfaz
        for (Evaluable evaluacion : evaluaciones) {
            System.out.println(evaluacion.obtenerDetallesEvaluacion());
            double nota = evaluacion.calcularNotaFinal();
            System.out.println("Nota Final: " + nota);
            
            if (evaluacion.estaAprobado()) {
                System.out.println("Estado: APROBADO");
            } else {
                System.out.println("Estado: REPROBADO");
            }
            System.out.println("--------------------------------------------------");
        }
    }
}
