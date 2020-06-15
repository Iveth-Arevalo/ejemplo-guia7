<%-- 
    Document   : crearCategoria
    Created on : 06-14-2020, 05:30:21 AM
    Author     : Claudia Garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Para importar los datos de la clase Categoria -->
<jsp:useBean id="categoria" scope="session" class="Model.Categoria" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de Inventario</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        <script type="text/javascript">
            function regresar(url){ 
                location.href = url;
            }
        </script>    
    </head>
    <body>
        <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
         
    <h3>Mantenimiento Categorias</h3>
    <form class="form-horizontal" id="frmCategoria" name="frmCategoria" action="<%= request.getContextPath() %>/categorias" method="post">
        <input type="hidden" name="id_categoria" values="<%= categoria.getId_categoria() %>">
        <div class="form-group">
            <label for="txtNomCategoria" class="col-sm-2 control-label">Nombre:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="txtNomCategoria" values="<%= categoria.getNom_categoria() %>">
            </div>
        </div>
           <div class="form-group">
            <label for="txtEstadoCategoria" class="col-sm-2 control-label">Estado:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="txtEstadoCategoria" values="<%= categoria.getEstado_categoria() %>">
            </div>
        </div>
           <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" class="btn btn-success btn-sm" name="btnGuardar" values="Guardar"/>
                <input type="button" class="btn btn-danger btn-sm" onclick="regresar('<%= request.getContextPath() %>/categoria?opcion=listar')"
                       name="btnRegresar" values="Regresar">
            </div>
        </div>   
    </form>
          <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
