package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import static sample.Main.sumaCifara;


public class Controller {
    public TextField numberA;
    public TextField finalResult;

    public void ispisi(ActionEvent actionEvent) {
        int n = Integer.parseInt(numberA.getText());
        String result = "";
        for(int i=1; i<n; i++) {
            if(i%sumaCifara(i)==0)
                result = result + i + " ";
        }
        finalResult.setText(result);
    }
}
