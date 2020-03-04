package reflectxmlservlet;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.*;

/*
 *  运用反射技术模拟selvlet执行
 *  具体功能：根据提交表格数据（用String模拟路径）不同，查找xml配置文件，servlet返回不同的结果
 */
public class ReflectXmlServlet {
    private HashMap<String,String> data = new HashMap<String,String>();

    //解析xml文档装载信息
    @Test
    public void initXml(){

        try {
            //加载解析器
            SAXReader saxReader = new SAXReader();
            //获得文档
            Document doc = saxReader.read("xml/src/schema/web.xml");
            //获得根节点
            Element rootElement = doc.getRootElement();
            //遍历子节点存入List集合中
            List<Element> listElement = rootElement.elements();

            //装载servlet、servlet-mapping
            for (Element sElement : listElement) {
                if ("servlet".equals(sElement.getName())){
                    String servletName = sElement.element("servlet-name").getText();//获得servlet名称：Servlet1
                    String servletClass = sElement.elementText("servlet-class");
                    //System.out.println(servletClass);
                    data.put(servletName,servletClass);
                }
                if ("servlet-mapping".equals(sElement.getName())){
                    String servletName = sElement.element("servlet-name").getText();
                    String urlPattern = sElement.elementText("url-pattern");
                    //System.out.println(servletClass);
                    String servletClass = data.get(servletName);
                    data.remove(servletName);//移除无用K，V
                    data.put(urlPattern,servletClass);//增加键值对，<路径，类>
                }
            }
//            //遍历map对象,entrySet()
//            Set<Map.Entry<String, String>> entryList = data.entrySet();
//            Iterator<Map.Entry<String,String>> iteratorEntry = entryList.iterator();
//            while (iteratorEntry.hasNext()){
//                Map.Entry<String,String> entry = iteratorEntry.next();
//                System.out.println(entry.getKey()+entry.getClass());
//            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    //对用户数据进行应答
    public void request(String userpath){
        try {
            String clazzName = data.get(userpath);
            Class clazz = Class.forName(clazzName);//获得类对象
            Myserlvlet servlet = (Myserlvlet) clazz.newInstance();//创建类实例

//            Method[] methods = clazz.getDeclaredMethods();//获得方法
//            for (Method method : methods) {
//                method.invoke(servlet);
//            }
            servlet.init();
            servlet.execute();
            servlet.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ReflectXmlServlet reflectXmlServlet = new ReflectXmlServlet();
        reflectXmlServlet.initXml();
        reflectXmlServlet.request("/Servlet2");
    }
}
