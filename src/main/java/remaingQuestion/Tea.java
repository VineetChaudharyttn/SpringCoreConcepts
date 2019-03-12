package remaingQuestion;


import org.springframework.stereotype.Component;
@Component("tea")
public class Tea implements HotDrink {
    @Override
    public String prepareHotDrink() {
        return "Preparing Tea";
    }

}
