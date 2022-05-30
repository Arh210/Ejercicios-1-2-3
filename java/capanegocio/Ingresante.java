/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

public class Ingresante extends Alumno {
    //datos del alumno ingresante
    private String modalidadIngr;
    private String notaIngreso;
    private String orientacion;

    public String getModalidadIngr() {
        return modalidadIngr;
    }

    public void setModalidadIngr(String modalidadIngr) {
        this.modalidadIngr = modalidadIngr;
    }

    public String getNotaIngreso() {
        return notaIngreso;
    }

    public void setNotaIngreso(String notaIngreso) {
        this.notaIngreso = notaIngreso;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }
}
