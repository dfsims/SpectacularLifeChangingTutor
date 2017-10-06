package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
//    Image image = new Image("");
  //  ImageView iv1 = new ImageView();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //iv1.setImage(image);
    }
    @FXML
    private void loginButtonHandler()
    {
        System.out.println("Log in button.");
    }
}
//D
