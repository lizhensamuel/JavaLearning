package designpatterns.behaviourtype.chain_of_responsibility;


import java.util.ArrayList;
import java.util.List;

/**
 * @author: Samuel
 * @date: 2021-05-16 17:29
 */
public class Main {
    public static void main(String[] args) {
        Msg msg=new Msg();
        msg.setMsg("敲里吗，this is qlm！");

        FilterChain0 fc=new FilterChain0();
        FilterChain0 fc2=new FilterChain0();
        fc.add(new Filter01())
                .add(new Filter02());

        fc2.add(new Filter03())
                .add(new Filter04());

        fc.add(fc2);

        fc.doFilter(msg);

        System.out.println(msg);
    }
}

class Msg{
    String name;
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

interface Filter0{
    boolean doFilter(Msg m);
}

class Filter01 implements Filter0{

    @Override
    public boolean doFilter(Msg m) {
        String r=m.getMsg();
        r=r.replace('q','*');
        r=r.replace('l','*');
        r=r.replace('m','*');
        m.setMsg(r);

        return true;
    }
}

class Filter02 implements Filter0{
    @Override
    public boolean doFilter(Msg m) {
        String r=m.getMsg();
        r=r.replace('敲','*');
        r=r.replace('里','*');
        r=r.replace('吗','*');
        m.setMsg(r);
        return true;
    }
}

class Filter03 implements Filter0{
    @Override
    public boolean doFilter(Msg m) {
        String r=m.getMsg();
        r=r.replace('*','-');
        r=r.replace('*','-');
        r=r.replace('*','-');
        m.setMsg(r);
        return false;
    }
}

class Filter04 implements Filter0{
    @Override
    public boolean doFilter(Msg m) {
        String r=m.getMsg();
        r=r.replace('-','+');
        r=r.replace('-','+');
        r=r.replace('-','+');
        m.setMsg(r);
        return true;
    }
}

class FilterChain0 implements Filter0{
    List<Filter0> filters=new ArrayList<>();

    public FilterChain0 add(Filter0 filter){
        filters.add(filter);
        return this;
    }

    public boolean doFilter(Msg msg){
        for(Filter0 filter:filters){
            if(!filter.doFilter(msg))return false;
        }
        return true;
    }
}
