package primeira_pagina_web_aula1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Recebe_requisicao_get
 */
@WebServlet("/Recebe_requisicao_get")
public class Recebe_requisicao_get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Recebe_requisicao_get() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("last_name");
		
		System.out.println(nome + " " + sobrenome);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head> <title> SoulCode - Java Web Servlets </title> </head>");
		out.println("<body>");
		out.println("Nome: " + nome);
		out.println("Sobrenome: " + sobrenome);
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}

}
