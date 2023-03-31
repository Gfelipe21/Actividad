/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escolar;

/**
 *
 * @author AUTONOMA
 */
import java.util.ArrayList;

public class Asignatura {
    
    private ArrayList<Estudiante> listaEstudiantes;

    public Asignatura(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public double calcularPromedioSalon() {
        double sumaNotas = 0;
        int cantidadEstudiantes = listaEstudiantes.size();
        
        for (Estudiante estudiante : listaEstudiantes) {
            sumaNotas += estudiante.calcularPromedioSalon();
        }
        
        return sumaNotas / cantidadEstudiantes;
    }
}
