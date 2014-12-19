package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Panier;
import model.Product;

public class PanierController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * POST.
	 * Attend en params un "idProduct".
	 * ajoute le produit au panier de l'utilisateur courant.
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String idProductString = request.getParameter("idProduct");

		int idProduct = Integer.valueOf(idProductString);
		
		HttpSession session = request.getSession();
		Integer idUser = (Integer) session.getAttribute("idUser");
		
		Panier.createPanier(idUser, idProduct);
		LoadController.LoadUser(request, response);
//		response.setStatus(200);
//		PrintWriter out = response.getWriter();
//		out.print("SUCCESS");
//		out.flush();
	}

	/**
	 * GET.
	 * N'attend aucun params.
	 * Retourne tout les produits du panier de l'utilisateur courant.
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		HttpSession session = request.getSession();
		Integer idUser = (Integer) session.getAttribute("idUser");
		
		ArrayList<Product> listProduct = Panier.getProductPanier(idUser);
		LoadController.LoadShop(request, response);
	}

}
