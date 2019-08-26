package GUI;

import Game.GameConfig;
import GameObject.PlayerList;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import Character.Player;



public class HMBar {
    private Player player;
//    private ImageView profile;
//    private Rectangle healthBackground;
//    private Rectangle manaBackground;
    private Rectangle health;
    private Rectangle mana;

    public HMBar(Player player) {
        this.player = player;

//        this.profile = new ImageView();
//        this.healthBackground = new Rectangle();
//        this.manaBackground = new Rectangle();
        this.health = new Rectangle();
        this.mana = new Rectangle();

//        setWidth(200);
//        setHeight(53);
//        setLayoutX(200 * (index % 3));
//        setLayoutY(53 * (index / 4));
//        setStyle("-fx-background-color: #2f488d");
//
//        this.profile.setFitWidth(40);
//        this.profile.setFitHeight(45);
//        this.profile.setLayoutX(14);
//        this.profile.setLayoutY(4);
//        this.profile.setImage(player.getCharacter().getProfile());
//
//        this.healthBackground.setWidth(130);
//        this.healthBackground.setHeight(14);
//        this.healthBackground.setLayoutX(58);
//        this.healthBackground.setLayoutY(9.5);
//        this.healthBackground.setFill(Paint.valueOf("#2f488d"));
//        this.healthBackground.setStroke(Paint.valueOf("#40609d"));
//
//        this.manaBackground.setWidth(130);
//        this.manaBackground.setHeight(14);
//        this.healthBackground.setLayoutX(58);
//        this.manaBackground.setLayoutY(30.5);
//        this.manaBackground.setFill(Paint.valueOf("#2f488d"));
//        this.manaBackground.setStroke(Paint.valueOf("#40609d"));

        this.health.setFill(Paint.valueOf("#fe0e16"));
        this.health.setStroke(Paint.valueOf("#ffffff00"));
        this.health.setWidth(GameConfig.DEFAULT_HEALTH);
        this.health.setHeight(13);
        this.health.setLayoutX(58);
        this.health.setLayoutY(10);

        this.mana.setFill(Paint.valueOf("#0005f9"));
        this.mana.setStroke(Paint.valueOf("#ffffff00"));
        this.mana.setWidth(GameConfig.DEFAULT_MANA);
        this.mana.setHeight(13);
        this.mana.setLayoutX(58);
        this.mana.setLayoutY(31);

//        this.getChildren().addAll(profile, healthBackground, manaBackground, health, mana);
    }

    public void update() {
        this.health.setWidth(this.player.getHealth());
        this.mana.setWidth(this.player.getMana());
    }

    public Rectangle getHealth() {
        return health;
    }

    public void setHealth(Rectangle health) {
        this.health = health;
    }

    public Rectangle getMana() {
        return mana;
    }

    public void setMana(Rectangle mana) {
        this.mana = mana;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

//    public ImageView getProfile() {
//        return profile;
//    }
//
//    public void setProfile(ImageView profile) {
//        this.profile = profile;
//    }
//
//    public Rectangle getHealthBackground() {
//        return healthBackground;
//    }
//
//    public void setHealthBackground(Rectangle healthBackground) {
//        this.healthBackground = healthBackground;
//    }
//
//    public Rectangle getManaBackground() {
//        return manaBackground;
//    }
//
//    public void setManaBackground(Rectangle manaBackground) {
//        this.manaBackground = manaBackground;
//    }
}
