import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HC
 * @version 1.0
 */
public class MyTest {
    public static void main(String[] args) {

       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Object hello = context.getBean("hello");
        System.out.println(hello.toString());
    }
}
