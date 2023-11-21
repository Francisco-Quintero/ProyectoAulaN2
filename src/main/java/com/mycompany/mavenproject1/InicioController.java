/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author franc
 */
public class InicioController implements Initializable {

    @FXML
    private Label btnRegistro, btnConsultar, btnsalir;
    
    @FXML
    private void clickRegistrar() throws IOException {
        StackPane pane = new StackPane(App.loadFXML("registro"));
    }

    @FXML
    private void clickConsultar() throws IOException {
        StackPane pane = new StackPane(App.loadFXML("..."));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //...
    }

    /**
     * Initializes the controller class.
     */
    
}
