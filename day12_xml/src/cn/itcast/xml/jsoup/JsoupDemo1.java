package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
 *  Jsoup快速入門
 */
public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //2.獲取Document對象，根據xml文檔獲取
        //2.1獲取student.xml的path
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        //2.2解析xml文檔，加載文檔進內存，獲取dom樹--->Document
        Document document = Jsoup.parse(new File(path),"utf-8");
        //3.獲取元素對象 Elenment
        Elements elements = document.getElementsByTag("name");

        System.out.println(elements.size());
        //3.1獲取第一個name的element對象
        Element element = elements.get(0);
        //3.2獲取數據
        String name = element.text();
        System.out.println(name);

    }
}
