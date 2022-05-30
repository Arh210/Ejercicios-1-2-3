/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;
import java.util.Date;
public class Boleta {
    //atributos de boleta
    private String id;
    private String serie;
    private Date fechaEmision;
    private double montoSoles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getMontoSoles() {
        return montoSoles;
    }

    public void setMontoSoles(double montoSoles) {
        this.montoSoles = montoSoles;
    }

}
