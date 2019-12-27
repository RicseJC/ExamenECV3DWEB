package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {
    private String user;
    private String pass;
    private String url;
    private Connection con;
    
    public Database() {
        this.user = "root";
        this.pass = "";
        this.url = "jdbc:mysql://localhost:3306/examenecv3?";
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    
    
    public String getUser() {
        return user;
    }
    
    public void setUser(String user) {
        this.user = user;
    } 
    
    public String getPass() {
        return pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con=DriverManager.getConnection(this.getUrl(),this.getUser(),this.getPass());
            System.out.println("Conexion Succefully :v ");
            
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println("Error en la conexion -_- debido a: " +e.getCause());
            
        }    
    }
    
    public  void Desconectar() {
        
    }
    
}