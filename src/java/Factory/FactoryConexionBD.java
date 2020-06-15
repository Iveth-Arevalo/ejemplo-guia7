
package Factory;
/**
 *
 * @author Claudia García
 */

public class FactoryConexionBD {
    //Podes definir la categoria para diferentes BD
    public static final int MySQL = 1; //Para conectar a MySQL
    public static String[] configMySQL = {"bd_inventario", "root", ""};
    
    public static ConexionBD open(int tipoBD){
        switch(tipoBD){
            case FactoryConexionBD.MySQL:
                return new MySQLConexionFactory(configMySQL);
            default:
        }
        return null;
        }
    
}
