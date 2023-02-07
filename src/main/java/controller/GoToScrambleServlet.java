package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.WordScrambler;

/**
 * @author Allen Tong - awtong
 * CIS175 - Spring 2023
 * Feb 6, 2023
 */

/**
 * Servlet implementation class GoToScrambleServlet
 */
@WebServlet("/goToScrambleServlet")
public class GoToScrambleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoToScrambleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		WordScrambler scrambler = new WordScrambler();
		
		request.setAttribute("scrambler", scrambler);
		
		getServletContext().getRequestDispatcher("/scrambledwords/scrambledwords.jsp").forward(request, response);
	}

}
