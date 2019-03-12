package question1and2;/*Question1 and Question2*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring-config.xml");
        System.out.println(applicationContext.getBean(Database.class));
    }
}
