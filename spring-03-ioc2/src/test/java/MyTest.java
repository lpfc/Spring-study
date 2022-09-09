import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HC
 * @version 1.0
 */
public class MyTest {
    public static void main(String[] args) {
       // User user = new User();
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       //User user1 = (User) context.getBean("user");
       // User user1 = (User) context.getBean("ccccccccccccccccc");

        UserT user4 = (UserT) context.getBean("u2");
        // User user2 = (User) context.getBean("user");
       user4.show();
        //System.out.println(user1==user2);
    }
}
