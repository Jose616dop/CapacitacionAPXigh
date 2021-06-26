package com.bbva.gcre.dto.datacliente;

public class ClienteDTO {
    private String id;
    private double impPrestamo;
    private long numCoutas;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getImpPrestamo() {
        return impPrestamo;
    }
    public void setImpPrestamo(double impPrestamo) {
        this.impPrestamo = impPrestamo;
    }
    
    public long getNumCoutas() {
        return numCoutas;
    }
    public void setNumCoutas(long numCoutas) {
        this.numCoutas = numCoutas;
    }
    @Override
    public String toString() {
        return "ClienteDTO [id=" + id + ", impPrestamo=" + impPrestamo + ", numCoutas=" + numCoutas + "]";
    }
    

    
}
