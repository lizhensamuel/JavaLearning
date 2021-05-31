package   reflection;

public class ClassInfo2 {
    public static void main(String[] args) {
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);

    }

    static void printClassInfo(Class cls){
        System.out.println("ClassName:"+cls.getName());
        System.out.println("SimpleName:"+cls.getSimpleName());
        if(cls.getPackage()!=null){
            System.out.println("PackgeName:"+cls.getPackage().getName());
        }
        System.out.println("is Interface:" + cls.isInterface());
        System.out.println("is Enum:" + cls.isEnum());
        System.out.println("is Array:" + cls.isArray());
        System.out.println("is Primitive:" + cls.isPrimitive());
        System.out.println("====================================");
    }
}
