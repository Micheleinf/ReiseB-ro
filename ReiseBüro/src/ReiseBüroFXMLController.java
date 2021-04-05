import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author biond
 */
public class ReiseBüroFXMLController implements Initializable {

    //Variablen
    @FXML
    private CheckBox auto;
    @FXML
    private CheckBox flug;
    @FXML
    private CheckBox zug;
    @FXML
    private TextField km;
    @FXML
    private TextField ab;
    @FXML
    private TextField nach;
    @FXML
    private Label label;
    @FXML
    private Button check;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void rechner(ActionEvent event) {
        
        if(auto.isSelected()){
            String kilometer = km.getText();
            double k = Double.parseDouble(kilometer);
            
            String abfahrort = ab.getText();
            String ankunft = nach.getText();
            
            //getestet mit 120 KM.
            double kk = k*0.75;
            double stund = kk/60;
            
            label.setText("Sie fahren von " + abfahrort + " nach " + ankunft + ", und brauchen dafür ca. " + stund + " Stunde/n");
            
            
            
        }
        
        else if(zug.isSelected()){
            String kilometer = km.getText();
            double k = Double.parseDouble(kilometer);
            
            //getestet mit 120 KM.
            double kk = k*0.45;
            double stund = kk/60;
            
            String abfahrort = ab.getText();
            String ankunft = nach.getText();
            
             label.setText("Sie Speeden mit dem Zug von " + abfahrort + " nach " + ankunft + ", und brauchen dafür ca. " + stund + " Stunden");
        }
        
        else if(flug.isSelected()){
            String kilometer = km.getText();
            double k = Double.parseDouble(kilometer);
            
            String abfahrort = ab.getText();
            String ankunft = nach.getText();
            
            double kk = k*0.06;
            double stund = kk/60;
            
            label.setText("Sie Fliegen von " + abfahrort + " Airport nach " + ankunft + " Airport, und brauchen dafür ca. " + stund + " Stunden");

            
        }
        
        
        
        
    }
    
}
