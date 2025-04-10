package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import app.model.Coordinate;
import app.model.Player;
import app.model.TicTacToe;


public class MainWindow {

    // Model variables
    TicTacToe model;

    // GUI controls

    @FXML VBox vbox;

    @FXML Label lblMessage;

    // Images

    // FXML Event Handlers

    @FXML 
    void initialize() {
        model = new TicTacToe();
        model.setOnWin(a -> lblMessage.setText(a.name() + " WINS!"));

        for (int row = 0; row < 3; ++row) {
            var hbox = new HBox();
            vbox.getChildren().add(hbox);
            for (int col = 0; col < 3; ++col) {
                var btn = new CellButton();
                btn.getStyleClass().add("cellbutton");
                int btnCol = col;
                int btnRow = row;
                btn.setOnAction(e -> model.processMove(btnRow, btnCol));
                btn.setUserData(new Coordinate(btnRow, btnCol));
                hbox.getChildren().add(btn);
                model.getCell(row, col).setObserver(btn);
            }
        }
    }


}
