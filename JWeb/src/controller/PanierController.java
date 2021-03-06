package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Panier;

public class PanierController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String idProductString = request.getParameter("idProduct");

		int idProduct = Integer.valueOf(idProductString);
		
		HttpSession session = request.getSession();
		Integer idUser = (Integer) session.getAttribute("idUser");
		
		Panier.createPanier(idUser, idProduct);
		LoadController.LoadUser(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		LoadController.LoadShop(request, response);
	}

}
