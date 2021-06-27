package javaweb.mytomcat;

import java.util.HashMap;

/**
 * @author: Samuel
 * @date: 2021-06-23 13:42
 * @description: javaweb.mytomcat
 */
public class MyMapping {
    public static HashMap<String,String> mapping=new HashMap<>();

    static{
        mapping.put("/mytomcat","javaweb.mytomcat.MyServlet");
    }

    public HashMap<String,String> getMapping(){
        return mapping;
    }
}
