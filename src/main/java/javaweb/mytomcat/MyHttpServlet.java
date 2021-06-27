package javaweb.mytomcat;

import java.io.IOException;

/**
 * @author: Samuel
 * @date: 2021-06-23 13:46
 * @description: javaweb.mytomcat
 */
public abstract class MyHttpServlet {
    //定义常量
    public static final String METHOD_GET="GET";
    public static final String METHOD_POST="POST";


    public abstract void doGet(MyRequest request,MyResponse response) throws IOException;
    public abstract void doPost(MyRequest request,MyResponse response) throws IOException;

    /**
     * 根据请求方式来判断调用哪种处理方法
     * @param request
     * @param response
     */
    public void service(MyRequest request,MyResponse response) throws IOException {
        if(METHOD_GET.equals(request.getRequestMethod())){
            doGet(request,response);
        }else if(METHOD_POST.equals(request.getRequestMethod())){
            doPost(request,response);
        }
    }
}
