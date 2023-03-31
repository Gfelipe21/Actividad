/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escolar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AUTONOMA
 */
public class main {
     public static void main(String[] args) {
    // Crear objeto Estudiante
    List<Double> notas = new ArrayList<>();
    notas.add(4.5);
    notas.add(3.8);
    notas.add(4.2);
    Estudiante estudiante = new Estudiante("123456789", "Juan", "Pérez", "juan.perez@example.com", "Calle 123",
            "1234567890", notas, "Ingeniería de Sistemas");

    // Obtener y mostrar promedio de notas
    double promedio = estudiante.obtenerPromedio();
    System.out.println("El promedio de notas es: " + promedio);

    // Establecer nuevas notas y volver a obtener el promedio
    List<Double> nuevasNotas = new ArrayList<>();
    nuevasNotas.add(3.5);
    nuevasNotas.add(4.0);
    estudiante.establecerNotas(nuevasNotas);

    promedio = estudiante.obtenerPromedio();
    System.out.println("El nuevo promedio de notas es: " + promedio);
}
}
