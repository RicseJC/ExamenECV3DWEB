/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author HardeF
 */
public class Familias {
   private int IDFamilias;
   private String nombre;
   private String apellido;
   private String estado;
   private int IDempleado;

    public Familias(int IDFamilias, String nombre, String apellido, String estado, int IDempleado) {
        this.IDFamilias = IDFamilias;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.IDempleado = IDempleado;
    }

    public int getIDFamilias() {
        return IDFamilias;
    }

    public void setIDFamilias(int IDFamilias) {
        this.IDFamilias = IDFamilias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIDempleado() {
        return IDempleado;
    }

    public void setIDempleado(int IDempleado) {
        this.IDempleado = IDempleado;
    }
    
   
}
