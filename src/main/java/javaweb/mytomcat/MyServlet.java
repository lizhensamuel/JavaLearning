package javaweb.mytomcat;

import java.io.IOException;

/**
 * @author: Samuel
 * @date: 2021-06-23 13:54
 * @description: javaweb.mytomcat
 */
public class MyServlet extends MyHttpServlet{
    @Override
    public void doGet(MyRequest request, MyResponse response) throws IOException {
        response.write("mytomcat 敲里吗2333");
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) throws IOException {
        response.write("post tomcat");
    }
}
