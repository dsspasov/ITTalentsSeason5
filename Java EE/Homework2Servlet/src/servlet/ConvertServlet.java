package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConvertServlet
 */
@WebServlet("/ConvertServlet")
public class ConvertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConvertServlet() {
		super();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String from = request.getParameter("fromMetric");
		String to = request.getParameter("toMetric");
		double distance = Double.parseDouble(request.getParameter("distance"));

		double distanceInMeters = 0;
		switch (from) {
		case "meter":
			distanceInMeters = distance;
			break;
		case "centimeter":
			distanceInMeters = distance * 0.01;
			break;
		case "kilometer":
			distanceInMeters = distance * 1000;
			break;
		case "foot":
			distanceInMeters = distance * 0.3048;
			break;
		case "inch":
			distanceInMeters = distance * 0.0254;
			break;
		case "yard":
			distanceInMeters = distance * 0.9144;
			break;
		case "mile":
			distanceInMeters = distance * 1609.344;
			break;
		}
		
		double resultDistance = 0;
		switch(to){
		case "meter":
			resultDistance = distanceInMeters;
			break;
		case "centimeter":
			resultDistance = distanceInMeters / 0.01;
			break;
		case "kilometer":
			resultDistance = distanceInMeters / 1000;
			break;
		case "foot":
			resultDistance = distanceInMeters / 0.3048;
			break;
		case "inch":
			resultDistance = distanceInMeters / 0.0254;
			break;
		case "yard":
			resultDistance = distanceInMeters / 0.9144;
			break;
		case "mile":
			resultDistance = distanceInMeters / 1609.344;
			break;
		}

		
		response.getWriter().append("Distance in ").append(to).append(" is ").append(resultDistance+"!");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

}
