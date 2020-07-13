package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/*
 *  Jsoup對象功能
 */
public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        //2.1獲取student.xml的path
        String path = JsoupDemo2.class.getClassLoader().getResource("student.xml").getPath();
        //2.2解析xml文檔，加載文檔進內存，獲取dom樹--->Document
//        Document document = Jsoup.parse(new File(path),"utf-8");
//        System.out.println(document);

        //2.parse(String html)：解析html或xml字符串
//        String str = "<students>\n" +
//                "\n" +
//                "    <student number=\"heima_0001\">\n" +
//                "        <name>naluwan</name>\n" +
//                "        <age>30</age>\n" +
//                "        <sex>male</sex>\n" +
//                "    </student>\n" +
//                "\n" +
//                "    <student number=\"heima_0002\">\n" +
//                "        <name>Rita</name>\n" +
//                "        <age>30</age>\n" +
//                "        <sex>female</sex>\n" +
//                "    </student>\n" +
//                "\n" +
//                "</students>";
//        Document document = Jsoup.parse(str);
//        System.out.println(document);

        //3.parse(URL url, int timeoutMillis)：通過網路路徑來獲取指定的html或xml的文檔對象
        URL url = new URL("https://v3.bootcss.com/css/#images");//代表網代表網路中的一個資源路徑
        Document document = Jsoup.parse(url,10000);
        System.out.println(document);
    }
}
