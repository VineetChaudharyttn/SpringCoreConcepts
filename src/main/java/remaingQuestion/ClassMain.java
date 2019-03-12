package remaingQuestion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassMain {
    public static void main(String[] args) {

//Question 3
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-config.xml");
        System.out.println(applicationContext.getBean("teaRestaurant"));

//Question 4
        Restaurant restaurant = (Restaurant) applicationContext.getBean("expressTeaRestaurant");
        HotDrink hotDrink = restaurant.getHotDrink();
        System.out.println(hotDrink.prepareHotDrink());

//Question 6
        System.out.println(applicationContext.getBean("PrepareTea"));
        System.out.println(applicationContext.getBean("byTypeRest"));
        System.out.println(applicationContext.getBean("prepareTeaConstructor"));

//Question7
        System.out.println("Hash code for one object: "+applicationContext.getBean("teaRestaurant").hashCode());
        System.out.println("Hash code for another object: "+applicationContext.getBean("teaRestaurant").hashCode());


//Question10

        System.out.println(applicationContext.getBean("componentBean"));




    }
}
