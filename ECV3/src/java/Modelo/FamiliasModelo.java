package Modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HardeF
 */
public class FamiliasModelo extends Database {

    public void registrar(int IDfamilias, String nombre, String apellido,String estado , int IDempleado) {
        try {
            this.conectar();
            if (this.getCon()!= null) {
                String sql = "insert into familias (IDfamilias, nombre, apellido, estado,IDempleado ) "
                        + "values(?,?,?,?,?)";
                System.out.println(sql);
                PreparedStatement preparedStmt = this.getCon()
                        .prepareStatement(sql);
                //para los campos
                preparedStmt.setInt(1, IDfamilias);
                preparedStmt.setString(2,nombre);
                preparedStmt.setString(3, apellido);
                preparedStmt.setString(4, estado);
                preparedStmt.setInt(5,IDempleado);
                int affects = preparedStmt.executeUpdate();
                System.out.println(preparedStmt);
                this.Desconectar();      
            }
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error 2:============================================ " + ex.getMessage());
        }
    }
    
     public void actualizar(int IDfamilias, String nombre, String apellido, String estado,int IDempleado) throws SQLException {
        try {
            this.conectar();
            String sql = "UPDATE familias SET nombre=?,apellido=?,estado=?, IDempleado=? WHERE IDfamilias=?";
            if (this.getCon() != null) {
                PreparedStatement statement = this.getCon().prepareStatement(sql);
                statement.setInt(1, IDfamilias);
                statement.setString(2, nombre);
                statement.setString(3, apellido);
                statement.setString(4, estado);
                statement.setInt(4, IDempleado);
                boolean affects = statement.executeUpdate() > 0;
                System.out.println(statement);
                statement.close();
                this.Desconectar();
            }

        } catch (SQLException ex) {

            System.out.println("Ha ocurrido un error 2:============================================ " + ex.getMessage());
        }
    }
    
    
    

}
