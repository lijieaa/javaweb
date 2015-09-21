package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by Administrator on 2015/9/21.
 */
public class ServletDemo5 extends HttpServlet {
    //private ServletConfig config;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String data1 = this.config.getInitParameter("data1");
        //System.out.println(data1);


        Enumeration<String> initParameterNames = this.getServletConfig().getInitParameterNames();

       while (initParameterNames.hasMoreElements()){
           String name = initParameterNames.nextElement();
           String initParameter = this.getServletConfig().getInitParameter(name);
           System.out.println(initParameter);
       }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    /*@Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }*/
}
