package sample;

import javafx.event.ActionEvent;
import javafx.scene.*;
import javafx.stage.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends Main implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML

    public void loginButtonHandler(ActionEvent event) throws Exception{
        Parent newSceneRoot = FXMLLoader.load(getClass().getResource("lesson1.fxml"));
        Scene newScene = new Scene(newSceneRoot);

        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(newScene);
        window.show();
    }

    public void nextLesson1Handler(ActionEvent event) throws Exception{
        Parent newSceneRoot = FXMLLoader.load(getClass().getResource("lesson2.fxml"));
        Scene newScene = new Scene(newSceneRoot);

        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(newScene);
        window.show();
    }

    public void nextLesson2Handler(ActionEvent event) throws Exception{
        Parent newSceneRoot = FXMLLoader.load(getClass().getResource("lesson3.fxml"));
        Scene newScene = new Scene(newSceneRoot);

        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(newScene);
        window.show();
    }

    public void nextLesson3Handler(ActionEvent event) throws Exception{
        Parent newSceneRoot = FXMLLoader.load(getClass().getResource("lesson4.fxml"));
        Scene newScene = new Scene(newSceneRoot);

        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(newScene);
        window.show();
    }

    public void nextLesson4Handler(ActionEvent event) throws Exception{
        Parent newSceneRoot = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene newScene = new Scene(newSceneRoot);

        Stage window = (Stage) (((Node)event.getSource()).getScene().getWindow());
        window.setScene(newScene);
        window.show();
    }
}
