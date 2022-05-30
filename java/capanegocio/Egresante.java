/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

public class Egresante extends Alumno{
    //atributos del alumno egresante
    private String historialNotas;
    private String creditosAcum;
    private String practicas;

    public String getHistorialNotas() {
        return historialNotas;
    }

    public void setHistorialNotas(String historialNotas) {
        this.historialNotas = historialNotas;
    }

    public String getCreditosAcum() {
        return creditosAcum;
    }

    public void setCreditosAcum(String creditosAcum) {
        this.creditosAcum = creditosAcum;
    }

    public String getPracticas() {
        return practicas;
    }

    public void setPracticas(String practicas) {
        this.practicas = practicas;
    }

}
