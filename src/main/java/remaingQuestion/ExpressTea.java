package remaingQuestion;

import org.springframework.stereotype.Component;

@Component("Etea")
public class ExpressTea implements HotDrink {
    @Override
    public String prepareHotDrink() {

        return "Preparing ExpressTea";
    }
}
