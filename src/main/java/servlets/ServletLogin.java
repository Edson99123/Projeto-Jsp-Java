package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletLogin")/*Mapeamento URL*/
public class ServletLogin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
    public ServletLogin() {
       
    }
    /*Recebe os dados por url paramenters */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	/*Recebe os dados enviados por forms */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(request.getParameter("nome"));
		System.out.println(request.getParameter("idade"));
	}

}
