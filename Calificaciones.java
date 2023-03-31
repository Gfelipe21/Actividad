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
public class Calificaciones {

private String nombreAsignatura;
private String nombreDocente;
double nota1;
double nota2;
double nota3;

    public Calificaciones(String nombreAsignatura, String nombreDocente, double nota1, double nota2, double nota3) {
        this.nombreAsignatura = nombreAsignatura;
        this.nombreDocente = nombreDocente;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public String getnombreAsignatura(){
        return nombreAsignatura;
    }
    public void setnombreAsignatura(){
        this.nombreAsignatura = nombreAsignatura;
    }
    
    public String getnombreDocente(){
        return nombreDocente;
       
    }
    public void setnombreDocente(){
        this.nombreDocente = nombreDocente;
    }
    
   public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double obtenerPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }
     public boolean estaReprobado() {
        return obtenerPromedio() < 3;
    }
}


