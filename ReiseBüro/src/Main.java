import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author biond
 */
public class Main extends Application {
    
     @Override
    public void start(Stage primaryStage) throws Exception{
    Parent root  = FXMLLoader.load(getClass().getResource("ReiseBüroFXML.fxml"));
    primaryStage.setTitle("ReiseBüro");
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
    }
    
    public static void main(String[] args){ launch(args); }
    
}
