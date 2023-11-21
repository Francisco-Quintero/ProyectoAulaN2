/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.logica.Login;
import com.mycompany.mavenproject1.logica.Utility;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author franc
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;
    
    @FXML
    private Button btnLogin;

    /**
     * Initializes the controller class.
     */
    @FXML
    private void clickLogin(ActionEvent e) throws IOException {

        String username = this.txtUsername.getText();
        String password = this.txtPassword.getText();

        try {
            Login.validarLogin(username, password);
            App.newStage("inicio", true, 1600, 1000);
        } catch (IllegalStateException ie) {

            Utility.notificarMensaje("Validacion campos vacios", ie.getMessage(), Alert.AlertType.ERROR);

        } catch (Exception ie) {
            Utility.notificarMensaje("Validacion de login", ie.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //...
    }
}
