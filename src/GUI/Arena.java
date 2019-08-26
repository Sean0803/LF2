package GUI;

import GameObject.*;
import Character.*;
import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.io.File;
import java.util.TreeSet;


public class Arena {

    private static Arena instance = new Arena();

    private Pane backgroundPane;
    private GridPane gridPane;

    private Pane c1;
    private ImageView c1Profile;
    private Rectangle c1HealthBackground;
    private Rectangle c1ManaBackground;
    private Pane c2;
    private ImageView c2Profile;
    private Rectangle c2HealthBackground;
    private Rectangle c2ManaBackground;
    private Pane c3;
    private ImageView c3Profile;
    private Rectangle c3HealthBackground;
    private Rectangle c3ManaBackground;
    private Pane c4;
    private ImageView c4Profile;
    private Rectangle c4HealthBackground;
    private Rectangle c4ManaBackground;
    private Pane c5;
    private ImageView c5Profile;
    private Rectangle c5HealthBackground;
    private Rectangle c5ManaBackground;
    private Pane c6;
    private ImageView c6Profile;
    private Rectangle c6HealthBackground;
    private Rectangle c6ManaBackground;
    private Pane c7;
    private ImageView c7Profile;
    private Rectangle c7HealthBackground;
    private Rectangle c7ManaBackground;
    private Pane c8;
    private ImageView c8Profile;
    private Rectangle c8HealthBackground;
    private Rectangle c8ManaBackground;

    private Rectangle middleRectangle;
    private Pane middlePane;
    private ImageView fieldImageView;
    private Rectangle bottomRectangle;

    private Pane[] panes;
    private ImageView[] imageViews;
    private Rectangle[] healthRectangles;
    private Rectangle[] manaRectangles;

    private Pane gameOverPane;
    private Text gameOver;
    private Button continueButton;

    private boolean fight;

    public Arena() {
        this.backgroundPane = new Pane();
        this.gridPane = new GridPane();
        this.c1 = new Pane();
        this.c1Profile = new ImageView();
        this.c1HealthBackground = new Rectangle();
        this.c1ManaBackground = new Rectangle();
        this.c2 = new Pane();
        this.c2Profile = new ImageView();
        this.c2HealthBackground = new Rectangle();
        this.c2ManaBackground = new Rectangle();
        this.c3 = new Pane();
        this.c3Profile = new ImageView();
        this.c3HealthBackground = new Rectangle();
        this.c3ManaBackground = new Rectangle();
        this.c4 = new Pane();
        this.c4Profile = new ImageView();
        this.c4HealthBackground = new Rectangle();
        this.c4ManaBackground = new Rectangle();
        this.c5 = new Pane();
        this.c5Profile = new ImageView();
        this.c5HealthBackground = new Rectangle();
        this.c5ManaBackground = new Rectangle();
        this.c6 = new Pane();
        this.c6Profile = new ImageView();
        this.c6HealthBackground = new Rectangle();
        this.c6ManaBackground = new Rectangle();
        this.c7 = new Pane();
        this.c7Profile = new ImageView();
        this.c7HealthBackground = new Rectangle();
        this.c7ManaBackground = new Rectangle();
        this.c8 = new Pane();
        this.c8Profile = new ImageView();
        this.c8HealthBackground = new Rectangle();
        this.c8ManaBackground = new Rectangle();
        this.middleRectangle = new Rectangle();
        this.middlePane = new Pane();
        this.fieldImageView = new ImageView();
        this.bottomRectangle = new Rectangle();
        this.gameOverPane = new Pane();
        this.gameOver = new Text();
        this.continueButton = new Button();

        panes = new Pane[]{c1, c2, c3, c4, c5, c6, c7, c8};
        imageViews = new ImageView[]{c1Profile, c2Profile, c3Profile, c4Profile, c5Profile, c6Profile, c7Profile, c8Profile};
        healthRectangles = new Rectangle[]{c1HealthBackground, c2HealthBackground, c3HealthBackground, c4HealthBackground, c5HealthBackground, c6HealthBackground, c7HealthBackground, c8HealthBackground};
        manaRectangles = new Rectangle[]{c1ManaBackground, c2ManaBackground, c3ManaBackground, c4ManaBackground, c5ManaBackground, c6ManaBackground, c7ManaBackground, c8ManaBackground};

        this.fight = true;

        this.draw();

        new Thread(() -> {
            Runnable update = new Runnable() {
                @Override
                public void run() {
                    if (!fight) {
                        return;
                    }

                    for (int x = SkillList.getSkillList().size() - 1; x >= 0; x--) {
                        if (!SkillList.getSkillList().get(x).isDead()) {
                            for (int y = 0; y < PlayerList.getPlayerNumber(); y++) {
                                if (SkillList.getSkillList().get(x).checkHit(PlayerList.getPlayerList().get(y))) {
                                    SkillList.getSkillList().get(x).hitView();
                                }
                            }
                        }

                        SkillList.getSkillList().get(x).update();
                        if (SkillList.getSkillList().get(x).isAbsoluteDead()) {
                            remove(SkillList.getSkillList().get(x));
                            SkillList.getSkillList().remove(x);
                        }
                    }

                    for (int x = 0; x < PlayerList.getPlayerNumber(); x++) {
                        PlayerList.getPlayerList().get(x).movement();
                    }

                    for (int x = 0; x < PlayerList.getPlayerNumber(); x++) {
                        HMBarList.getHmBarList().get(x).update();
                        PlayerList.getPlayerList().get(x).playerUpdate();
                        PlayerList.getPlayerList().get(x).characterUpdate();
                    }

                    if (gameOver()) {
                        fight = false;
                        gameOverPane.setVisible(true);
                        gameOverPane.setDisable(false);

                        continueButton.setOnMouseClicked(e -> {
                            gameOverPane.setVisible(false);
                            gameOverPane.setDisable(true);
                            backgroundPane.getChildren().clear();
                            SceneManager.setMenu();
                        });
                    }
                }
            };
            while (true) {
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Platform.runLater(update);
            }
        }).start();
    }

    public static Arena getInstance() {
        return instance;
    }

    public static void setInstance(Arena instance) {
        Arena.instance = instance;
    }

    public void draw() {
        this.backgroundPane.setPrefWidth(800);
        this.backgroundPane.setPrefHeight(550);
        this.backgroundPane.setLayoutX(0);
        this.backgroundPane.setLayoutY(0);
        this.backgroundPane.setStyle("-fx-background-color: #000000");
        this.backgroundPane.getChildren().addAll(gridPane, middleRectangle, middlePane, bottomRectangle, gameOverPane);
        this.initCharacterPane();
        gridPane.setVisible(true);
        middleRectangle.setVisible(true);
        middlePane.setVisible(true);
        bottomRectangle.setVisible(true);
        gridPane.setPrefWidth(800);
        gridPane.setPrefHeight(106);
        gridPane.setLayoutX(0);
        gridPane.setLayoutY(0);
        gridPane.add(c1, 0, 0);
        gridPane.add(c2, 1, 0);
        gridPane.add(c3, 2, 0);
        gridPane.add(c4, 3, 0);
        gridPane.add(c5, 0, 1);
        gridPane.add(c6, 1, 1);
        gridPane.add(c7, 2, 1);
        gridPane.add(c8, 3, 1);
        this.middleRectangle.setFill(Color.BLACK);
        this.middleRectangle.setStroke(Color.BLACK);
        this.middleRectangle.setWidth(800);
        this.middleRectangle.setHeight(20);
        this.middleRectangle.setLayoutX(0);
        this.middleRectangle.setLayoutY(106);
        this.middlePane.setPrefWidth(800);
        this.middlePane.setPrefHeight(389);
        this.middlePane.setLayoutX(0);
        this.middlePane.setLayoutY(126);
        this.middlePane.getChildren().add(fieldImageView);
        this.fieldImageView.setFitWidth(800);
        this.fieldImageView.setFitHeight(397);
        this.fieldImageView.setLayoutX(3);
        this.fieldImageView.setLayoutY(0);
        this.fieldImageView.setImage(new Image(new File("res" + File.separator + "Background" + File.separator + "back05.jpg").toURI().toString()));
        this.bottomRectangle.setFill(Color.BLACK);
        this.bottomRectangle.setStroke(Color.BLACK);
        this.bottomRectangle.setWidth(800);
        this.bottomRectangle.setHeight(35);
        this.bottomRectangle.setLayoutX(0);
        this.bottomRectangle.setLayoutY(515);

        this.gameOverPane.setVisible(false);
        this.gameOverPane.setDisable(true);
        this.gameOverPane.getChildren().addAll(gameOver, continueButton);
        this.gameOverPane.setStyle("-fx-background-color: #2f488d");
        this.gameOverPane.setPrefWidth(462);
        this.gameOverPane.setPrefHeight(230);
        this.gameOverPane.setLayoutX(168);
        this.gameOverPane.setLayoutY(190);
        this.gameOver.setText("Game Over");
        this.gameOver.setFont(Font.font(53));
        this.gameOver.setFill(Color.WHITE);
        this.gameOver.setLayoutX(90);
        this.gameOver.setLayoutY(115);
        this.continueButton.setText("Continue");
        this.continueButton.setTextFill(Color.WHITE);
        this.continueButton.setStyle("-fx-background-color: #122564");
        this.continueButton.setLayoutX(341);
        this.continueButton.setLayoutY(174);
    }

    public Pane[] getPanes() {
        return panes;
    }

    public void setPanes(Pane[] panes) {
        this.panes = panes;
    }

    public ImageView[] getImageViews() {
        return imageViews;
    }

    public void setImageViews(ImageView[] imageViews) {
        this.imageViews = imageViews;
    }

    public void resetArena() {
        backgroundPane.getChildren().clear();
        middlePane.getChildren().clear();
        middlePane.getChildren().add(fieldImageView);
        backgroundPane.getChildren().addAll(gridPane, middleRectangle, middlePane, bottomRectangle, gameOverPane);
        for (int x = 0; x < 7; x++) {
            panes[x].getChildren().clear();
            imageViews[x].setImage(null);
            panes[x].getChildren().addAll(imageViews[x], healthRectangles[x], manaRectangles[x]);
        }
        for (int x = 0; x < PlayerList.getPlayerNumber(); x++) {
            panes[x].getChildren().addAll(HMBarList.getHmBarList().get(x).getHealth(), HMBarList.getHmBarList().get(x).getMana());
            imageViews[x].setImage(PlayerList.getPlayerList().get(x).getCharacter().getProfile());
        }
        middlePane.getChildren().addAll(PlayerList.getPlayerList());
        this.fight = true;
    }

    public Pane getBackgroundPane() {
        return this.backgroundPane;
    }

    public void setBackgroundPane(Pane backgroundPane) {
        this.backgroundPane = backgroundPane;
    }

    public void add(Node node) {
        this.middlePane.getChildren().add(node);
    }

    public void remove(Node node) {
        this.middlePane.getChildren().remove(node);
    }

    public void initCharacterPane() {
        for (int x = 0; x < 8; x++) {
            panes[x].setPrefWidth(200);
            panes[x].setPrefHeight(53);
            panes[x].setStyle("-fx-background-color:  #2f488d");
            panes[x].getChildren().addAll(imageViews[x], healthRectangles[x], manaRectangles[x]);
            imageViews[x].setFitWidth(40);
            imageViews[x].setFitHeight(45);
            imageViews[x].setLayoutX(14);
            imageViews[x].setLayoutY(4);
            healthRectangles[x].setFill(Paint.valueOf("#2f488d"));
            healthRectangles[x].setStroke(Paint.valueOf("#40609d"));
            healthRectangles[x].setWidth(130);
            healthRectangles[x].setHeight(14);
            healthRectangles[x].setLayoutX(58);
            healthRectangles[x].setLayoutY(9.5);
            manaRectangles[x].setFill(Paint.valueOf("#2f488d"));
            manaRectangles[x].setStroke(Paint.valueOf("#40609d"));
            manaRectangles[x].setWidth(130);
            manaRectangles[x].setHeight(14);
            manaRectangles[x].setLayoutX(58);
            manaRectangles[x].setLayoutY(30.5);
        }
    }

    public boolean gameOver() {
        TreeSet<Integer> team = new TreeSet<>();
        for (int x = 0; x < PlayerList.getPlayerList().size(); x++) {
            if (!PlayerList.getPlayerList().get(x).getCharacterStatus().equals(CharacterStatus.DEAD)) {
                team.add(PlayerList.getPlayerList().get(x).getTeam());
            }
        }
        if (team.contains(PlayerList.getPlayerList().get(0).getTeam()) && team.size() == 1) {
            return true;
        }
        if (PlayerList.getPlayerList().get(0).getCharacterStatus().equals(CharacterStatus.DEAD)) {
            return true;
        }
        return false;
    }


    public void addKey(KeyCode keycode) {
        KeyCodeSet.add(keycode);
    }

    public void removeKey(KeyCode keyCode) {
        KeyCodeSet.remove(keyCode);
    }

    public GridPane getGridPane() {
        return gridPane;
    }

    public void setGridPane(GridPane gridPane) {
        this.gridPane = gridPane;
    }

    public Pane getC1() {
        return c1;
    }

    public void setC1(Pane c1) {
        this.c1 = c1;
    }

    public ImageView getC1Profile() {
        return c1Profile;
    }

    public void setC1Profile(ImageView c1Profile) {
        this.c1Profile = c1Profile;
    }

    public Rectangle getC1HealthBackground() {
        return c1HealthBackground;
    }

    public void setC1HealthBackground(Rectangle c1HealthBackground) {
        this.c1HealthBackground = c1HealthBackground;
    }

    public Rectangle getC1ManaBackground() {
        return c1ManaBackground;
    }

    public void setC1ManaBackground(Rectangle c1ManaBackground) {
        this.c1ManaBackground = c1ManaBackground;
    }

    public Pane getC2() {
        return c2;
    }

    public void setC2(Pane c2) {
        this.c2 = c2;
    }

    public ImageView getC2Profile() {
        return c2Profile;
    }

    public void setC2Profile(ImageView c2Profile) {
        this.c2Profile = c2Profile;
    }

    public Rectangle getC2HealthBackground() {
        return c2HealthBackground;
    }

    public void setC2HealthBackground(Rectangle c2HealthBackground) {
        this.c2HealthBackground = c2HealthBackground;
    }

    public Rectangle getC2ManaBackground() {
        return c2ManaBackground;
    }

    public void setC2ManaBackground(Rectangle c2ManaBackground) {
        this.c2ManaBackground = c2ManaBackground;
    }

    public Pane getC3() {
        return c3;
    }

    public void setC3(Pane c3) {
        this.c3 = c3;
    }

    public ImageView getC3Profile() {
        return c3Profile;
    }

    public void setC3Profile(ImageView c3Profile) {
        this.c3Profile = c3Profile;
    }

    public Rectangle getC3HealthBackground() {
        return c3HealthBackground;
    }

    public void setC3HealthBackground(Rectangle c3HealthBackground) {
        this.c3HealthBackground = c3HealthBackground;
    }

    public Rectangle getC3ManaBackground() {
        return c3ManaBackground;
    }

    public void setC3ManaBackground(Rectangle c3ManaBackground) {
        this.c3ManaBackground = c3ManaBackground;
    }

    public Pane getC4() {
        return c4;
    }

    public void setC4(Pane c4) {
        this.c4 = c4;
    }

    public ImageView getC4Profile() {
        return c4Profile;
    }

    public void setC4Profile(ImageView c4Profile) {
        this.c4Profile = c4Profile;
    }

    public Rectangle getC4HealthBackground() {
        return c4HealthBackground;
    }

    public void setC4HealthBackground(Rectangle c4HealthBackground) {
        this.c4HealthBackground = c4HealthBackground;
    }

    public Rectangle getC4ManaBackground() {
        return c4ManaBackground;
    }

    public void setC4ManaBackground(Rectangle c4ManaBackground) {
        this.c4ManaBackground = c4ManaBackground;
    }

    public Pane getC5() {
        return c5;
    }

    public void setC5(Pane c5) {
        this.c5 = c5;
    }

    public ImageView getC5Profile() {
        return c5Profile;
    }

    public void setC5Profile(ImageView c5Profile) {
        this.c5Profile = c5Profile;
    }

    public Rectangle getC5HealthBackground() {
        return c5HealthBackground;
    }

    public void setC5HealthBackground(Rectangle c5HealthBackground) {
        this.c5HealthBackground = c5HealthBackground;
    }

    public Rectangle getC5ManaBackground() {
        return c5ManaBackground;
    }

    public void setC5ManaBackground(Rectangle c5ManaBackground) {
        this.c5ManaBackground = c5ManaBackground;
    }

    public Pane getC6() {
        return c6;
    }

    public void setC6(Pane c6) {
        this.c6 = c6;
    }

    public ImageView getC6Profile() {
        return c6Profile;
    }

    public void setC6Profile(ImageView c6Profile) {
        this.c6Profile = c6Profile;
    }

    public Rectangle getC6HealthBackground() {
        return c6HealthBackground;
    }

    public void setC6HealthBackground(Rectangle c6HealthBackground) {
        this.c6HealthBackground = c6HealthBackground;
    }

    public Rectangle getC6ManaBackground() {
        return c6ManaBackground;
    }

    public void setC6ManaBackground(Rectangle c6ManaBackground) {
        this.c6ManaBackground = c6ManaBackground;
    }

    public Pane getC7() {
        return c7;
    }

    public void setC7(Pane c7) {
        this.c7 = c7;
    }

    public ImageView getC7Profile() {
        return c7Profile;
    }

    public void setC7Profile(ImageView c7Profile) {
        this.c7Profile = c7Profile;
    }

    public Rectangle getC7HealthBackground() {
        return c7HealthBackground;
    }

    public void setC7HealthBackground(Rectangle c7HealthBackground) {
        this.c7HealthBackground = c7HealthBackground;
    }

    public Rectangle getC7ManaBackground() {
        return c7ManaBackground;
    }

    public void setC7ManaBackground(Rectangle c7ManaBackground) {
        this.c7ManaBackground = c7ManaBackground;
    }

    public Pane getC8() {
        return c8;
    }

    public void setC8(Pane c8) {
        this.c8 = c8;
    }

    public ImageView getC8Profile() {
        return c8Profile;
    }

    public void setC8Profile(ImageView c8Profile) {
        this.c8Profile = c8Profile;
    }

    public Rectangle getC8HealthBackground() {
        return c8HealthBackground;
    }

    public void setC8HealthBackground(Rectangle c8HealthBackground) {
        this.c8HealthBackground = c8HealthBackground;
    }

    public Rectangle getC8ManaBackground() {
        return c8ManaBackground;
    }

    public void setC8ManaBackground(Rectangle c8ManaBackground) {
        this.c8ManaBackground = c8ManaBackground;
    }

    public Rectangle getMiddleRectangle() {
        return middleRectangle;
    }

    public void setMiddleRectangle(Rectangle middleRectangle) {
        this.middleRectangle = middleRectangle;
    }

    public Pane getMiddlePane() {
        return middlePane;
    }

    public void setMiddlePane(Pane middlePane) {
        this.middlePane = middlePane;
    }

    public ImageView getFieldImageView() {
        return fieldImageView;
    }

    public void setFieldImageView(ImageView fieldImageView) {
        this.fieldImageView = fieldImageView;
    }

    public Rectangle getBottomRectangle() {
        return bottomRectangle;
    }

    public void setBottomRectangle(Rectangle bottomRectangle) {
        this.bottomRectangle = bottomRectangle;
    }

    public Rectangle[] getHealthRectangles() {
        return healthRectangles;
    }

    public void setHealthRectangles(Rectangle[] healthRectangles) {
        this.healthRectangles = healthRectangles;
    }

    public Rectangle[] getManaRectangles() {
        return manaRectangles;
    }

    public void setManaRectangles(Rectangle[] manaRectangles) {
        this.manaRectangles = manaRectangles;
    }
}
