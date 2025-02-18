/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
import java.util.Date;

/**
 *
 * @author Juan David
 */
public class Comentario {
          private String visitanteNombre;
    private Date fecha;
    private int calificacion;
    private String texto;

    public Comentario(String visitanteNombre, Date fecha, int calificacion, String texto) {
        this.visitanteNombre = visitanteNombre;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.texto = texto;
    }

    public int obtenerCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {
        return visitanteNombre + " [" + fecha + "]: " + calificacion + " estrellas - " + texto;
    } 
}
