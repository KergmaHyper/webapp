package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // super.service(arg0, arg1);
        arg1.getWriter().append("Hello from helloservlet.java. Used method: " + arg0.getMethod());
        HttpSession session = arg0.getSession();
        if (session.getValue("name") == null) {
            session.putValue("name", "Begin session");
            arg1.getWriter().append("<p> Seesion are created</p>");
        } else {
            arg1.getWriter().append("<p>" + (String) session.getValue("name") + "</p>");
        }

    };
};
