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
    <div id="registrar">
        <form id="login" action="Marcadores/inicio" method="post" >
            <p><label for="correo">Correo:</label></p>
                <input name="correo" type="text" id="correo" class="nombre" placeholder="Pon tu correo" autofocus=""/ ></p>
            <p><label for="contrasenia">Contraseña:</label></p>
                <input name="contrasenia" type="text" id="contrasenia" class="nombre" placeholder="Pon tu contraseña" autofocus=""/ ></p>
            <p id="bot"><input name="submit" type="submit" id="boton" value="Login" class="boton"/></p>
        </form>
    </div>
        
    <div id="envoltura">
        <div id="contenedor">
 
            <div id="cabecera">
                <p><label for="nombre">Registro</label></p>
            </div>
 
            <div id="cuerpo">
 
                <form id="form-login" action="#" method="post" >
                    <p><label for="nombre">Nickname:</label></p>
                        <input name="nickname" type="text" id="nickname" class="nombre" placeholder="Pon tu nombre" autofocus=""/ ></p>                   
 
                    <p><label for="correo">Correo:</label></p>
                        <input name="correo" type="text" id="correo" class="correo" placeholder="Pon tu mail" /></p>
 
                    <p><label for="pass">Password:</label></p>
                        <input name="pass" type="password" id="pass" class="pass" placeholder="Pon tu contraseña"/ ></p>
 
                    <p><label for="repass">Repetir Password:</label></p>
                        <input name="repass" type="password" id="repass" class="repass" placeholder="Repite contraseña" /></p>
 
                    <p id="bot"><input name="submit" type="submit" id="boton" value="Registrar" class="boton"/></p>
                </form>
            </div>
 
            <div id="pie">Sistema de Login Y Registro</div>
        </div><!-- fin contenedor -->
 
    </div>
 
</body>
</html>
