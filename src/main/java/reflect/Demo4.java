package reflect;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2015/9/19.
 */
public class Demo4 {

    Class clazz;
    Person person;

    @Before
    public void setUp() throws Exception {

        clazz = Class.forName("reflect.Person");


        person = new Person();

    }

    @Test
    public void test1() throws Exception {

        Field f = clazz.getField("name");
        f.set(person, "xx");
        String name = (String)f.get(person);

        System.out.println(f.getType());

        System.out.println(name);

    }

    @Test
    public void test2() throws Exception {

        Field field = clazz.getDeclaredField("age");
        field.setAccessible(true);
        field.set(person, 25);
        System.out.println(field.get(person));

    }


    @Test
    public void test3() throws Exception {

        Field f = clazz.getField("s");
        f.set(person, "xx");
        String name = (String)f.get(person);

        System.out.println(f.getType());

        System.out.println(name);

    }
}
