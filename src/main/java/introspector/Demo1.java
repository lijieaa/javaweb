package introspector;

import org.junit.Before;
import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * 使用内省api操作bean的属性
 */
public class Demo1 {

    Person person;

    @Before
    public void setUp() throws Exception {

        person = new Person();

    }

    //得到bean的所有属性
    @Test
    public void test1() throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            System.out.println(propertyDescriptor.getName());
        }
    }

    //操作bean指定属性:age
    @Test
    public void test2() throws Exception {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("age",Person.class);
        Method writeMethod = propertyDescriptor.getWriteMethod();
        writeMethod.invoke(person,50);
        System.out.println(person.getAge());

        Method readMethod = propertyDescriptor.getReadMethod();
        //readMethod.invoke(person, null);
        System.out.println( readMethod.invoke(person, null));

        System.out.println(propertyDescriptor.getPropertyType());

    }
}
