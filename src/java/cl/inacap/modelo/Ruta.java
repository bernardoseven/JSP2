/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.modelo;

/**
 *
 * @author Nicolas
 */
public class Ruta {
    
    private long rutChofer;
    private String patenteVehiculo;
    private int idSolicitud;

    public long getRutChofer() {
        return rutChofer;
    }

    public void setRutChofer(long rutChofer) {
        this.rutChofer = rutChofer;
    }

    public String getPatenteVehiculo() {
        return patenteVehiculo;
    }

    public void setPatenteVehiculo(String patenteVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }
    
    
    
}
