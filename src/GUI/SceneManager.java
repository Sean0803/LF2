package GUI;

import GameObject.HMBarList;
import GameObject.KeyCodeSet;
import GameObject.PlayerList;
import Utils.Music;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class SceneManager {
    private static Stage stage;
    private static Scene menu;
    private static Scene controlSettings;
    private static Scene characterSelection;
    private static Scene arenaScene;

    public static void setStage(Stage stage) {
        SceneManager.stage = stage;
    }

    public static void setMenu() {
        if (menu == null) {
            try {
                FXMLLoader loader = new FXMLLoader(MenuController.class.getResource("Scene" + File.separator + "Menu.fxml"));
                Parent root = loader.load();
                menu = new Scene(root, 800, 550);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Music.startLoopMusic(MenuController.getBackgroundMP());
        stage.setScene(menu);
        stage.setOnCloseRequest(e -> Music.stopLoopMusic(MenuController.getBackgroundMP()));
    }

    public static void setControlSettings() {
        if (controlSettings == null) {
            try {
                FXMLLoader loader = new FXMLLoader(MenuController.class.getResource("Scene" + File.separator + "ControlSettings.fxml"));
                Parent root = loader.load();
                controlSettings = new Scene(root, 800, 550);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Music.startLoopMusic(ControlSettingsController.getBackgroundMP());
        stage.setScene(controlSettings);
        stage.setOnCloseRequest(e -> Music.stopLoopMusic(ControlSettingsController.getBackgroundMP()));
    }

    public static void setVSModeCharacterSelection() {
        characterSelection = new Scene(CharacterSelection.getInstance().getRoot());
        CharacterSelection.getInstance().resetCharacterSelection();
        Music.stopLoopMusic(MenuController.getBackgroundMP());
        stage.setScene(characterSelection);
        stage.setOnCloseRequest(e -> Music.stopLoopMusic(MenuController.getBackgroundMP()));
    }

    public static void setVSMode() {
        if (arenaScene == null) {
            arenaScene = new Scene(Arena.getInstance().getBackgroundPane());
            arenaScene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
                KeyCodeSet.getKeySet().add(event.getCode());

            });
            arenaScene.addEventFilter(KeyEvent.KEY_RELEASED, event -> {
                KeyCodeSet.getKeySet().remove(event.getCode());
            });
        }
        KeyCodeSet.reset();
        PlayerList.initPlayerList();
        HMBarList.initHMBarList();
        Arena.getInstance().resetArena();
        stage.setScene(arenaScene);
    }

}
