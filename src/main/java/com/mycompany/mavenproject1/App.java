package com.mycompany.mavenproject1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;



static void newStage(String inicio, boolean b, int i, int i0) {
    // Crear una nueva ventana de inicio de sesión
    Stage stage = new Stage();

    // Crear los controles necesarios (Label, TextField, Button)
    Label label = new Label(inicio);
    TextField textField = new TextField();
    Button button = new Button("Enviar");

    // Establecer la funcionalidad del botón (aquí puedes agregar la funcionalidad necesaria)
    button.setOnAction(event -> {
        // Aquí puedes obtener el texto del TextField y procesarlo según sea necesario
        String text = textField.getText();
        System.out.println("Texto enviado: " + text);
    });

    // Configurar la escena
    Scene scene = new Scene(new VBox(label, textField, button), 300, 200);

    // Establecer la escena en la ventana de inicio de sesión
    stage.setScene(scene);

    // Mostrar la ventana de inicio de sesión
    stage.show();
}
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("login"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}