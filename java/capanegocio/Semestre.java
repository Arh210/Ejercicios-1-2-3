/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;
import java.util.Date;
public class Semestre {
    //atributos de Semestre
    private String numero;
    private Date fechaIncio;
    private Date fechaFin;
    private String mensualidad;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(Date fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getMensualidad() {
        return mensualidad;
    }

    //atributos semestre
    public void setMensualidad(String mensualidad) {
        this.mensualidad = mensualidad;
    }

}
