package com.mycompany.sistemaacademico;

public class Main {
    public static void main(String[] args) {
        // Demostración de Interface con polimorfismo
        Evaluable miExamen = new Examen("Estructuras de Datos", 4.8);
        
        double notaFinal = miExamen.calcularNotaFinal();
        System.out.println("La nota final obtenida es: " + notaFinal);
    }
}
