package mission.view;

import api.Console;
import javax.swing.text.View;

public class InputView implements InputInterface{
    @Override
    public String inputIngredient(){
        return Console.readLine();
    }
}
