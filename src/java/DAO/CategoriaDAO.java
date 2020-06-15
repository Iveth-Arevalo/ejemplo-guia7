
package DAO;
/**
 *
 * @author Claudia García
 */

import Model.Categoria;
import java.util.List;

public interface CategoriaDAO {
    //Definir los metodos como la clase en interfaces los métodos no se implementan
    //aqui los métodos son de tipo abstractos
    public List<Categoria> Listar();
    public List<Categoria> Listar2();
    public Categoria editarCat(int id_cat_edit);
    public boolean guardarCat(Categoria categoria);
    public boolean borrarCat(int id_cat_borrar);
    
}
