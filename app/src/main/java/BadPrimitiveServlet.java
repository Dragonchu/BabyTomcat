import babytomcat.Request;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class BadPrimitiveServlet implements Servlet {

    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        if (request instanceof Request){
            out.println("Downcast successfully");
            Request request1 = (Request) request;
            request1.parse();
        }else {
            out.println("Downcast fail");
        }
    }

    public void destroy() {
        System.out.println("destroy");
    }

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return null;
    }

}
