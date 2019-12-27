<%-- 
    Document   : Index
    Created on : 24/12/2019, 05:57:34 PM
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
        <title>Registro Empleado</title>    
    </head>
    <body> 
    <center>

        <div class="container">
            <h1>Registro de empleados</h1>

            <%--          <s:form action="Insertar" >
                <div class="form-group">
                    <s:textfield name="IDempleado" cssClass="form-control"  placeholder="Ingrese su codigo"></s:textfield>
                    <s:textfield name="nombre" cssClass="form-control"  placeholder="Ingrese sus nombres"></s:textfield>
                    <s:textfield name="apellido" cssClass="form-control"  placeholder="Ingrese sus Apellidos"></s:textfield>                    
                    <s:textfield name="empleadoCol" cssClass="form-control"  placeholder="Ingrese su empleadoCol"></s:textfield>                    
                    </div>
                <s:submit cssClass="btn btn-info" value="Registrar" label="enviar"/>
            </s:form> 
            --%>    
                
            <hr>

            <h1>Actualizar empleados</h1>
            <s:form action="Insertar" >
                <div class="form-group">
                    <s:textfield name="IDempleado" cssClass="form-control"  placeholder="Ingrese su codigo"></s:textfield>
                    <s:textfield name="nombre" cssClass="form-control"  placeholder="Ingrese sus nombres"></s:textfield>
                    <s:textfield name="apellido" cssClass="form-control"  placeholder="Ingrese sus Apellidos"></s:textfield>                    
                    <s:textfield name="empleadoCol" cssClass="form-control"  placeholder="Ingrese su empleadoCol"></s:textfield>                    
                    </div>
                <s:submit cssClass="btn btn-info" value="Actualizar" label="enviar"/>
            </s:form>     
        </div>




    </center>

    <a href="familias.jsp"> Registro de  familias</a>


</body>
</html>