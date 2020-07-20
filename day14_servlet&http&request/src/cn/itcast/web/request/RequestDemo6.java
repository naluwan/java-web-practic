package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestDemo6")
public class RequestDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //POST 獲取請求參數

        //根據參數名稱獲取參數值
        String username = request.getParameter("username");
        /*
        System.out.println("POST");
        System.out.println(username);
         */

        //根據參數名稱獲取參數組
        /*
        String[] hobbies = request.getParameterValues("hobby");
        for(String hobby : hobbies){
            System.out.println(hobby);
        }
        */

        //獲取所有請求的參數名稱
        /*
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.println(name);
            String value = request.getParameter(name);
            System.out.println(value);
            System.out.println("--------------------");
        }
        */

        //獲取所有參數的Map集合
        Map<String,String[]> parameterMap = request.getParameterMap();
        //遍歷
        Set<String> keyset = parameterMap.keySet();
        for(String name : keyset){

            //獲取鍵獲取值
            String[] values = parameterMap.get(name);
            System.out.println(name);
            for(String value : values){
                System.out.println(value);
            }
            System.out.println("--------------------");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //GET 獲取請求參數
/*
        //根據參數名稱獲取參數值
        String username = request.getParameter("username");
        System.out.println("GET");
        System.out.println(username);
 */
        this.doPost(request,response);
    }
}
