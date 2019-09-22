package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Dealer;
import beans.Gamer;
import beans.Player;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Main() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getParameter("UTF-8");
		String playerName = request.getParameter("playerName");
		String dealerName = request.getParameter("dealerName");

		Gamer player = new Player(playerName);
		Gamer dealer = new Dealer(dealerName);

		HttpSession session = request.getSession();
		session.setAttribute("player", player);
		session.setAttribute("dealer", dealer);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/takeTwoCards.jsp");
		dispatcher.forward(request, response);

	}

}
