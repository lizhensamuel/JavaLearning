package designpatterns.behaviourtype.chain_of_responsibility.servlet.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Samuel
 * @date: 2021-05-19 9:08
 * 无法实现依次处理request然后反顺序处理response
 *
 */
public class Main {
    public static void main(String[] args) {
        Request request=new Request();
        request.str="这是一条测试消息,this is a test message,<script>干坏事</script>";
        Response response=new Response();
        response.str="response";

        FilterChain fc=new FilterChain();
        fc.add(new HTMLFilter()).add(new SensitiveFilter());
        fc.doFilter(request,response);
        System.out.println(request.str);
        System.out.println(response.str);
    }
}

interface Filter{
    boolean doFilter(Request request,Response response);
}

class Request{
    String str;
}

class Response{
    String str;
}

class HTMLFilter implements Filter{
    @Override
    public boolean doFilter(Request request,Response response) {
        request.str=request.str.replaceAll("<","[");
        request.str=request.str.replaceAll(">","]");
        response.str+="---HTMLFilter()";
        return true;
    }
}

class SensitiveFilter implements Filter{

    @Override
    public boolean doFilter(Request request, Response response) {
        request.str=request.str.replaceAll("干坏事","***");
        response.str+="---SensitiveFilter()";
        return true;
    }
}

class FilterChain implements Filter{
    List<Filter> filters=new ArrayList<>();

    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }

    @Override
    public boolean doFilter(Request request, Response response) {
        for(Filter filter:filters){
            filter.doFilter(request,response);
        }
        return true;
    }
}


