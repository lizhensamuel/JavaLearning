package   collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap();
        map.put("aaa",111);
        map.put("bbb",222);
        map.put("ccc",333);
        map.put("ddd",444);
        map.put("eee",555);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String s=entry.getKey();
            Integer v=entry.getValue();
            System.out.println(s+"="+v);
        }

    }
}
