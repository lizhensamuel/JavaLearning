package   collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("2333");
        for(Iterator<String> iterator=list.iterator();iterator.hasNext();){
            String s=iterator.next();
            System.out.println(s);
        }



    }

}
