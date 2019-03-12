package remaingQuestion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("componentBean")
public class Restaurant {
    //@Autowired                     /*Question 9*/
    private HotDrink hotDrink;

    //@Autowired                     /*Question 9*/
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public Restaurant() {
    }


    public HotDrink getHotDrink() {
        return hotDrink;
    }


//    @Required                     /*Question 8*/
    @Autowired                     /*Question 9*/
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "hotDrink=" + hotDrink.prepareHotDrink() +
                '}';
    }
}
