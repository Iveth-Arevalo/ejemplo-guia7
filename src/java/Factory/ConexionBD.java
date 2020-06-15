
package Factory;
/**
 *
 * @author Claudia García
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class ConexionBD {
    protected String[] parametros; //Array que recibe los parametros de la conexión
    protected Connection conexion; 
    
    //El siguiente metodo abstracto no se implementa solamente se declara, se
    //implementará en la subclase
    abstract Connection open();

//--- Crear método para las consultas ----
public ResultSet consultaSQL(String consulta){
    Statement st; //Objeto Statement es el encargado de ejecutar las consultas
    ResultSet rs = null; //tabla temporal donde se almacenan los datos
    try{
        st = conexion.createStatement();
        rs = st.executeQuery(consulta); //Se ejeccuta als consultas
    }catch (SQLException ex) {
        ex.printStackTrace();
    }
        return rs;        
    }

//--- Crear método para ejecutar ----
public boolean ejecutarSQL(String consulta){
    Statement st; //Objeto Statement es el encargado de ejecutar las consultas
    boolean guardar = true;
    try{
        st = conexion.createStatement();
        st.executeUpdate(consulta); //Se ejcuta la consulta
    
    }catch (SQLException ex) {
        guardar = false;
        ex.printStackTrace();
    }
        return guardar;   
    }

//--- Método para cerrar la conexión ----
public boolean cerrarConexion(){
    boolean ok = true;
    try{
        conexion.close();
    }catch (SQLException ex) {
        ok = false;
        ex.printStackTrace();
        }
        return ok;
    }
}

