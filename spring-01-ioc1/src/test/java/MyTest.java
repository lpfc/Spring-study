import com.hc.dao.UserDaoMysqlImpl;
import com.hc.dao.UserDaoOracleImpl;
import com.hc.dao.UserDaoSqlserverImpl;
import com.hc.service.UserService;
import com.hc.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.security.mscapi.CPublicKey;

/**
 * @author HC
 * @version 1.0
 */
public class MyTest {
    public static void main(String[] args) {

        //用户调用的是业务层，dao层他们不需要接触!
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoSqlserverImpl());
//        userService.setUserDao(new UserDaoOracleImpl());
//        userService.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}
