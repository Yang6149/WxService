package Servlet;
import com.ming.dao.BooksDao;
import com.ming.dao.BooksDaoProxy;
import com.ming.vo.Books;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/a")
public class a extends HttpServlet {

    private String message;

    public void init() throws ServletException
    {
        // 执行必需的初始化
        message = "Hello World";
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        // 设置响应内容类型
        response.setContentType("application/json; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        // 实际的逻辑是在这里

        PrintWriter out = response.getWriter();
        BooksDao bookDao = null;
        try {
            bookDao = new BooksDaoProxy();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Books b = new Books.Builder().build();
        //System.out.println(b);
        //bookDao.doCreate(b);
        try {
            b=bookDao.findByid(123);
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println(b);
        String str ="{\"name\":\"yangshen\",\"age\":\"20\",5:9}";
        out.println(str);
        out.flush();
        out.close();
    }

    public void destroy()
    {
        // 什么也不做
    }
}
