package   reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class Generic {
    public static void main(String[] args) throws NoSuchMethodException {

        Method method=User.class.getDeclaredMethod("test01",Map.class,List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for(Type genericParameterType:genericParameterTypes){
            System.out.println("###:"+genericParameterType);
            if(genericParameterType instanceof ParameterizedType){
                Type[] actualTypeArguments = ((ParameterizedType)genericParameterType).getActualTypeArguments();
                for(Type actualTypeArgument:actualTypeArguments){
                    System.out.println(actualTypeArgument);
                }

            }
        }

        System.out.println("-------");

        Method method1=User.class.getDeclaredMethod("test02");
        Type genericReturnType= method1.getGenericReturnType();
        if(genericReturnType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for(Type actualTypeArgument:actualTypeArguments){
                System.out.println(actualTypeArgument);
            }
        }
    }
}

class User{
    private String name;

    public User(){

    }

    public User(String name){
        this.name=name;
    }

    public void test01(Map<String,User> map, List<User> list){
        System.out.println("test01");
    }

    public Map<String,User> test02(){
        System.out.println("test02");
        return null;
    }
}
