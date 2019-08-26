package Utils;

import javafx.scene.shape.Rectangle;

public class Boarder {

    public static void drawBoarder(Rectangle rectangle) {
        rectangle.setDisable(true);
        rectangle.setVisible(true);
    }

    public static void withdrawBoarder(Rectangle rectangle) {
        rectangle.setVisible(false);
    }

}