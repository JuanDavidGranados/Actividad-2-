/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ejercicio2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Juan David
 */
public class StandTest {
    
        @Test // Indica que este es un test
    public void testObtenerCalificacionPromedio() {
        Stand stand = new Stand(101, "Pabellón A, Stand 10", "Grande");

        // Agregamos comentarios con calificaciones
        stand.agregarComentario(new Comentario("Carlos", new java.util.Date(), 5, "Excelente"));
        stand.agregarComentario(new Comentario("Ana", new java.util.Date(), 3, "Bueno"));

        // Calculamos el promedio: (5 + 3) / 2 = 4.0
        double esperado = 4.0;
        double obtenido = stand.obtenerCalificacionPromedio();

        // Verificamos si el resultado es correcto
        assertEquals(esperado, obtenido, 0.01, "El promedio de calificaciones debe ser 4.0");
    }
}
