package   collection.generic.collection;

import java.util.HashMap;

/**
 * 自定义自己的HashSet
 * @  Administrator
 *
 */
public class SxtHashSet {

	HashMap map;
	private static final Object PRESENT = new Object();

	public SxtHashSet(){
		map = new HashMap();
	}
	
	public int size(){
		return map.size();
	}
	
	public void add(Object o){
		map.put(o, PRESENT);   //set的不可重复就是利用了map里面键对象的不可重复！
	}
	
	public static void main(String[] args) {
		SxtHashSet s = new SxtHashSet();
		s.add("aaa");
		s.add(new String("aaa"));
		System.out.println(s.size());
	}

}
