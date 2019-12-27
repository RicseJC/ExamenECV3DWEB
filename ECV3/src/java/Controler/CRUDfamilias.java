package Controler;
import Modelo.Familias;
import Modelo.FamiliasModelo;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;

public class CRUDfamilias extends ActionSupport {

   private int IDFamilias;
   private String nombre;
   private String apellido;
   private String estado;
   private int IDempleado;

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

    public Familias getEmp() {
        return emp;
    }

    public void setEmp(Familias emp) {
        this.emp = emp;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }

    Familias emp = new Familias(IDFamilias ,  nombre , apellido , estado,IDempleado);

    @Override
    public String execute() {
        FamiliasModelo FamiliasModelo = new FamiliasModelo();
        FamiliasModelo.registrar(getIDFamilias(),getNombre(),getApellido(),getEstado(),getIDempleado());
        return SUCCESS;
    }

    
    
    
}
