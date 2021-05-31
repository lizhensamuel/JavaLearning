package   reflection;
//类加载器
public class ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        java.lang.ClassLoader systemClassLoader= java.lang.ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器--->扩展类加载器
        java.lang.ClassLoader parent=systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器--->根加载器（C/C++编写）
        java.lang.ClassLoader parent1=parent.getParent();
        System.out.println(parent1);

        System.out.println("==================");

        //测试当前类是由哪个加载器加载的
        java.lang.ClassLoader classLoader=Class.forName("  reflection.ClassLoader").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置的类是谁加载的
        classLoader=Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        System.out.println("===============");

        //如何获得系统加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        /*
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\charsets.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\deploy.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext\access-bridge-64.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext\cldrdata.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext\dnsns.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext\jaccess.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext\jfxrt.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext\localedata.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext\nashorn.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext\sunec.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext\sunjce_provider.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext\sunmscapi.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext\sunpkcs11.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext\zipfs.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\javaws.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\jce.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\jfr.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\jfxswt.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\jsse.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\management-agent.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\plugin.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\resources.jar;
            C:\Program Files\Java\jdk1.8.0_05\jre\lib\rt.jar;
            D:\IDEA项目备份\IdeaProjects\JavaLearning\out\production\Base;
            C:\Program Files\JetBrains\IntelliJ IDEA 2020.1\lib\idea_rt.jar

            如果类不在这些路径中 就无法加载
         */

    }
}
