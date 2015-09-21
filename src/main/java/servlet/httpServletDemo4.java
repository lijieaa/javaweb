package servlet;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2015/9/20.
 */
public class httpServletDemo4 extends HttpServlet implements SingleThreadModel{

    private int i= 0;

    //子类在覆盖父类的方法，不能抛出比父类更多的异常
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //同步代码块，这种方法不好
        /*synchronized (this){
            i++;
            try {
                Thread.sleep(1000*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resp.getOutputStream().write((i+"").getBytes());
        }*/


        i++;
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resp.getOutputStream().write((i+"").getBytes());

    }
}
