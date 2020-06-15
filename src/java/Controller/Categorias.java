
package Controller;


import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import Model.Categoria;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Categorias extends HttpServlet {

    protected void listaCategorias(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //Crear instancia a Categoria
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        //Crear instancia de sesion; se le da true para crear la sesion
        HttpSession sesion = request.getSession(true);
        sesion.setAttribute("lista", categoria.Listar()); //lista es el nombre de la sesion
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/listarCategorias.jsp");
        dispatcher.forward(request, response);
       
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String parametro = request.getParameter("opcion"); //Capturar el párametros que se esta enviando
        if(parametro.equals("crear")){ //Evaluar si el parametro es crear o listar o cualquier otro
            String pagina = "/Vista-Categorias/crearCategoria.jsp"; //Vista o formulario para registrar nueva categorias
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("pagina");
            dispatcher.forward(request, response);  
        }else{
            this.listaCategorias(request, response);
    }
            
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
        Categoria categoria = new Categoria();
        //Se efectua rl casting o conversión de datos porque lo ingresado en el formulario es texto
        categoria.setId_categoria(Integer.parseInt(request.getParameter("id_categoria")));
        categoria.setNom_categoria(request.getParameter("txtNomCategoria"));
        categoria.setEstado_categoria(Integer.parseInt(request.getParameter("txtEstadoCategoria")));
        
        CategoriaDAO guardaCategoria = new CategoriaDAOImplementar();
        guardaCategoria.guardarCat(categoria);
        this.listaCategorias(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
