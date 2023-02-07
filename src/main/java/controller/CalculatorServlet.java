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

import model.Calculator;
import model.NaN;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/calculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Calculator calc = new Calculator();
		String op = request.getParameter("opType");
		
		NaN n = new NaN();
		
		double first;
		double second;
		
		try {
			
			switch (op) {
			
			case "addition":
				first = Double.parseDouble(request.getParameter("addFirst"));
				second = Double.parseDouble(request.getParameter("addSecond"));
				calc.add(first, second);
				request.setAttribute("result", calc);
				break;
				
			case "subtraction":
				first = Double.parseDouble(request.getParameter("subtractFirst"));
				second = Double.parseDouble(request.getParameter("subtractSecond"));
				calc.subtract(first, second);
				request.setAttribute("result", calc);
				break;
				
			case "multiplication":
				first = Double.parseDouble(request.getParameter("multiplyFirst"));
				second = Double.parseDouble(request.getParameter("multiplySecond"));
				calc.multiply(first, second);
				request.setAttribute("result", calc);
				break;
				
			case "division":
				first = Double.parseDouble(request.getParameter("divideFirst"));
				second = Double.parseDouble(request.getParameter("divideSecond"));
				calc.divide(first, second);
				request.setAttribute("result", calc);
				break;
			
				default:
					request.setAttribute("result", n);
			}
		} catch (NullPointerException e) {
			request.setAttribute("result", n);
		} catch (NumberFormatException e) {
			request.setAttribute("result", n);
		}
		
		getServletContext().getRequestDispatcher("/calculator/result.jsp").forward(request, response);
	}

}
