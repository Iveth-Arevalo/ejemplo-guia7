
package Factory;
/**
 *
 * @author Claudia García
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public final class MySQLConexionFactory extends ConexionBD{
    
    public MySQLConexionFactory(String[] criterios){
        this.parametros = criterios; //Pasar los criterios al array d ela clase padre, prámetros
        this.open(); //Llamar al método open
    
    }

    //Implementar el método open
    @Override
    public Connection open() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
            //En this.parametros[] iran los datos respectivos de nombre de la BD, usuario y clave
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.parametros[0], this.parametros[1], this.parametros[2]);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return this.conexion;
      }
}
    

