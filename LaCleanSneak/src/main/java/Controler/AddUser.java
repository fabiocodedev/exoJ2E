package Controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import Dao.UserDao;
import Model.User;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/addUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("View/addUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
//		UserDao ud = new UserDao();
		User user = new User(request.getParameter("nom"),request.getParameter("prenom"),request.getParameter("adresse"),
				request.getParameter("telephone"),request.getParameter("email"),request.getParameter("mdp"));
		
		System.out.println(user);
		
//		ud.create(user);
//		
//		if (ud.create(user)==true) {
//			request.getRequestDispatcher("View/home.jsp").forward(request, response);
//			System.out.println("Super !!!!");
//		}else {
//			
//			doGet(request, response);
//			System.out.println("Penible...");
//		}
		
	
	}

}