import entities.Livro;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public abstract class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Stage stage = primaryStage;
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("/fxml/Cadastro.fxml"));
        Scene mainScene = new Scene(fxmlMain);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Sistema Livro");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static  void main(String[] args){
        launch(args);
    }
}
