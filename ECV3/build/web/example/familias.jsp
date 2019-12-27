<%-- 
    Document   : f amilias
    Created on : 25/12/2019, 06:33:43 PM
    Author     : HardeF
--%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <title>Registro de Familias</title>    
    </head>
    <body> 
    <center>
        <a href="index.jsp"> Registro de  Empleados</a>
        
        <div class="container">
            <h1>Registro de Familias</h1>            
            <s:form action="InsertarR" >
                <div class="form-group">
                    <s:textfield name="IDFamilias" cssClass="form-control"  placeholder="Ingrese su codigo"></s:textfield>
                    <s:textfield name="nombre" cssClass="form-control"  placeholder="Ingrese sus nombres"></s:textfield>
                    <s:textfield name="apellido" cssClass="form-control"  placeholder="Ingrese sus Apellidos"></s:textfield>                    
                    <s:textfield name="estado" cssClass="form-control"  placeholder="Ingrese su estado"></s:textfield>                    
                    <s:textfield name="IDempleado" cssClass="form-control"  placeholder="Ingrese su IDEmpleado"></s:textfield>
                </div>
                <s:submit cssClass="btn btn-info" value="Registrar" label="enviar"/>
            </s:form>
            
 
            
            
        </div>    
    </center>

</body>
</html>