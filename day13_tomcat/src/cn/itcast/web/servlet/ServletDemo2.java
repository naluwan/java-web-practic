package cn.itcast.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Servlet的方法
 */
public class ServletDemo2 implements Servlet {


    /**
     * 初始化方法
     * 在Servlet被創建時，執行，只會執行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init......");
    }

    /**
     * 獲取ServletConfig對象
     * ServletConfig：Servlet的配置對象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服務方法
     * 每一次Servlet被訪問時，執行，執行多次。
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service......");
    }

    /**
     * 獲取Servlet的信息，本版、作者等等...
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 銷毀方法
     * 在服務器正常關閉時，執行，執行一次
     */
    @Override
    public void destroy() {
        System.out.println("destory.....");
    }


}
