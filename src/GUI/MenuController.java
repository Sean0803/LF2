package GUI;

import Utils.Boarder;
import Utils.Music;
import javafx.application.Platform;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Rectangle;

import java.io.File;

public class MenuController {

    private static Media backgroundMusic = new Media(new File("res" + File.separator + "sounds" + File.separator + "Background.mp3").toURI().toString());
    private static MediaPlayer backgroundMP = new MediaPlayer(backgroundMusic);
    private Media transitionMusic = new Media(new File("res" + File.separator + "sounds" + File.separator + "transition.mp3").toURI().toString());
    private MediaPlayer transitionMP = new MediaPlayer(transitionMusic);

   @FXML
    private Pane root;

    @FXML
    private Button vsModeBtn;

    @FXML
    private Button controlSettingsBtn;

    @FXML
    private Button quitBtn;

    @FXML
    private Button stageModeBtn;

    @FXML
    private Rectangle vsModeBoarder;

    @FXML
    private Rectangle stageModeBoarder;

    @FXML
    private Rectangle controlSettingsBoarder;

    @FXML
    private Rectangle quitBoarder;

    public void vsModeDrawBoarder(MouseEvent mouseEvent) {
        Boarder.drawBoarder(vsModeBoarder);
    }

    public void vsModeWithdrawBoarder(MouseEvent mouseEvent) {
        Boarder.withdrawBoarder(vsModeBoarder);
    }

    public void stageModeDrawBoarder(MouseEvent mouseEvent) {
        Boarder.drawBoarder(stageModeBoarder);
    }

    public void stageModeWithdrawBoarder(MouseEvent mouseEvent) {
        Boarder.withdrawBoarder(stageModeBoarder);
    }

    public void controlSettingsDrawBoarder(MouseEvent mouseEvent) {
        Boarder.drawBoarder(controlSettingsBoarder);

    }

    public void controlSettingsWithdrawBoarder(MouseEvent mouseEvent) {
        Boarder.withdrawBoarder(controlSettingsBoarder);
    }

    public void quitDrawBoarder(MouseEvent mouseEvent) {
        Boarder.drawBoarder(quitBoarder);

    }

    public void quitWithdrawBoarder(MouseEvent mouseEvent) {
        Boarder.withdrawBoarder(quitBoarder);
    }

    public void vsModeBtnClicked(MouseEvent mouseEvent) {
        Music.stopLoopMusic(this.backgroundMP);
        Music.startEffectMusic(this.transitionMP);
        SceneManager.setVSModeCharacterSelection();
    }

    public void stageModeBtnClicked(MouseEvent mouseEvent) {
        Music.stopLoopMusic(this.backgroundMP);
        Music.startEffectMusic(this.transitionMP);
    }

    public void controlSettingsBtnClicked(MouseEvent mouseEvent) {
        Music.stopLoopMusic(this.backgroundMP);
        Music.startEffectMusic(this.transitionMP);
        SceneManager.setControlSettings();
    }

    public void quitBtnClicked(MouseEvent mouseEvent) {
        Music.stopLoopMusic(this.backgroundMP);
        Music.startEffectMusic(this.transitionMP);
        Platform.exit();
    }

    public static MediaPlayer getBackgroundMP() {
        return MenuController.backgroundMP;
    }
}
