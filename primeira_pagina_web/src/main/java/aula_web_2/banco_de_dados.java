package aula_web_2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**o
 * Servlet implementation class banco_de_dados
 */
@WebServlet("/banco_de_dados")
public class banco_de_dados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public banco_de_dados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("last_name");
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/aula_banco_java";
			String user = "root";
			String password = "";
			
			Connection conexao;
			conexao = DriverManager.getConnection(url, user, password);
			
			
			String nome_altera = request.getParameter("nome_altera");
			
			HttpSession session = request.getSession();
			session.setAttribute("usuario_deletado", nome_altera);			
			
			
			/*
			String sql = "UPDATE usuarios SET nome = ?, sobrenome = ? WHERE nome = ?";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setString(2, sobrenome);
			ps.setString(3, nome_altera);
			*/
			
			
			String sql = "DELETE FROM usuarios WHERE nome = ?";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, nome_altera);
			
			int funcionou = ps.executeUpdate();
			
			if(funcionou > 0) {
				response.sendRedirect("true.jsp");
				
				System.out.println("Deu certo");
			}else {
				response.sendRedirect("false.jsp");
				
				System.out.println("Deu errado");
			}
			
			/*
			String sql = "SELECT nome, sobrenome FROM usuarios";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head> <title> SoulCode - Java Web Servlets </title> </head>");
			out.println("<body>");
			
			while(rs.next()) {
				String nomeb = rs.getString(1);
				String sobrenomeb = rs.getString(2);
				
				out.println("Nome: " + nomeb + " Sobrenome: " + sobrenomeb + " <br>");
				
			}
			
			out.println("</body>");
			out.println("</html>");
			out.flush();
			out.close();
			*/
			
			/*
			String sql = "INSERT INTO usuarios (nome, sobrenome) VALUES (?,?)";
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, nome);
			ps.setString(2, sobrenome);
			
			ps.execute();
			*/
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head> <title> SoulCode - Java Web Servlets </title> </head>");
		out.println("<body>");
		out.println("Cadastrado no banco de dados");
		out.println("<br>Nome: " + nome);
		out.println("<br>Sobrenome: " + sobrenome);
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
