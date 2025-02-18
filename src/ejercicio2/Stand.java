/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan David
 */
public class Stand {
     private int numero;
    private String ubicacion;
    private String tamaño;
    private List<Comentario> comentarios;

    public Stand(int numero, String ubicacion, String tamaño) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamaño = tamaño;
        this.comentarios = new ArrayList<>();
    }

    public void agregarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public double obtenerCalificacionPromedio() {
        if (comentarios.isEmpty()) return 0;
        double suma = 0;
        for (Comentario c : comentarios) {
            suma += c.obtenerCalificacion();
        }
        return suma / comentarios.size();
    }

    @Override
    public String toString() {
        return "Stand " + numero + " en " + ubicacion + " (" + tamaño + ")";
    }
}