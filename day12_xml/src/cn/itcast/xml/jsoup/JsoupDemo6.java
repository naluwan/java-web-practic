package cn.itcast.xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

/*
 *  XPath查詢
 */
public class JsoupDemo6 {
    public static void main(String[] args) throws IOException , XpathSyntaxErrorException {
        //1.獲取student.xml的path
        String path = JsoupDemo6.class.getClassLoader().getResource("student.xml").getPath();
        //2.獲取Document對象
        Document document = Jsoup.parse(new File(path),"utf-8");

        //3.根據document，創建JXDocument對象
        JXDocument jxDocument = new JXDocument(document);

        //4.結合XPath語法查詢
        //4.1查詢所有student標籤
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes){
            System.out.println(jxNode);
        }

        System.out.println("---------------");

        //4.2查詢所有student標籤下的name標籤
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name");
        for (JXNode jxNode : jxNodes2){
            System.out.println(jxNode);
        }

        System.out.println("---------------");

        //4.3查詢student標籤下帶有id屬性的name標籤
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : jxNodes3){
            System.out.println(jxNode);
        }

        System.out.println("---------------");

        //4.44.3查詢student標籤下帶有id屬性的name標籤，並且id屬性值為itcast
        List<JXNode> jxNodes4 = jxDocument.selN("//student/name[@id='itcast']");
        for (JXNode jxNode : jxNodes4){
            System.out.println(jxNode);
        }
    }
}
