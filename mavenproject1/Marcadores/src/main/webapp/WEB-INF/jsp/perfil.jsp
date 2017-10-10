<%-- 
    Document   : perfil
    Created on : 2/10/2017, 03:03:54 PM
    Author     : david
--%>

<%-- 
    Document   : newInicio
    Created on : 2/10/2017, 03:11:22 PM
    Author     : david
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" type="text/css" href="<c:url value="/css/newIniciocss.css"/> ">
        <title>Home</title>
    </head>
    <body>           
    <div id="envoltura">
        <div id="contenedor">
 
            <div id="cabecera">
                <p><label for="nombre">Perfil</label></p>
            </div>
 
            <div id="cuerpo">
 
                <form id="perfil" action="#" method="post" >                     
                    <p id="bot"><input name="submit" type="submit" id="boton" value="Agregar marcador" class="boton"/></p>
                    <p id="bot"><input name="submit" type="submit" id="boton" value="Ver marcadores" class="boton"/></p>
                    <p id="bot"><input name="submit" type="submit" id="boton" value="Editar perfil" class="boton"/></p>
                    <p id="bot"><input name="submit" type="submit" id="boton" value="Salir" class="boton"/></p>
                </form>
            </div>
 
            <div id="pie">Perfil de usuario</div>
        </div><!-- fin contenedor -->
 
    </div>
 
</body>
</html>
