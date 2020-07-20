package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示Request對象獲取請求行數據
 */
@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            (1)獲取請求方式：GET
                    * String getMethod()
            (2)(*)獲取虛擬目錄：/day14
                    * String getContextPath()
            (3)獲取Servlet路徑：/requestDemo1
                    * String getServletPath()
            (4)獲取gat方式請求參數：name=naluwan
                    * String getQueryString()
            (5)(*)獲取請求URI：/day14/requestDemo1
                    * String getRequestURI() /day14/requestDemo1
                    * String getRequestURL() :http://localhost/day14/requestDemo1
            (6)獲取協議與版本：HTTP/1.1
                    * String getProtocol()
            (7)獲取客戶機的IP地址：
                    * String gqtRemoteAddr()
         */

        //1.獲取情球方式，GET
        String method = request.getMethod();
        System.out.println(method);
        //2.(*)獲取虛擬目錄：/day14
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        //3.獲取Servlet路徑：/requestDemo1
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
        //4.獲取gat方式請求參數：name=naluwan
        String queryString = request.getQueryString();
        System.out.println(queryString);
        //5.(*)獲取請求URI：/day14/requestDemo1
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);
        //6.獲取協議與版本：HTTP/1.1
        String protocol = request.getProtocol();
        System.out.println(protocol);
        //7.獲取客戶機的IP地址：
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
