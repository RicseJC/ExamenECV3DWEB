package Controler;

import Modelo.Empleado;
import Modelo.EmpleadoModel;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import java.sql.SQLException;

public class CrudEmpleado extends ActionSupport {

    private int IDempleado;
    private String nombre;
    private String apellido;
    private String empleadoCol;

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

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }

    
    Empleado emp = new Empleado(IDempleado ,  nombre , apellido , empleadoCol);

    @Override
    public String execute() {
        EmpleadoModel EmpleadoModel = new EmpleadoModel();
        EmpleadoModel.registrar(getIDempleado(),getNombre(),getApellido(),getEmpleadoCol());
        return SUCCESS;
    }
    
    public String Actualizar() throws SQLException {
        EmpleadoModel EmpleadoModel = new EmpleadoModel();
        EmpleadoModel.actualizar(getIDempleado(),getNombre(),getApellido(),getEmpleadoCol());
        return SUCCESS;
    }
}