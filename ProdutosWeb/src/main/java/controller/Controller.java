package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Conexaobd;





/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Conexaobd bd = new Conexaobd();
		
		String formulario = request.getParameter("formulario");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println(formulario);
		
		if(formulario.equals("login")) {
			out.println("entrando no login");
			
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			
			String sql = "SELECT login, senha FROM usuarios WHERE login = ? and senha = ?";
			PreparedStatement ps;
			
			try {
				ps = bd.con.prepareStatement(sql);
				ps.setString(1, login);
				ps.setString(2, senha);
				
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					HttpSession session = request.getSession();
					session.setAttribute("nome_usuario", login);
					response.sendRedirect("principal.jsp");
				}else {
					response.sendRedirect("erro_login.jsp");
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(formulario.equals("cadastro")) {
			
			String nome_produto = request.getParameter("nome_produto");
			String qtd_estoque = request.getParameter("quantidade_estoque");
			String valor_produto = request.getParameter("valor_produto");
			
			String sql = "INSERT INTO `produtos`(`nome_produto`, `qtd_estoque`, `valor_produto`) VALUES (?,?,?)";
			PreparedStatement ps;
			
			try {
				ps = bd.con.prepareStatement(sql);
				
				ps.setString(1, nome_produto);
				ps.setString(2, qtd_estoque);
				ps.setString(3, valor_produto);
				
				int teste = ps.executeUpdate();
				
				if(teste > 0){
					response.sendRedirect("cadastro_ok.jsp");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(formulario.equals("excluir")) {
			String nome_produto = request.getParameter("nome_excluir");
			
			String sql = "DELETE FROM produtos WHERE nome_produto = ?";
			PreparedStatement ps;
			
			try {
				ps = bd.con.prepareStatement(sql);
				
				ps.setString(1, nome_produto);
				
				int teste = ps.executeUpdate();
				
				if(teste > 0){
					response.sendRedirect("excluir_ok.jsp");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
