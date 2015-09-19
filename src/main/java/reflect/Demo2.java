package reflect;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

//反射某个类的构造函数，创建类的对象
public class Demo2 {

    Class<?> clazz;

    @Before
    public void setUp() throws Exception {

        clazz = Class.forName("reflect.Person");

    }

    @Test
    public void test1() throws Exception {


        Constructor<?> constructor = clazz.getConstructor(null);

        Person p = (Person)constructor.newInstance();

        System.out.println(p.name);

    }

    @Test
    public void test2() throws Exception {
        Constructor<?> constructor = clazz.getConstructor(String.class);
        Person p = (Person)constructor.newInstance("xxxxx");
        System.out.println(p.name);
    }

    @Test
    public void test3() throws Exception {
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
        Person p = (Person)constructor.newInstance("xx", 123);
        System.out.println(p.name);
    }

    @Test
    public void test4() throws Exception {

        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(List.class);
        declaredConstructor.setAccessible(true);//强制访问
        Person p = (Person)declaredConstructor.newInstance(new ArrayList());
        System.out.println(p.name);

    }

    @Test
    public void test5() throws Exception {

        Person p = (Person)clazz.newInstance();

        System.out.println(p.name);

    }

    @After
    public void tearDown() throws Exception {
        clazz = null;

    }


}
