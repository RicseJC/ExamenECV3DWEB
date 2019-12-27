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
public class Empleado {
    private int  IDempleado;
    private String nombre;
    private String apellido;
    private String empleadoCol;


    public Empleado(int IDempleado, String nombre, String apellido, String empleadoCol) {
        this.IDempleado = IDempleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.empleadoCol = empleadoCol;
    }

    
    
    
    public int getIDempleado() {
        return IDempleado;
    }

    public void setIDempleado(int IDempleado) {
        this.IDempleado = IDempleado;
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

    public String getEmpleadoCol() {
        return empleadoCol;
    }

    public void setEmpleadoCol(String empleadoCol) {
        this.empleadoCol = empleadoCol;
    }
    
}
