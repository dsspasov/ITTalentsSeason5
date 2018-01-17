package servletTask3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Step3
 */
@WebServlet("/Step3")
public class Step3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Step3() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.isNew()){
			response.sendRedirect("step3.html");
		}else{
			String text = "";
			
			text += "first name:" + session.getAttribute("fName") + "\n";
			text += "last name:" + session.getAttribute("lName") + "\n";
			text += "age:" + session.getAttribute("age") + "\n";
			
			text += "county:" + session.getAttribute("country") + "\n";
			text += "town:" + session.getAttribute("town") + "\n";
			text += "street:" + session.getAttribute("street") + "\n";
			
			String university = request.getParameter("university");
			String faculty = request.getParameter("faculty");
			String specialty = request.getParameter("specialty");

			text += "university: " + university + "\n";
			text += "faculty: " + faculty + "\n";
			text += "specialty: " + specialty + "\n";
			response.getWriter().append(text);
		}
	}

}
