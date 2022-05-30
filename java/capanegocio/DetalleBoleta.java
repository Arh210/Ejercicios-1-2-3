/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

public class DetalleBoleta {
    //atributos de detalle de boleta
    private String CodigoMatriculado;
    private String datosMatriculado;
    private String detallesMatricula;
    private String tipoPago;

    public String getCodigoMatriculado() {
        return CodigoMatriculado;
    }

    public void setCodigoMatriculado(String CodigoMatriculado) {
        this.CodigoMatriculado = CodigoMatriculado;
    }

    public String getDatosMatriculado() {
        return datosMatriculado;
    }

    public void setDatosMatriculado(String datosMatriculado) {
        this.datosMatriculado = datosMatriculado;
    }

    public String getDetallesMatricula() {
        return detallesMatricula;
    }

    public void setDetallesMatricula(String detallesMatricula) {
        this.detallesMatricula = detallesMatricula;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
}
