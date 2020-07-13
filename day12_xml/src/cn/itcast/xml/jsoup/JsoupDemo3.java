package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/*
 *  Document/Element對象功能
 */
public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        //1.獲取student.xml的path
        String path = JsoupDemo3.class.getClassLoader().getResource("student.xml").getPath();
        //2.獲取Document對象
        Document document = Jsoup.parse(new File(path),"utf-8");

        //3.獲取元素對象
        //3.1獲取所有student對象
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);

        System.out.println("-----------");

        //3.2獲取屬性名為id的元素對象們
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);

        System.out.println("-----------");

        //3.2獲取number屬性值為heima_0001的元素對象
        Elements elements2 = document.getElementsByAttributeValue("number","heima_0001");
        System.out.println(elements2);

        System.out.println("-----------");

        //3.3獲取id屬性值元素對象
        Element itcast = document.getElementById("itcast");
        System.out.println(itcast);
    }
}
