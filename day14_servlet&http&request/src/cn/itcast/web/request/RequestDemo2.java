package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示獲取請求頭數據

        //1.獲取所有請求頭名稱
        Enumeration<String> headeNames = request.getHeaderNames();
        //2.遍歷
        while(headeNames.hasMoreElements()){
            String name = headeNames.nextElement();
            //3.根據名稱來獲取請求頭的值
            String value = request.getHeader(name);
            System.out.println(name+" --- "+value);
;        }
    }
}
