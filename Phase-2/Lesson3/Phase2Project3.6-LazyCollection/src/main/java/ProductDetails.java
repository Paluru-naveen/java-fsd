import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ecommerce.Color;
import com.ecommerce.EProduct;
import com.ecommerce.Finance;
import com.ecommerce.HibernateUtil;

@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();

			List<EProduct> list = session.createQuery("from EProduct").list();

			PrintWriter out = response.getWriter();
			out.println("<html><body>");

			out.println("<b>One to One Mapping</b><br>");
			for (EProduct p : list) {
				out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() + ", Price: "
						+ String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString());
				out.println("<hr>");
			}
			out.println("<b>One to Many and Many to One Mapping</b><br>");
			for (EProduct p : list) {
				out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() + ", Price: "
						+ String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString());
				List<Color> colors = p.getColors();
				out.println("<br>Colors: <ul>");
				for (Color c : colors) {
					out.print("<li>" + c.getName() + "</li>");
				}
				out.println("</ul>");
				out.println("<hr>");

			}
			out.println("<b>Many to Many Mapping</b><br>");
			for (EProduct p : list) {
				out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() + ", Price: "
						+ String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString());

				Map finances = p.getFinance();
				out.println("<br>Finance Options : <ul>");
				if (finances.get("CREDITCARD") != null) {
					Finance f = (Finance) finances.get("CREDITCARD");
					out.println(f.getName() + " &nbsp;");
				}
				if (finances.get("BANK") != null) {
					Finance f = (Finance) finances.get("BANK");
					out.println(f.getName() + " &nbsp;");
				}
				out.println("</ul>");
				out.println("<hr>");
			}

			session.close();

			out.println("</body></html>");

		} catch (Exception ex) {
			throw ex;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
