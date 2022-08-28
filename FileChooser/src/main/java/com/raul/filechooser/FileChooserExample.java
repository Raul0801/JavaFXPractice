package com.raul.filechooser;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class FileChooserExample extends Application {
    public void start(Stage stage) {
        Menu fileMenu = new Menu("Archivo");
        MenuItem item = new MenuItem("Selecciona archivo csv para importar");
        fileMenu.getItems().addAll(item);
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Cargar csv");
        fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Archivos csv", ".csv"));
        item.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                fileChooser.showOpenDialog(stage);
            }});
        MenuBar menuBar = new MenuBar(fileMenu);
        menuBar.setTranslateX(3);
        menuBar.setTranslateY(3);
        Group root = new Group(menuBar);
        Scene scene = new Scene(root, 595, 355, Color.BEIGE);
        stage.setTitle("Ejemplo selector de archivo");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}