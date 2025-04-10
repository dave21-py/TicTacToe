package app;

import javax.swing.text.html.ImageView;

import app.model.CellObserver;
import app.model.Player;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class CellButton extends Button implements CellObserver{
    private static final Image pngX = new Image("x.png");
    private static final Image pngO = new Image("o.png");

    public void update(Player player){
        if(player == Player.X){
            this.setGraphic(new ImageView(pngX));
        }
        else if(player == Player.O){
            this.setGraphic(new ImageView(pngO));
        }


    

    
}
}
