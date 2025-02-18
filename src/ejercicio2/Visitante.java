/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Juan David
 */
public class Visitante {
    private String nombre;
    private String id;
    private String email;

    public Visitante(String nombre, String id, String email) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Comentario dejarComentario(String texto, int calificacion) {
        return new Comentario(nombre, new java.util.Date(), calificacion, texto);
    }

    @Override
    public String toString() {
        return nombre + " (ID: " + id + ", Email: " + email + ")";
    }
}