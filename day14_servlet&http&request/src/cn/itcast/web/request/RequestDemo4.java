package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo4")
public class RequestDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示獲取請求頭數據：referer

        String referer = request.getHeader("referer");
        System.out.println(referer);//http://localhost/day14/login.html

        //防盜練
        if(referer != null){
            if(referer.contains("/day14")){
                //正常訪問
                //System.out.println("播放電影");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("播放電影");
            }else{
                //盜鏈
                //System.out.println("想看電影嗎?來我首頁...");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("想看電影嗎?來我首頁...");
            }
        }



;
    }
}
