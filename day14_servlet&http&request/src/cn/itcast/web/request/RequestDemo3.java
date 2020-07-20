package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestDemo3")
public class RequestDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示獲取請求頭數據：user-agent

        String agent = request.getHeader("user-agent");
        //判斷agent的瀏覽器版本
        if(agent.contains("Chrome")){
            //google
            System.out.println("google來了...");
        }else if(agent.contains("Firefox")){
            //火狐
            System.out.println("Firefox來了...");
        }else if(agent.contains("Windows")){
            //IE
            System.out.println("IE來了....");
        }


;
    }
}
