package reflect;

/**
 * Created by Administrator on 2015/9/19.
 */
public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1
        Class<?> aClass = Class.forName("reflect.Person");

        //2
        Class clazz = new Person().getClass();

        //3
        Class clazz1 = Person.class;


    }
}
