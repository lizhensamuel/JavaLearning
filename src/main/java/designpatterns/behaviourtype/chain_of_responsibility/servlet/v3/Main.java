package designpatterns.behaviourtype.chain_of_responsibility.servlet.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Samuel
 * @date: 2021-05-19 9:08
 * 完全模拟Servlet中的FilterChain
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
    boolean doFilter(Request request,Response response,FilterChain filterChain);
}

class Request{
    String str;
}

class Response{
    String str;
}

class HTMLFilter implements Filter{
    @Override
    public boolean doFilter(Request request,Response response,FilterChain filterChain) {
        request.str=request.str.replaceAll("<","[").replaceAll(">","]")+"---HTMLFilter()";
        filterChain.doFilter(request,response);
        response.str+="---HTMLFilter()";
        return true;
    }
}

class SensitiveFilter implements Filter{

    @Override
    public boolean doFilter(Request request, Response response,FilterChain filterChain) {
        request.str=request.str.replaceAll("干坏事","***")+"---SensitiveFilter()";
        filterChain.doFilter(request,response);
        response.str+="---SensitiveFilter()";
        return true;
    }
}

class FilterChain {
    List<Filter> filters=new ArrayList<>();
    int index=0;

    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }

    public boolean doFilter(Request request, Response response) {
        if(index==filters.size()) return false;
        Filter f=filters.get(index);
        index++;

        return f.doFilter(request,response,this);
    }
}


