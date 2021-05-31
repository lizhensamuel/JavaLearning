package commonclass.string;

/**
 * @author: Samuel
 * @date: 2021-05-13 9:53
 */
public class StringDemo {
    public static void main(String[] args) {
        String s="2333";
        String ss="233333";
//
//        //hashcode计算：遍历字符串计算h*31+var[i],31的二进制表示为11111,进行乘积操作时可以进行移位操作,计算机进行移位操作比较快
//        System.out.println(s.hashCode());
//        System.out.println(ss.hashCode());
//
//        System.out.println(s.charAt(0));//返回下标对应字符
//        //本质是用到了数组的复制过程
//        System.out.println(s.concat("2333"));//字符串拼接
//
//        s.compareTo("2333");//比较
//        s.compareToIgnoreCase("2333");//忽略大小写比较
//        s.contains("2333");//是否包含
//        s.getBytes();//转换成一个字节数组
//        s.indexOf("2");//返回对应字符的下标位置
//        s.equals("233");//比较内容是否相同
//        s.equalsIgnoreCase("2333");//忽略大小写比较内容是否相同
//        s.length();//返回字符串长度
//        s.replace("2","3");//将指定字符串替换成另外的指定字符串
//        s.startsWith("2");//是否以指定字符串开头
//        s.endsWith("3");//是否以指定字符串结束
//        //截取下标遵循左闭右开的原则
//        s.substring(2);//截取字符串从指定位置开始到字符串末尾结束
//        s.substring(2,5);//截取从指定开始位置到指定结束位置的字符串
//        s.toLowerCase();//转换成小写
//        s.toUpperCase();//转换成大写
//        s.trim();//返回删除头尾空格后的字符串
//        s.intern();//如果该字符串在常量池中已经存在则返回已存在的对应常量

        System.out.println(s.codePointAt(0));







    }
}
