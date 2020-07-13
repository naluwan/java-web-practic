package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
 *  Document/Element對象功能
 */
public class JsoupDemo4 {
    public static void main(String[] args) throws IOException {
        //1.獲取student.xml的path
        String path = JsoupDemo4.class.getClassLoader().getResource("student.xml").getPath();
        //2.獲取Document對象
        Document document = Jsoup.parse(new File(path),"utf-8");

        /*
        Element：元素對象
                1.獲取子元素對象
                    (1) getElementsByTag(String tagName)：根據標籤名稱獲取元素對象集合
                    (2) getElementsByAttribute(String key)：根據屬性名稱獲取元素對象集合
                    (3) getElementsByAttributeValue(String key, String valus)：根據對應的屬性名和屬性值獲取元素對象集合
                    (4) getElementById(String id)：根據id屬性值獲取唯一的element對象
                2.獲取屬性值
                    (1) attr(String key)：根據屬性名稱獲取屬性值
                3.獲取文本內容
                    (1) String text()：獲取所有字標籤的純文本內容
                    (2) Strimg heml()：獲取標籤體的所有內容(包括字標籤的標籤和文本內容)
         */

        //通過Document對象獲取name標籤，獲取所有的name標籤，可以獲取兩個
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());

        System.out.println("--------------");

        //通過Element對象獲取子標籤對象
        Element element_student = document.getElementsByTag("student").get(0);
        Elements ele_name = element_student.getElementsByTag("name");
        System.out.println(ele_name.size());

        System.out.println("--------------");

        //獲取student對象的屬性值
        String number = element_student.attr("number");
        System.out.println(number);

        System.out.println("--------------");

        //獲取文本內容
        String text1 = ele_name.text();
        String html = ele_name.html();
        System.out.println(text1);
        System.out.println(html);

    }
}
