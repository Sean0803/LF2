package GUI;

import Control.KeyControl;
import Utils.Boarder;
import Utils.Music;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.File;

public class ControlSettingsController {

    private static Media backgroundMusic = new Media(new File("res" + File.separator + "sounds" + File.separator + "Controls.mp3").toURI().toString());
    private static MediaPlayer backgroundMP = new MediaPlayer(backgroundMusic);
    private static int clickCount = 1;
    private Media transitionMusic = new Media(new File("res" + File.separator + "sounds" + File.separator + "Transition.mp3").toURI().toString());
    private MediaPlayer transitionMP = new MediaPlayer(transitionMusic);

    @FXML
    private Pane root;

    @FXML
    private Button up;

    @FXML
    private Button down;

    @FXML
    private Button left;

    @FXML
    private Button right;

    @FXML
    private Button attack;

    @FXML
    private Button jump;

    @FXML
    private Button defend;

    @FXML
    private Button upKey;

    @FXML
    private Button downKey;

    @FXML
    private Button leftKey;

    @FXML
    private Button rightKey;

    @FXML
    private Button attackKey;

    @FXML
    private Button jumpKey;

    @FXML
    private Button defendKey;

    @FXML
    private Button okBtn;

    @FXML
    private Rectangle okBtnBoarder;

    public static MediaPlayer getBackgroundMP() {
        return ControlSettingsController.backgroundMP;
    }

    public void okBtnBoarderLight(MouseEvent mouseEvent) {
        Boarder.drawBoarder(okBtnBoarder);
    }

    public void okBtnBoarderDark(MouseEvent mouseEvent) {
        Boarder.withdrawBoarder(okBtnBoarder);
    }

    public void okBtnClicked(MouseEvent mouseEvent) {
        Music.stopLoopMusic(backgroundMP);
        Music.startEffectMusic(transitionMP);
        this.init();
        SceneManager.setMenu();
    }

    public void setUpKey(KeyEvent keyEvent) {
        if (!upKey.isDisable() && clickCount % 2 == 1) {
            if (keyEvent != null && !KeyControl.isFind(keyEvent.getCode())) {
                upKey.setText(keyEvent.getCode().toString());
                KeyControl.UP.setCode(keyEvent.getCode());
                init();
            }
        }
    }

    public void setDownKey(KeyEvent keyEvent) {
        if (!downKey.isDisable() && clickCount % 2 == 1) {
            if (keyEvent != null && !KeyControl.isFind(keyEvent.getCode())) {
                downKey.setText(keyEvent.getCode().toString());
                KeyControl.DOWN.setCode(keyEvent.getCode());
                init();
            }
        }
    }

    public void setLeftKey(KeyEvent keyEvent) {
        if (!leftKey.isDisable() && clickCount % 2 == 1) {
            if (keyEvent != null && !KeyControl.isFind(keyEvent.getCode())) {
                leftKey.setText(keyEvent.getCode().toString());
                KeyControl.LEFT.setCode(keyEvent.getCode());
                init();
            }
        }
    }

    public void setRightKey(KeyEvent keyEvent) {
        if (!rightKey.isDisable() && clickCount % 2 == 1) {
            if (keyEvent != null && !KeyControl.isFind(keyEvent.getCode())) {
                rightKey.setText(keyEvent.getCode().toString());
                KeyControl.RIGHT.setCode(keyEvent.getCode());
                init();
            }
        }
    }

    public void setAttackKey(KeyEvent keyEvent) {
        if (!attackKey.isDisable() && clickCount % 2 == 1) {
            if (keyEvent != null && !KeyControl.isFind(keyEvent.getCode())) {
                attackKey.setText(keyEvent.getCode().toString());
                KeyControl.ATTACK.setCode(keyEvent.getCode());
                init();
            }
        }
    }

    public void setJumpKey(KeyEvent keyEvent) {
        if (!jumpKey.isDisable() && clickCount % 2 == 1) {
            if (keyEvent != null && !KeyControl.isFind(keyEvent.getCode())) {
                jumpKey.setText(keyEvent.getCode().toString());
                KeyControl.JUMP.setCode(keyEvent.getCode());
                init();
            }
        }
    }

    public void setDefendKey(KeyEvent keyEvent) {
        if (!defendKey.isDisable() && clickCount % 2 == 1) {
            if (keyEvent != null && !KeyControl.isFind(keyEvent.getCode())) {
                defendKey.setText(keyEvent.getCode().toString());
                KeyControl.DEFEND.setCode(keyEvent.getCode());
                init();
            }
        }
    }

    public void upBtnClicked(MouseEvent mouseEvent) {
        up.setOnMouseReleased(e -> clickCount++);
        upKey.setOnMouseReleased(e -> clickCount++);
        if (clickCount % 2 == 1) {
            upKey.setTextFill(Color.valueOf("#1a44ff"));
            down.setDisable(true);
            downKey.setDisable(true);
            left.setDisable(true);
            leftKey.setDisable(true);
            right.setDisable(true);
            rightKey.setDisable(true);
            attack.setDisable(true);
            attackKey.setDisable(true);
            jump.setDisable(true);
            jumpKey.setDisable(true);
            defend.setDisable(true);
            defendKey.setDisable(true);
        } else {
            init();
        }
    }

    public void downBtnClicked(MouseEvent mouseEvent) {
        down.setOnMouseReleased(e -> clickCount++);
        downKey.setOnMouseReleased(e -> clickCount++);
        if (clickCount % 2 == 1) {
            downKey.setTextFill(Color.valueOf("#1a44ff"));
            up.setDisable(true);
            upKey.setDisable(true);
            left.setDisable(true);
            leftKey.setDisable(true);
            right.setDisable(true);
            rightKey.setDisable(true);
            attack.setDisable(true);
            attackKey.setDisable(true);
            jump.setDisable(true);
            jumpKey.setDisable(true);
            defend.setDisable(true);
            defendKey.setDisable(true);
        } else {
            init();
        }
    }

    public void leftBtnClicked(MouseEvent mouseEvent) {
        left.setOnMouseReleased(e -> clickCount++);
        leftKey.setOnMouseReleased(e -> clickCount++);
        if (clickCount % 2 == 1) {
            leftKey.setTextFill(Color.valueOf("#1a44ff"));
            down.setDisable(true);
            downKey.setDisable(true);
            up.setDisable(true);
            upKey.setDisable(true);
            right.setDisable(true);
            rightKey.setDisable(true);
            attack.setDisable(true);
            attackKey.setDisable(true);
            jump.setDisable(true);
            jumpKey.setDisable(true);
            defend.setDisable(true);
            defendKey.setDisable(true);
        } else {
            init();
        }
    }

    public void rightBtnClicked(MouseEvent mouseEvent) {
        right.setOnMouseReleased(e -> clickCount++);
        rightKey.setOnMouseReleased(e -> clickCount++);
        if (clickCount % 2 == 1) {
            rightKey.setTextFill(Color.valueOf("#1a44ff"));
            down.setDisable(true);
            downKey.setDisable(true);
            left.setDisable(true);
            leftKey.setDisable(true);
            up.setDisable(true);
            upKey.setDisable(true);
            attack.setDisable(true);
            attackKey.setDisable(true);
            jump.setDisable(true);
            jumpKey.setDisable(true);
            defend.setDisable(true);
            defendKey.setDisable(true);
        } else {
            init();
        }
    }

    public void jumpBtnClicked(MouseEvent mouseEvent) {
        jump.setOnMouseReleased(e -> clickCount++);
        jumpKey.setOnMouseReleased(e -> clickCount++);
        if (clickCount % 2 == 1) {
            jumpKey.setTextFill(Color.valueOf("#1a44ff"));
            down.setDisable(true);
            downKey.setDisable(true);
            left.setDisable(true);
            leftKey.setDisable(true);
            right.setDisable(true);
            rightKey.setDisable(true);
            attack.setDisable(true);
            attackKey.setDisable(true);
            up.setDisable(true);
            upKey.setDisable(true);
            defend.setDisable(true);
            defendKey.setDisable(true);
        } else {
            init();
        }
    }

    public void attackBtnClicked(MouseEvent mouseEvent) {
        attack.setOnMouseReleased(e -> clickCount++);
        attackKey.setOnMouseReleased(e -> clickCount++);
        if (clickCount % 2 == 1) {
            attackKey.setTextFill(Color.valueOf("#1a44ff"));
            down.setDisable(true);
            downKey.setDisable(true);
            left.setDisable(true);
            leftKey.setDisable(true);
            right.setDisable(true);
            rightKey.setDisable(true);
            up.setDisable(true);
            upKey.setDisable(true);
            jump.setDisable(true);
            jumpKey.setDisable(true);
            defend.setDisable(true);
            defendKey.setDisable(true);
        } else {
            init();
        }
    }

    public void defendBtnClicked(MouseEvent mouseEvent) {
        defend.setOnMouseReleased(e -> clickCount++);
        defendKey.setOnMouseReleased(e -> clickCount++);
        if (clickCount % 2 == 1) {
            defendKey.setTextFill(Color.valueOf("#1a44ff"));
            down.setDisable(true);
            downKey.setDisable(true);
            left.setDisable(true);
            leftKey.setDisable(true);
            right.setDisable(true);
            rightKey.setDisable(true);
            attack.setDisable(true);
            attackKey.setDisable(true);
            jump.setDisable(true);
            jumpKey.setDisable(true);
            up.setDisable(true);
            upKey.setDisable(true);
        } else {
            init();
        }
    }

    public void init() {
        clickCount = 0;
        up.setDisable(false);
        upKey.setDisable(false);
        down.setDisable(false);
        downKey.setDisable(false);
        left.setDisable(false);
        leftKey.setDisable(false);
        right.setDisable(false);
        rightKey.setDisable(false);
        attack.setDisable(false);
        attackKey.setDisable(false);
        jump.setDisable(false);
        jumpKey.setDisable(false);
        defend.setDisable(false);
        defendKey.setDisable(false);
        upKey.setTextFill(Color.WHITE);
        downKey.setTextFill(Color.WHITE);
        leftKey.setTextFill(Color.WHITE);
        rightKey.setTextFill(Color.WHITE);
        attackKey.setTextFill(Color.WHITE);
        jumpKey.setTextFill(Color.WHITE);
        defendKey.setTextFill(Color.WHITE);
        upKey.setText(KeyControl.UP.getCode().toString());
        downKey.setText(KeyControl.DOWN.getCode().toString());
        leftKey.setText(KeyControl.LEFT.getCode().toString());
        rightKey.setText(KeyControl.RIGHT.getCode().toString());
        attackKey.setText(KeyControl.ATTACK.getCode().toString());
        jumpKey.setText(KeyControl.JUMP.getCode().toString());
        defendKey.setText(KeyControl.DEFEND.getCode().toString());
    }

}