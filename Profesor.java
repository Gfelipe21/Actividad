package escolar;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan camilo
 */
public class Profesor {
    /* datos del docente*/
     private String identificacion; 
    private String nombre;
    private String apellidos;
    private String email;
    private String direccion;
    private String celular;
    
    /* creacion del sistema de lista y notas */
    private ArrayList<String> asignaturas;
    private ArrayList<Double> notas;

    /*codigo el cual podemos ponerlos datos del profesor */
    public Profesor (String identificacion,String nombre,String apellidos,String direccion,String email,String celular){
        this.identificacion=identificacion;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.email=email;
        this.direccion=direccion;
        this.celular=celular;
      
        
    }
    public String getIdentifiacion (){
        return identificacion;
    }
    public void setIdentificacion (String identificacion){
        this.identificacion=identificacion;
    }
     public String getNombre (){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
     public String getApellidos (){
        return apellidos;
    }
    public void setApellidos (String apellidos){
        this.apellidos=apellidos;
    }
      public String getEmail (){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
     public String getDireccion (){
        return direccion;
    }
    public void setDireccion (String direccion){
        this.direccion=direccion;
    }
     public String getCelular (){
        return celular;
    }
    public void setCelular (String celular){
        this.celular=celular;
    }
  
    /*codigo el cual presenta la lista de las asignaturas y el sistema de notas */
    
    public Profesor() {
        asignaturas = new ArrayList<String>();
        notas = new ArrayList<Double>();
    }

    public void agregarAsignatura(String asignatura) {
        asignaturas.add(asignatura);
        notas.add(0.0); // Inicialmente, la nota es cero
    }

    public void ponerNota(String asignatura, double nota) {
        int index = asignaturas.indexOf(asignatura);
        if (index != -1) {
            notas.set(index, nota);
        }
    }
}
