package infnet.model.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import infnet.model.domain.Usuario;

public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Usuario> lista;

	public UsuarioController() {
		lista = new ArrayList<Usuario>();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("home.html").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Usuario usuario = new Usuario(request.getParameter("nome"), request.getParameter("email"),
				request.getParameter("senha"));
		System.out.println(usuario);

		lista.add(usuario);
		
		PrintWriter out = response.getWriter();
		out.println(usuario);
		out.println("<a href= 'usuario'>Voltar</a>");
		for (Usuario u : lista) {
			out.println("<h5>" + u.getNome() + " - " + u.getEmail() + "</h5>");

		}

	}
}
