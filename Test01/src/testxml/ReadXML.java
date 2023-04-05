/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testxml;

/**
 *
 * @author admin
 */

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ReadXML {
   public static void main(String[] args) {
      try {
         // Tạo một đối tượng DocumentBuilderFactory để tạo một DocumentBuilder
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         DocumentBuilder builder = factory.newDocumentBuilder();

         // Đọc file XML và tạo một đối tượng Document
         Document doc = builder.parse(new File("data.xml"));

         // Lấy danh sách các phần tử trong file XML
         NodeList nodeList = doc.getElementsByTagName("student");

         // Duyệt qua danh sách các phần tử và lấy thông tin của từng phần tử
         for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            String id = element.getAttribute("id");
            String name = element.getElementsByTagName("name").item(0).getTextContent();
            String email = element.getElementsByTagName("email").item(0).getTextContent();

            // In ra thông tin của từng phần tử
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
