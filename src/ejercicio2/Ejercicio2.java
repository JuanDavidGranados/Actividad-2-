/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Juan David
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Crear la feria
        FeriaEmpresarial feria = new FeriaEmpresarial();

        // Agregar empresas
        Empresa empresa1 = new Empresa("TechCorp", "Tecnología", "contacto@techcorp.com");
        Empresa empresa2 = new Empresa("SaludPlus", "Salud", "info@saludplus.com");
        feria.registrarEmpresa(empresa1);
        feria.registrarEmpresa(empresa2);

        // Agregar stands
        Stand stand1 = new Stand(101, "Pabellón A, Stand 10", "Grande");
        Stand stand2 = new Stand(102, "Pabellón B, Stand 5", "Mediano");
        feria.registrarStand(stand1);
        feria.registrarStand(stand2);

        // Agregar visitante y dejar comentario
        Visitante visitante = new Visitante("Carlos Pérez", "123456", "carlos@email.com");
        feria.registrarVisitante(visitante);
        stand1.agregarComentario(visitante.dejarComentario("Muy buen stand!", 5));

        // Generar reportes
        feria.generarReporteEmpresas();
        feria.generarReporteVisitantes();
        feria.generarReporteCalificaciones();
    }
}