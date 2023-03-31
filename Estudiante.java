package escolar;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan camilo
 */


public class Estudiante {
    // Atributos
    private String identificacion;
    private String nombre;
    private String apellidos;
    private String email;
    private String direccion;
    private String celular;
    private List<Double> notas;
    private String carrera;

    // Constructor
    public Estudiante(String identificacion, String nombre, String apellidos, String email, String direccion,
            String celular, List<Double> notas, String carrera) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.direccion = direccion;
        this.celular = celular;
        this.notas = notas;
        this.carrera = carrera;
    }

    // Métodos para obtener y establecer el promedio de notas
    public double obtenerPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    public void establecerNotas(List<Double> notas) {
        this.notas = notas;
    }

    public List<Double> obtenerNotas() {
        return notas;
    }

    // Métodos getters y setters para los demás atributos
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}


/* posible metodo a realizar 

Estudiante estudiante = new Estudiante();
estudiante.agregarAsignatura("Matemáticas");
estudiante.agregarAsignatura("Física");
estudiante.ponerNota("Matemáticas", 8.5);
estudiante.ponerNota("Física", 7.8);
double promedio = estudiante.calcularPromedio();
System.out.println("El promedio del estudiante es: " + promedio);
*/