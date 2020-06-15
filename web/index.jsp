<%-- 
    Document   : index
    Created on : 06-14-2020, 02:50:15 AM
    Author     : Claudia Garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de inventario</title>
        <!-- Incluimos la vista parcial la cual contiene las url de las las librerias
        correspondientes a estilos y js -->
        <%@include file = "WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body>
        <%@include file = "WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        <h3>Bienvenid@</h3> <!-- Todo en contenido con la aplicaacion -->
        
        <!-- Vista parcial de la parte inferior de nuestra aplicacion -->
        <%@include file = "WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
