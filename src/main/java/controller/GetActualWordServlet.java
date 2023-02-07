package controller;

/**
 * @author Allen Tong - awtong
 * CIS175 - Spring 2023
 * Feb 6, 2023
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.WordScrambler;

/**
 * Servlet implementation class GetActualWordServlet
 */
@WebServlet("/getActualWordServlet")
public class GetActualWordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetActualWordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WordScrambler s = new WordScrambler();
		
		s.setWord((String)request.getParameter("originalWord"));
		s.setScrambledWord((String)request.getParameter("leGuess").toUpperCase());
		
		request.setAttribute("words", s);
		
		getServletContext().getRequestDispatcher("/scrambledwords/result.jsp").forward(request, response);
	}

}
