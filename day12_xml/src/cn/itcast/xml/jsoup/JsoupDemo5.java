package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
 *  選擇器查詢
 *
 *  1.selector：選擇器
 *      使用方法：Element  select(String cssQuery)
 *          語法：參考selector類中定義的語法
 */
public class JsoupDemo5 {
    public static void main(String[] args) throws IOException {
        //1.獲取student.xml的path
        String path = JsoupDemo5.class.getClassLoader().getResource("student.xml").getPath();
        //2.獲取Document對象
        Document document = Jsoup.parse(new File(path),"utf-8");

        //3.查詢name標籤
        /*
            div{

            }
         */
        Elements elements = document.select("name");
        System.out.println(elements);

        System.out.println("---------------");

        //4.查詢id值為itcast的元素
        Elements elements1 = document.select("#itcast");
        System.out.println(elements1);

        System.out.println("---------------");

        //5.獲取student標籤並且number屬性值為heima_0001的age子標籤
        //5.1獲取student標籤並且number屬性值為heima_0001
        Elements elements2 = document.select("student[number='heima_0001']");
        System.out.println(elements2);

        System.out.println("---------------");

        //5.2獲取student標籤並且number屬性值為heima_0001的age子標籤
        Elements elements3 = document.select("student[number='heima_0001'] > age");
        System.out.println(elements3);
    }
}
