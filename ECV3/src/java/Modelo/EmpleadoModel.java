/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HardeF
 */
public class EmpleadoModel extends Database {

    public void registrar(int IDempleado, String nombre, String apellido, String empleadoCol) {
        try {
            this.conectar();
            if (this.getCon() != null) {
                String sql = "insert into empleado (IDempleado, nombre, apellido, empleadoCol) "
                        + "values(?,?,?,?)";
                System.out.println(sql);
                PreparedStatement preparedStmt = this.getCon()
                        .prepareStatement(sql);
                //para los campos
                preparedStmt.setInt(1, IDempleado);
                preparedStmt.setString(2, nombre);
                preparedStmt.setString(3, apellido);
                preparedStmt.setString(4, empleadoCol);
                int affects = preparedStmt.executeUpdate();
                System.out.println(preparedStmt);
                this.Desconectar();
            }
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error 1:============================================ " + ex.getMessage());
        }
    }

    public void actualizar(int IDempleado, String nombre, String apellido, String empleadoCol) throws SQLException {
        try {
            this.conectar();
            String sql = "UPDATE empleado SET nombre=?,apellido=?,empleadoCol=? WHERE IDempleado=?";
            if (this.getCon() != null) {
                PreparedStatement statement = this.getCon().prepareStatement(sql);
                statement.setInt(1, IDempleado);
                statement.setString(2, nombre);
                statement.setString(3, apellido);
                statement.setString(4, empleadoCol);
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
