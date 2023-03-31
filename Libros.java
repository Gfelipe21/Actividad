/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Familia Garzon
 */
public class Libros {
    String titulo;
    String autor;
    int año;
    String Editorial;
    String refB;
        
    public Libros(String titulo, String autor, int año, String Editorial, String refB) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.Editorial = Editorial;
        this.refB = refB;
    }
    
    public void imprimir (){
        System.out.println( "Este es su libro " + titulo + año + autor + Editorial + refB);
        
    }
    
}
