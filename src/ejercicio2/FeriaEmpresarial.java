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
public class FeriaEmpresarial {
  private List<Empresa> empresas;
    private List<Stand> stands;
    private List<Visitante> visitantes;

    public FeriaEmpresarial() {
        this.empresas = new ArrayList<>();
        this.stands = new ArrayList<>();
        this.visitantes = new ArrayList<>();
    }

    // Métodos de registro
    public void registrarEmpresa(Empresa empresa) { empresas.add(empresa); }
    public void registrarStand(Stand stand) { stands.add(stand); }
    public void registrarVisitante(Visitante visitante) { visitantes.add(visitante); }

    // Métodos de edición y eliminación
    public void editarEmpresa(String nombre, String nuevoSector, String nuevoEmail) {
        for (Empresa e : empresas) {
            if (e.getNombre().equals(nombre)) {
                e.setSector(nuevoSector);
                e.setEmail(nuevoEmail);
                return;
            }
        }
        System.out.println("Empresa no encontrada.");
    }

    public void eliminarEmpresa(String nombre) {
        empresas.removeIf(e -> e.getNombre().equals(nombre));
    }

    public void editarVisitante(String id, String nuevoNombre, String nuevoEmail) {
        for (Visitante v : visitantes) {
            if (v.getId().equals(id)) {
                v.setNombre(nuevoNombre);
                v.setEmail(nuevoEmail);
                return;
            }
        }
        System.out.println("Visitante no encontrado.");
    }

    public void eliminarVisitante(String id) {
        visitantes.removeIf(v -> v.getId().equals(id));
    }

    // Reportes
    public void generarReporteEmpresas() {
        System.out.println("=== REPORTE DE EMPRESAS ===");
        for (Empresa e : empresas) { System.out.println(e); }
    }

    public void generarReporteVisitantes() {
        System.out.println("=== REPORTE DE VISITANTES ===");
        for (Visitante v : visitantes) { System.out.println(v); }
    }

    public void generarReporteCalificaciones() {
        System.out.println("=== REPORTE DE CALIFICACIONES ===");
        for (Stand s : stands) {
            System.out.println(s + " | Calificación Promedio: " + s.obtenerCalificacionPromedio());
        }
    }
}
