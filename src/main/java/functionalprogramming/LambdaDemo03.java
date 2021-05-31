package functionalprogramming;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: Samuel
 * @date: 2021-05-22 19:40
 */
public class LambdaDemo03 {
    public static int comp(String s1,String s2){
        return s1.length()-s2.length();
    }
    public int comp2(String s1,String s2){
        return s1.length()-s2.length();
    }
    static class NaturalNumberSupplier implements Supplier{
        long l=0L;

        @Override
        public Object get() {
            l++;
            return l;
        }
    }
    public static void main(String[] args) {
        List<String> list= Arrays.asList("java","javascript","scala","python");
        //常规写法
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });
        //使用lambda表达式
        Collections.sort(list,(a,b)->a.length()-b.length());
        //使用方法引用,传入静态方法
        Collections.sort(list,LambdaDemo03::comp);
        //使用方法引用,传入实例方法
        Collections.sort(list,new LambdaDemo03()::comp2);
        Collections.sort(list,String::compareTo);
        //String中的compareTo方法定义时看似只传入一个参数，但其实传入了两个参数，其中第一个隐含参数默认传入this
        //相当于静态方法:public static int compareTo(this,String s);
        //方法引用,传入构造方法   类名::new


        //常规写法
        for(String str:list){
            System.out.println(str);
        }
        //使用方法引用
        list.forEach(System.out::println);

        //使用Stream.of()创建Stream
        Stream<String> stream=Stream.of("test1","test2","test3");
        stream.forEach(System.out::println);

        //基于数组或Collection创建Stream
        //数组使用Arrays.stream()创建Stream
        Stream<String> stream1=Arrays.stream(new String[]{"s 1","s 2","s 3"});
        //Collection使用stream()方法创建Stream
        List<String> list1=new ArrayList<>();
        list1.add("s11");
        list1.add("s12");
        list1.add("s13");
        Stream<String> stream2=list1.stream();

        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);

        //基于Supplier创建Stream
        Stream<Long> stream3=Stream.generate(new NaturalNumberSupplier());
        //将无限序列变成有限序列再打印
        stream3.limit(10).forEach(System.out::println);
        //使用map()方法实现Stream的转换
        Arrays.stream(new String[]{"a a","b b","c c","d d"})
                .map(String::trim)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        //使用filter()方法实现Stream的过滤
        IntStream.of(1,434,53,23,56435,4534,3,45,62687,8,45,89,4564,97)
                .filter(n->n%2!=0)
                .forEach(System.out::println);
        //使用reduce()方法实现Stream聚合
        int sum=IntStream.of(111,222,333,444,555,666,777,888,999).reduce(0,(acc,n)->acc+n);
        System.out.println(sum);
        //输出为List
        Stream<String> stream4=Stream.of("aaa","bbb","ccc","ddd");
        List<String> list2=stream4.collect(Collectors.toList());
        list2.forEach(System.out::println);
        //输出为数组
        Stream<String> stream5=Stream.of("a0a","b0b","c0c","d0d");
        String[] strings=stream5.toArray(String[]::new);
        for(String s:strings){
            System.out.println(s);
        }
        //输出为Map
        Stream<String> stream6=Stream.of("a:1","b:2","c:3","d:4");
        Map<String,String> map=stream6.collect(Collectors.toMap(s->s.substring(0,s.indexOf(":")),
                s->s.substring(s.indexOf(":")+1)));
        System.out.println(map);
        //分组输出
        Stream<String> stream7=Stream.of("a111","a222","b111","b222","a333","b333","c111");
        Map<String,List<String>> map1=stream7.collect(Collectors.groupingBy(s->s.substring(0,1), Collectors.toList()));
        System.out.println(map1);
        //排序
        Stream<String> stream8=Stream.of("a111","a222","b111","b222","a333","b333","c111");
        List<String> list3=stream8.sorted().collect(Collectors.toList());
        System.out.println(list3);
        //去重
        Stream<String> stream9=Stream.of("a111","b222","b111","b222","a333","a333","a111");
        List<String> list4=stream9.distinct().collect(Collectors.toList());
        System.out.println(list4);
        //跳过，截取
        IntStream.of(1,2,3,4,5,6,8,9,10)
                .skip(3)
                .limit(3)
                .forEach(System.out::println);
        //合并
        IntStream.concat(IntStream.of(1,2,3),IntStream.of(4,5,6)).forEach(System.out::println);
        //将元素一一映射成Stream再合并成一个Stream
        Stream<List<Integer>> stream10=Stream.of(
                Arrays.asList(2,3,3),
                Arrays.asList(3,4,4),
                Arrays.asList(4,5,5)
                );
        Stream<Integer> stream11=stream10.flatMap(l->l.stream());
        stream11.forEach(System.out::println);
        //并行
        Stream<String> s = Stream.of("233","344","afd","fjdasfj","jffdj","kjfdfj");
        String[] result = s.parallel() // 变成一个可以并行处理的Stream
                .sorted() // 可以进行并行排序
                .toArray(String[]::new);

/**
 *
 *         count()：用于返回元素个数；
 *         max(Comparator<? super T> cp)：找出最大元素；
 *         min(Comparator<? super T> cp)：找出最小元素。
 *         针对IntStream、LongStream和DoubleStream，还额外提供了以下聚合方法：
 *         sum()：对所有元素求和；
 *         average()：对所有元素求平均数。
 *         还有一些方法，用来测试Stream的元素是否满足以下条件：
 *         boolean allMatch(Predicate<? super T>)：测试是否所有元素均满足测试条件；
 *         boolean anyMatch(Predicate<? super T>)：测试是否至少有一个元素满足测试条件。
 *         最后一个常用的方法是forEach()，它可以循环处理Stream的每个元素
 */



    }
}
