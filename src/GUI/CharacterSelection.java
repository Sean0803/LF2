package GUI;

import Control.KeyControl;
import GameObject.CharacterList;
import GameObject.TeamList;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import java.io.File;


public class CharacterSelection {

    private static CharacterSelection instance;
    private Pane root;
    private Pane boxPane;
    private Pane cptNumberPane;
    private Pane ctrlPane;
    private Pane exitPane;

    // boxPane
    private Label title;

    private Pane c1;
    private ImageView c1Image;
    private Button c1Player;
    private Button c1Fighter;
    private Button c1Team;

    private Pane c2;
    private ImageView c2Image;
    private Button c2Player;
    private Button c2Fighter;
    private Button c2Team;

    private Pane c3;
    private ImageView c3Image;
    private Button c3Player;
    private Button c3Fighter;
    private Button c3Team;

    private Pane c4;
    private ImageView c4Image;
    private Button c4Player;
    private Button c4Fighter;
    private Button c4Team;

    private Pane c5;
    private ImageView c5Image;
    private Button c5Player;
    private Button c5Fighter;
    private Button c5Team;

    private Pane c6;
    private ImageView c6Image;
    private Button c6Player;
    private Button c6Fighter;
    private Button c6Team;

    private Pane c7;
    private ImageView c7Image;
    private Button c7Player;
    private Button c7Fighter;
    private Button c7Team;

    private Pane c8;
    private ImageView c8Image;
    private Button c8Player;
    private Button c8Fighter;
    private Button c8Team;

    private Pane[] characterPane;
    private ImageView[] imageViews;
    private Button[] playerButton;
    private Button[] fighterButton;
    private Button[] teamButton;

    private Rectangle playerRectangle1;
    private Label player1;
    private Rectangle fighterRectangle1;
    private Label fighter1;
    private Rectangle teamRectangle1;
    private Label team1;
    private Rectangle joint11;
    private Rectangle joint12;
    private Rectangle joint13;
    private Rectangle joint21;
    private Rectangle joint22;
    private Rectangle joint23;
    private Rectangle joint31;
    private Rectangle joint32;
    private Rectangle joint33;

    private Rectangle playerRectangle2;
    private Label player2;
    private Rectangle fighterRectangle2;
    private Label fighter2;
    private Rectangle teamRectangle2;
    private Label team2;
    private Rectangle joint14;
    private Rectangle joint15;
    private Rectangle joint16;
    private Rectangle joint24;
    private Rectangle joint25;
    private Rectangle joint26;
    private Rectangle joint34;
    private Rectangle joint35;
    private Rectangle joint36;

    private Rectangle[] joints;

    // cptNumberPane
    private Pane innerCptNumberPane;
    private Label cptNumberTitle;
    private Button p0Btn;
    private Button p1Btn;
    private Button p2Btn;
    private Button p3Btn;
    private Button p4Btn;
    private Button p5Btn;
    private Button p6Btn;
    private Button p7Btn;

    // ctrlPane
    private Pane innerCtrlPane;
    private Button fightBtn;
    private Button resetBtn;
    private Button exitBtn;
    private Rectangle fightBorder;
    private Rectangle resetBorder;
    private Rectangle exitBorder;

    // exitPane
    Text exitPaneText;
    Button yesBtn;
    Button noBtn;

    // field variable
    private int computerNumber;
    private int attackCount;
    private int characterIndex;
    private int teamIndex;
    private int[] teams;
    private Button[] playerButtons;

    public CharacterSelection() {
        this.root = new Pane();
        this.boxPane = new Pane();
        this.cptNumberPane = new Pane();
        this.ctrlPane = new Pane();
        this.exitPane = new Pane();

        // boxPane
        this.title = new Label();

        this.c1 = new Pane();
        this.c1Image = new ImageView();
        this.c1Player = new Button();
        this.c1Fighter = new Button();
        this.c1Team = new Button();

        this.c2 = new Pane();
        this.c2Image = new ImageView();
        this.c2Player = new Button();
        this.c2Fighter = new Button();
        this.c2Team = new Button();

        this.c3 = new Pane();
        this.c3Image = new ImageView();
        this.c3Player = new Button();
        this.c3Fighter = new Button();
        this.c3Team = new Button();

        this.c4 = new Pane();
        this.c4Image = new ImageView();
        this.c4Player = new Button();
        this.c4Fighter = new Button();
        this.c4Team = new Button();

        this.c5 = new Pane();
        this.c5Image = new ImageView();
        this.c5Player = new Button();
        this.c5Fighter = new Button();
        this.c5Team = new Button();

        this.c6 = new Pane();
        this.c6Image = new ImageView();
        this.c6Player = new Button();
        this.c6Fighter = new Button();
        this.c6Team = new Button();

        this.c7 = new Pane();
        this.c7Image = new ImageView();
        this.c7Player = new Button();
        this.c7Fighter = new Button();
        this.c7Team = new Button();

        this.c8 = new Pane();
        this.c8Image = new ImageView();
        this.c8Player = new Button();
        this.c8Fighter = new Button();
        this.c8Team = new Button();

        this.characterPane = new Pane[]{c2, c3, c4, c6, c7, c8};
        this.imageViews = new ImageView[]{c2Image, c3Image, c4Image, c6Image, c7Image, c8Image};
        this.playerButton = new Button[]{c2Player, c3Player, c4Player, c6Player, c7Player, c8Player};
        this.fighterButton = new Button[]{c2Fighter, c3Fighter, c4Fighter, c6Fighter, c7Fighter, c8Fighter};
        this.teamButton = new Button[]{c2Team, c3Team, c4Team, c6Team, c7Team, c8Team};


        this.playerRectangle1 = new Rectangle();
        this.player1 = new Label();
        this.fighterRectangle1 = new Rectangle();
        this.fighter1 = new Label();
        this.teamRectangle1 = new Rectangle();
        this.team1 = new Label();
        this.joint11 = new Rectangle();
        this.joint12 = new Rectangle();
        this.joint13 = new Rectangle();
        this.joint21 = new Rectangle();
        this.joint22 = new Rectangle();
        this.joint23 = new Rectangle();
        this.joint31 = new Rectangle();
        this.joint32 = new Rectangle();
        this.joint33 = new Rectangle();

        this.playerRectangle2 = new Rectangle();
        this.player2 = new Label();
        this.fighterRectangle2 = new Rectangle();
        this.fighter2 = new Label();
        this.teamRectangle2 = new Rectangle();
        this.team2 = new Label();
        this.joint14 = new Rectangle();
        this.joint15 = new Rectangle();
        this.joint16 = new Rectangle();
        this.joint24 = new Rectangle();
        this.joint25 = new Rectangle();
        this.joint26 = new Rectangle();
        this.joint34 = new Rectangle();
        this.joint35 = new Rectangle();
        this.joint36 = new Rectangle();

        this.joints = new Rectangle[]{joint11, joint12, joint13, joint21,
                joint22, joint23, joint31, joint32, joint33, joint14, joint15, joint16,
                joint24, joint25, joint26, joint34, joint35, joint36};

        // cptNumberPane
        this.innerCptNumberPane = new Pane();
        this.cptNumberTitle = new Label();
        this.p0Btn = new Button();
        this.p1Btn = new Button();
        this.p2Btn = new Button();
        this.p3Btn = new Button();
        this.p4Btn = new Button();
        this.p5Btn = new Button();
        this.p6Btn = new Button();
        this.p7Btn = new Button();

        // ctrlPane
        this.innerCtrlPane = new Pane();
        this.fightBtn = new Button();
        this.resetBtn = new Button();
        this.exitBtn = new Button();
        this.fightBorder = new Rectangle();
        this.resetBorder = new Rectangle();
        this.exitBorder = new Rectangle();

        this.exitPaneText = new Text();
        this.yesBtn = new Button();
        this.noBtn = new Button();

        // field variable
        this.computerNumber = 0;
        this.attackCount = 0;
        this.characterIndex = 0;
        this.teamIndex = 0;
        this.teams = new int[]{1, 2, 3, 4, 5};
        this.playerButtons = new Button[]{c2Player, c3Player, c4Player, c5Player, c6Player, c7Player, c8Player};

        c1Image.setImage(new Image(new File("res" + File.separator + "Characters" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c2Image.setImage(new Image(new File("res" + File.separator + "Characters" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c3Image.setImage(new Image(new File("res" + File.separator + "Characters" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c4Image.setImage(new Image(new File("res" + File.separator + "Characters" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c5Image.setImage(new Image(new File("res" + File.separator + "Characters" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c6Image.setImage(new Image(new File("res" + File.separator + "Characters" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c7Image.setImage(new Image(new File("res" + File.separator + "Characters" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c8Image.setImage(new Image(new File("res" + File.separator + "Characters" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));

        this.draw();

        root.setOnKeyPressed(keyEvent -> {
                if (keyEvent.getCode().equals(KeyCode.ESCAPE)) {
                    exitPane.setDisable(false);
                    exitPane.setVisible(true);
                }
                if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 0) {
                    attackCount++;
                    c1Image.setImage(CharacterList.characters[0].getCharacterSelection());
                    c1Player.setText("1");
                    c1Fighter.setText(CharacterList.characters[0].getName());
                }
        });

        c1.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 1) {
                this.changeCharacter(-1);
                c1Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                c1Fighter.setText(CharacterList.characters[characterIndex].getName());
            } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 1) {
                this.changeCharacter(1);
                c1Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                c1Fighter.setText(CharacterList.characters[characterIndex].getName());
            } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 1) {
                this.attackCount++;
                c2Image.setImage(new Image(new File("res" + File.separator + "Characters" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
                c3Image.setImage(new Image(new File("res" + File.separator + "Characters" + File.separator +  "CharacterSelection" + File.separator + "black.png").toURI().toString()));
                c4Image.setImage(new Image(new File("res" + File.separator +  "Characters" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
                c5Image.setImage(new Image(new File("res" + File.separator +  "Characters" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
                c6Image.setImage(new Image(new File("res" + File.separator +  "Characters" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
                c7Image.setImage(new Image(new File("res" + File.separator +  "Characters" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
                c8Image.setImage(new Image(new File("res" + File.separator +  "Characters" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
                c2Player.setText("-");
                c3Player.setText("-");
                c4Player.setText("-");
                c5Player.setText("-");
                c6Player.setText("-");
                c7Player.setText("-");
                c8Player.setText("-");
                CharacterList.add(CharacterList.characters[characterIndex]);
                this.characterIndex = 0;
                c1Team.setText("Team " + teams[teamIndex]);
            } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 2) {
                this.changeTeam(-1);
                c1Team.setText("Team " + teams[teamIndex]);
            } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 2) {
                this.changeTeam(1);
                c1Team.setText("Team " + teams[teamIndex]);
            } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 2) {
                this.attackCount++;
                TeamList.add(teams[teamIndex]);
                this.teamIndex = 0;
                cptNumberPane.setDisable(false);
                cptNumberPane.setVisible(true);
                c1.setDisable(true);
                boxPane.setDisable(true);
            }
        });

        p1Btn.setOnKeyPressed(keyEvent -> {
            p1Btn.setStyle("-fx-border-color:  #122564; -fx-background-color: #122564");
            p1Btn.setDisable(true);

            if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
                this.attackCount++;
                this.computerNumber = 1;
                boxPane.setDisable(false);
                c2.setDisable(false);
                c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
                c2Fighter.setText(CharacterList.characters[0].getName());
                cptNumberPane.setDisable(true);
                cptNumberPane.setVisible(false);
                for (int x = 0; x < computerNumber; x++) {
                    playerButtons[x].setStyle("-fx-text-fill: #ff9b9b; -fx-background-color: #000000");
                    playerButtons[x].setText("Computer");
                }
            } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 3) {
                p7Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p7Btn.setDisable(false);
            } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 3) {
                p2Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p2Btn.setDisable(false);
            } else {
                p1Btn.setStyle("-fx-border-color:  #ffffff; -fx-background-color: #122564");
                p1Btn.setDisable(false);
            }
        });

        p2Btn.setOnKeyPressed(keyEvent -> {
            p2Btn.setStyle("-fx-border-color: #122564; -fx-background-color: #122564");
            p2Btn.setDisable(true);

            if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
                this.attackCount++;
                this.computerNumber = 2;
                boxPane.setDisable(false);
                c2.setDisable(false);
                c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
                c2Fighter.setText(CharacterList.characters[0].getName());
                cptNumberPane.setDisable(true);
                cptNumberPane.setVisible(false);
                for (int x = 0; x < computerNumber; x++) {
                    playerButtons[x].setStyle("-fx-text-fill: #ff9b9b; -fx-background-color: #000000");
                    playerButtons[x].setText("Computer");
                }
            } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 3) {
                p1Btn.setDisable(false);
                p1Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
            } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 3) {
                p3Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p3Btn.setDisable(false);
            } else {
                p2Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p2Btn.setDisable(false);
            }
        });

        p3Btn.setOnKeyPressed(keyEvent -> {
            p3Btn.setStyle("-fx-border-color: #122564; -fx-background-color: #122564");
            p3Btn.setDisable(true);

            if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
                this.attackCount++;
                this.computerNumber = 3;
                boxPane.setDisable(false);
                c2.setDisable(false);
                c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
                c2Fighter.setText(CharacterList.characters[0].getName());
                cptNumberPane.setDisable(true);
                cptNumberPane.setVisible(false);
                for (int x = 0; x < computerNumber; x++) {
                    playerButtons[x].setStyle("-fx-text-fill: #ff9b9b; -fx-background-color: #000000");
                    playerButtons[x].setText("Computer");
                }
            } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 3) {
                p2Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p2Btn.setDisable(false);
            } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 3) {
                p4Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p4Btn.setDisable(false);
            } else {
                p3Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p3Btn.setDisable(false);
            }
        });

        p4Btn.setOnKeyPressed(keyEvent -> {
            p4Btn.setStyle("-fx-border-color: #122564; -fx-background-color: #122564");
            p4Btn.setDisable(true);

            if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
                this.attackCount++;
                this.computerNumber = 4;
                boxPane.setDisable(false);
                c2.setDisable(false);
                c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
                c2Fighter.setText(CharacterList.characters[0].getName());
                cptNumberPane.setDisable(true);
                cptNumberPane.setVisible(false);
                for (int x = 0; x < computerNumber; x++) {
                    playerButtons[x].setStyle("-fx-text-fill: #ff9b9b; -fx-background-color: #000000");
                    playerButtons[x].setText("Computer");
                }
            } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 3) {
                p3Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p3Btn.setDisable(false);
            } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 3) {
                p5Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p5Btn.setDisable(false);
            } else {
                p4Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p4Btn.setDisable(false);
            }
        });

        p5Btn.setOnKeyPressed(keyEvent -> {
            p5Btn.setStyle("-fx-border-color: #122564; -fx-background-color: #122564");
            p5Btn.setDisable(true);

            if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
                this.attackCount++;
                this.computerNumber = 5;
                boxPane.setDisable(false);
                c2.setDisable(false);
                c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
                c2Fighter.setText(CharacterList.characters[0].getName());
                cptNumberPane.setDisable(true);
                cptNumberPane.setVisible(false);
                for (int x = 0; x < computerNumber; x++) {
                    playerButtons[x].setStyle("-fx-text-fill: #ff9b9b; -fx-background-color: #000000");
                    playerButtons[x].setText("Computer");
                }
            } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 3) {
                p4Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p4Btn.setDisable(false);
            } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 3) {
                p6Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p6Btn.setDisable(false);
            } else {
                p5Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p5Btn.setDisable(false);
            }
        });

        p6Btn.setOnKeyPressed(keyEvent -> {
            p6Btn.setStyle("-fx-border-color: #122564; -fx-background-color: #122564");
            p6Btn.setDisable(true);

            if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
                this.attackCount++;
                this.computerNumber = 6;
                boxPane.setDisable(false);
                c2.setDisable(false);
                c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
                c2Fighter.setText(CharacterList.characters[0].getName());
                cptNumberPane.setDisable(true);
                cptNumberPane.setVisible(false);
                for (int x = 0; x < computerNumber; x++) {
                    playerButtons[x].setStyle("-fx-text-fill: #ff9b9b; -fx-background-color: #000000");
                    playerButtons[x].setText("Computer");
                }
            } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 3) {
                p5Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p5Btn.setDisable(false);
            } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 3) {
                p7Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p7Btn.setDisable(false);
            } else {
                p6Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p6Btn.setDisable(false);
            }
        });

        p7Btn.setOnKeyPressed(keyEvent -> {
            p7Btn.setStyle("-fx-border-color: #122564; -fx-background-color: #122564");
            p7Btn.setDisable(true);

            if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
                this.attackCount++;
                this.computerNumber = 7;
                boxPane.setDisable(false);
                c2.setDisable(false);
                c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
                c2Fighter.setText(CharacterList.characters[0].getName());
                cptNumberPane.setDisable(true);
                cptNumberPane.setVisible(false);
                for (int x = 0; x < computerNumber; x++) {
                    playerButtons[x].setStyle("-fx-text-fill: #ff9b9b; -fx-background-color: #000000");
                    playerButtons[x].setText("Computer");
                }
            } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 3) {
                p6Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p6Btn.setDisable(false);
            } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 3) {
                p1Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p1Btn.setDisable(false);
            } else {
                p7Btn.setStyle("-fx-border-color: #ffffff; -fx-background-color: #122564");
                p7Btn.setDisable(false);
            }
        });

        c2.setOnKeyPressed(keyEvent -> {
            if (computerNumber >= 1) {
                if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 4) {
                    this.changeCharacter(-1);
                    c2Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c2Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 4) {
                    this.changeCharacter(1);
                    c2Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c2Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 4) {
                    this.attackCount++;
                    CharacterList.add(CharacterList.characters[characterIndex]);
                    if (computerNumber == 1 && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c2Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 5) {
                    this.changeTeam(-1);
                    if (computerNumber == 1 && teams[teamIndex] == TeamList.getTeamList().get(0))
                        this.changeTeam(-1);
                    c2Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 5) {
                    this.changeTeam(1);
                    if (computerNumber == 1 && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c2Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 5) {
                    this.attackCount++;
                    TeamList.add(teams[teamIndex]);
                    this.teamIndex = 0;
                    if (computerNumber == 1) {
                        this.boxPane.setDisable(true);
                        ctrlPane.setDisable(false);
                        ctrlPane.setVisible(true);
                    } else {
                        c2.setDisable(true);
                        c3.setDisable(false);
                        c3Image.setImage(CharacterList.characters[0].getCharacterSelection());
                        c3Fighter.setText(CharacterList.characters[0].getName());
                    }
                }
            }
        });

        c3.setOnKeyPressed(keyEvent -> {
            if (computerNumber >= 2) {
                if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 6) {
                    this.changeCharacter(-1);
                    c3Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c3Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 6) {
                    this.changeCharacter(1);
                    c3Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c3Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 6) {
                    this.attackCount++;
                    CharacterList.add(CharacterList.characters[characterIndex]);
                    if (computerNumber == 2 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1) && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c3Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 7) {
                    this.changeTeam(-1);
                    if (computerNumber == 2 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1) && teams[teamIndex] == TeamList.getTeamList().get(0))
                        this.changeTeam(-1);
                    c3Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 7) {
                    this.changeTeam(1);
                    if (computerNumber == 2 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1) && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c3Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 7) {
                    this.attackCount++;
                    TeamList.add(teams[teamIndex]);
                    this.teamIndex = 0;
                    if (computerNumber == 2) {
                        this.boxPane.setDisable(true);
                        ctrlPane.setDisable(false);
                        ctrlPane.setVisible(true);
                    } else {
                        c3.setDisable(true);
                        c4.setDisable(false);
                        c4Image.setImage(CharacterList.characters[0].getCharacterSelection());
                        c4Fighter.setText(CharacterList.characters[0].getName());
                    }
                }
            }
        });

        c4.setOnKeyPressed(keyEvent -> {
            if (computerNumber >= 3) {
                if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 8) {
                    this.changeCharacter(-1);
                    c4Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c4Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 8) {
                    this.changeCharacter(1);
                    c4Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c4Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 8) {
                    this.attackCount++;
                    CharacterList.add(CharacterList.characters[characterIndex]);
                    if (computerNumber == 3 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2) && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c4Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 9) {
                    this.changeTeam(-1);
                    if (computerNumber == 3 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2)  && teams[teamIndex] == TeamList.getTeamList().get(0))
                        this.changeTeam(-1);
                    c4Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 9) {
                    this.changeTeam(1);
                    if (computerNumber == 3 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2)  && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c4Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 9) {
                    this.attackCount++;
                    TeamList.add(teams[teamIndex]);
                    this.teamIndex = 0;
                    if (computerNumber == 3) {
                        this.boxPane.setDisable(true);
                        ctrlPane.setDisable(false);
                        ctrlPane.setVisible(true);
                    } else {
                        c4.setDisable(true);
                        c5.setDisable(false);
                        c5Image.setImage(CharacterList.characters[0].getCharacterSelection());
                        c5Fighter.setText(CharacterList.characters[0].getName());
                    }
                }
            }
        });

        c5.setOnKeyPressed(keyEvent -> {
            if (computerNumber >= 4) {
                if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 10) {
                    this.changeCharacter(-1);
                    c5Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c5Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 10) {
                    this.changeCharacter(1);
                    c5Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c5Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 10) {
                    this.attackCount++;
                    CharacterList.add(CharacterList.characters[characterIndex]);
                    if (computerNumber == 4 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1) && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2)
                            && TeamList.getTeamList().get(2) == TeamList.getTeamList().get(3) && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c5Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 11) {
                    this.changeTeam(-1);
                    if (computerNumber == 4 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2)
                            && TeamList.getTeamList().get(2) == TeamList.getTeamList().get(3) && teams[teamIndex] == TeamList.getTeamList().get(0))
                        this.changeTeam(-1);
                    c5Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 11) {
                    this.changeTeam(1);
                    if (computerNumber == 4 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2) && TeamList.getTeamList().get(2) == TeamList.getTeamList().get(3)
                            && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c5Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 11) {
                    this.attackCount++;
                    TeamList.add(teams[teamIndex]);
                    this.teamIndex = 0;
                    if (computerNumber == 4) {
                        this.boxPane.setDisable(true);
                        ctrlPane.setDisable(false);
                        ctrlPane.setVisible(true);
                    } else {
                        c5.setDisable(true);
                        c6.setDisable(false);
                        c6Image.setImage(CharacterList.characters[0].getCharacterSelection());
                        c6Fighter.setText(CharacterList.characters[0].getName());
                    }
                }
            }
        });

        c6.setOnKeyPressed(keyEvent -> {
            if (computerNumber >= 5) {
                if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 12) {
                    this.changeCharacter(-1);
                    c6Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c6Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 12) {
                    this.changeCharacter(1);
                    c6Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c6Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 12) {
                    this.attackCount++;
                    CharacterList.add(CharacterList.characters[characterIndex]);
                    if (computerNumber == 5 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2) && TeamList.getTeamList().get(2) == TeamList.getTeamList().get(3)
                            && TeamList.getTeamList().get(3) == TeamList.getTeamList().get(4) && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c6Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 13) {
                    this.changeTeam(-1);
                    if (computerNumber == 5 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2) && TeamList.getTeamList().get(2) == TeamList.getTeamList().get(3)
                            && TeamList.getTeamList().get(3) == TeamList.getTeamList().get(4)&& teams[teamIndex] == TeamList.getTeamList().get(0))
                        this.changeTeam(-1);
                    c6Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 13) {
                    this.changeTeam(1);
                    if (computerNumber == 5 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2) && TeamList.getTeamList().get(2) == TeamList.getTeamList().get(3)
                            && TeamList.getTeamList().get(3) == TeamList.getTeamList().get(4) && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c6Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 13) {
                    this.attackCount++;
                    TeamList.add(teams[teamIndex]);
                    this.teamIndex = 0;
                    if (computerNumber == 5) {
                        this.boxPane.setDisable(true);
                        ctrlPane.setDisable(false);
                        ctrlPane.setVisible(true);
                    } else {
                        c6.setDisable(true);
                        c7.setDisable(false);
                        c7Image.setImage(CharacterList.characters[0].getCharacterSelection());
                        c7Fighter.setText(CharacterList.characters[0].getName());
                    }
                }
            }
        });

        c7.setOnKeyPressed(keyEvent -> {
            if (computerNumber >= 6) {
                if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 14) {
                    this.changeCharacter(-1);
                    c7Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c7Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 14) {
                    this.changeCharacter(1);
                    c7Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c7Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 14) {
                    this.attackCount++;
                    CharacterList.add(CharacterList.characters[characterIndex]);
                    if (computerNumber == 6 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2) && TeamList.getTeamList().get(2) == TeamList.getTeamList().get(3)
                            && TeamList.getTeamList().get(3) == TeamList.getTeamList().get(4) && TeamList.getTeamList().get(4) == TeamList.getTeamList().get(5)
                            && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c7Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 15) {
                    this.changeTeam(-1);
                    if (computerNumber == 6 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2) && TeamList.getTeamList().get(2) == TeamList.getTeamList().get(3)
                            && TeamList.getTeamList().get(3) == TeamList.getTeamList().get(4) && TeamList.getTeamList().get(4) == TeamList.getTeamList().get(5)
                            && teams[teamIndex] == TeamList.getTeamList().get(0))
                        this.changeTeam(-1);
                    c7Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 15) {
                    this.changeTeam(1);
                    if (computerNumber == 6 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2) && TeamList.getTeamList().get(2) == TeamList.getTeamList().get(3)
                            && TeamList.getTeamList().get(3) == TeamList.getTeamList().get(4) && TeamList.getTeamList().get(4) == TeamList.getTeamList().get(5)
                            && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c7Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 15) {
                    this.attackCount++;
                    TeamList.add(teams[teamIndex]);
                    this.teamIndex = 0;
                    if (computerNumber == 6) {
                        this.boxPane.setDisable(true);
                        ctrlPane.setDisable(false);
                        ctrlPane.setVisible(true);
                    } else {
                        c7.setDisable(true);
                        c8.setDisable(false);
                        c8Image.setImage(CharacterList.characters[0].getCharacterSelection());
                        c8Fighter.setText(CharacterList.characters[0].getName());
                    }
                }
            }
        });

        c8.setOnKeyPressed(keyEvent -> {
            if (computerNumber >= 7) {
                if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 16) {
                    this.changeCharacter(-1);
                    c8Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c8Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 16) {
                    this.changeCharacter(1);
                    c8Image.setImage(CharacterList.characters[characterIndex].getCharacterSelection());
                    c8Fighter.setText(CharacterList.characters[characterIndex].getName());
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 16) {
                    this.attackCount++;
                    CharacterList.add(CharacterList.characters[characterIndex]);
                    if (computerNumber == 7 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2) && TeamList.getTeamList().get(2) == TeamList.getTeamList().get(3)
                            && TeamList.getTeamList().get(3) == TeamList.getTeamList().get(4) && TeamList.getTeamList().get(4) == TeamList.getTeamList().get(5)
                            && TeamList.getTeamList().get(5) == TeamList.getTeamList().get(6) && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c8Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.LEFT.getCode()) && attackCount == 17) {
                    this.changeTeam(-1);
                    if (computerNumber == 7 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2) && TeamList.getTeamList().get(2) == TeamList.getTeamList().get(3)
                            && TeamList.getTeamList().get(3) == TeamList.getTeamList().get(4) && TeamList.getTeamList().get(4) == TeamList.getTeamList().get(5)
                            && TeamList.getTeamList().get(5) == TeamList.getTeamList().get(6) && teams[teamIndex] == TeamList.getTeamList().get(0))
                        this.changeTeam(-1);
                    c8Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.RIGHT.getCode()) && attackCount == 17) {
                    this.changeTeam(1);
                    if (computerNumber == 7 && TeamList.getTeamList().get(0) == TeamList.getTeamList().get(1)
                            && TeamList.getTeamList().get(1) == TeamList.getTeamList().get(2) && TeamList.getTeamList().get(2) == TeamList.getTeamList().get(3)
                            && TeamList.getTeamList().get(3) == TeamList.getTeamList().get(4) && TeamList.getTeamList().get(4) == TeamList.getTeamList().get(5)
                            && TeamList.getTeamList().get(5) == TeamList.getTeamList().get(6) && teams[teamIndex] == TeamList.getTeamList().get(0)) {
                        changeTeam(1);
                    }
                    c8Team.setText("Team" + teams[teamIndex]);
                } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 17) {
                    this.attackCount++;
                    TeamList.add(teams[teamIndex]);
                    this.teamIndex = 0;
                    this.boxPane.setDisable(true);
                    ctrlPane.setDisable(false);
                    ctrlPane.setVisible(true);
                }
            }
        });

        fightBtn.setOnKeyPressed(keyEvent -> {
            fightBorder.setVisible(false);
            fightBtn.setDisable(true);

            if (keyEvent.getCode().equals(KeyControl.UP.getCode())) {
                exitBorder.setVisible(true);
                exitBtn.setDisable(false);
            } else if (keyEvent.getCode().equals(KeyControl.DOWN.getCode())) {
                resetBorder.setVisible(true);
                resetBtn.setDisable(false);
            } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode())) {
                SceneManager.setVSMode();
            } else {
                fightBorder.setVisible(true);
                fightBtn.setDisable(false);
            }
        });

        resetBtn.setOnKeyPressed(keyEvent -> {
            resetBorder.setVisible(false);
            resetBtn.setDisable(true);

            if (keyEvent.getCode().equals(KeyControl.UP.getCode())) {
                fightBorder.setVisible(true);
                fightBtn.setDisable(false);
            } else if (keyEvent.getCode().equals(KeyControl.DOWN.getCode())) {
                exitBorder.setVisible(true);
                exitBtn.setDisable(false);
            } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode())) {
                SceneManager.setVSModeCharacterSelection();
            } else {
                resetBorder.setVisible(true);
                resetBtn.setDisable(false);
            }
        });

        exitBtn.setOnKeyPressed(keyEvent -> {
            exitBorder.setVisible(false);
            exitBtn.setDisable(true);

            if (keyEvent.getCode().equals(KeyControl.UP.getCode())) {
                resetBorder.setVisible(true);
                resetBtn.setDisable(false);
            } else if (keyEvent.getCode().equals(KeyControl.DOWN.getCode())) {
                fightBorder.setVisible(true);
                fightBtn.setDisable(false);
            } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode())) {
                SceneManager.setMenu();
            } else {
                exitBorder.setVisible(true);
                exitBtn.setDisable(false);
            }
        });

        yesBtn.setOnMouseClicked(e -> {
            Platform.exit();
        });

        noBtn.setOnMouseClicked(e -> {
            exitPane.setDisable(true);
            exitPane.setVisible(false);
        });
    }

    public static CharacterSelection getInstance() {
        if (instance == null) {
            instance = new CharacterSelection();
        }
        return instance;
    }

    public void draw() {
        root.getChildren().addAll(boxPane, cptNumberPane, ctrlPane, exitPane);
        root.setStyle("-fx-background-color: #000000");
        root.setMinWidth(800);
        root.setMinHeight(550);
        root.setPrefWidth(800);
        root.setPrefHeight(550);
        root.setMaxWidth(800);
        root.setMaxHeight(550);

        // boxPane
        boxPane.getChildren().addAll(title, c1, c2, c3, c4, c5, c6, c7, c8, playerRectangle1, player1, fighterRectangle1, fighter1, teamRectangle1, team1,
                joint11, joint12, joint13, joint21, joint22, joint23, joint31, joint32, joint33,
                playerRectangle2, player2, fighterRectangle2, fighter2, teamRectangle2, team2,
                joint14, joint15, joint16, joint24, joint25, joint26, joint34, joint35, joint36);
        boxPane.setStyle("-fx-background-color: #122564");
        boxPane.setPrefWidth(724);
        boxPane.setPrefHeight(490);
        boxPane.setLayoutX(38);
        boxPane.setLayoutY(30);
        title.setText("Character Selection");
        title.setFont(Font.font("Arial", 24));
        title.setTextFill(Paint.valueOf("#ffffffca"));
        title.setTextAlignment(TextAlignment.CENTER);
        title.setPrefWidth(224);
        title.setPrefHeight(57);
        title.setLayoutX(250);
        title.setLayoutY(-10);

        this.iniCharacterPane();
        c1.getChildren().addAll(c1Image, c1Player, c1Fighter, c1Team);
        c1.setPrefWidth(216);
        c1.setPrefHeight(215);
        c1.setLayoutX(20);
        c1.setLayoutY(34);
        c1Image.setFitWidth(120);
        c1Image.setFitHeight(120);
        c1Image.setLayoutX(94);
        c1Image.setLayoutY(2);
        c1Player.setText("Join?");
        c1Player.setFont(Font.font("System", 13));
        c1Player.setTextFill(Color.WHITE);
        c1Player.setTextAlignment(TextAlignment.CENTER);
        c1Player.setStyle("-fx-background-color: #000000");
        c1Player.setPrefWidth(120);
        c1Player.setPrefHeight(27);
        c1Player.setLayoutX(96);
        c1Player.setLayoutY(125);
        c1Fighter.setFont(Font.font("System", 13));
        c1Fighter.setTextFill(Color.WHITE);
        c1Fighter.setTextAlignment(TextAlignment.CENTER);
        c1Fighter.setStyle("-fx-background-color: #000000");
        c1Fighter.setPrefWidth(120);
        c1Fighter.setPrefHeight(27);
        c1Fighter.setLayoutX(96);
        c1Fighter.setLayoutY(157);
        c1Team.setFont(Font.font("System", 13));
        c1Team.setTextFill(Color.WHITE);
        c1Team.setTextAlignment(TextAlignment.CENTER);
        c1Team.setStyle("-fx-background-color: #000000");
        c1Team.setPrefWidth(120);
        c1Team.setPrefHeight(27);
        c1Team.setLayoutX(96);
        c1Team.setLayoutY(189);

        c2.setLayoutX(236);
        c2.setLayoutY(34);

        c3.setLayoutX(392);
        c3.setLayoutY(34);

        c4.setLayoutX(548);
        c4.setLayoutY(34);

        c5.getChildren().addAll(c5Image, c5Player, c5Fighter, c5Team);
        c5.setDisable(true);
        c5.setPrefWidth(216);
        c5.setPrefHeight(215);
        c5.setLayoutX(20);
        c5.setLayoutY(266);
        c5Image.setFitWidth(120);
        c5Image.setFitHeight(120);
        c5Image.setLayoutX(94);
        c5Image.setLayoutY(2);
        c5Player.setText("Join?");
        c5Player.setFont(Font.font("System", 13));
        c5Player.setTextFill(Color.WHITE);
        c5Player.setTextAlignment(TextAlignment.CENTER);
        c5Player.setStyle("-fx-background-color: #000000");
        c5Player.setPrefWidth(120);
        c5Player.setPrefHeight(27);
        c5Player.setLayoutX(96);
        c5Player.setLayoutY(125);
        c5Fighter.setFont(Font.font("System", 13));
        c5Fighter.setTextFill(Color.WHITE);
        c5Fighter.setTextAlignment(TextAlignment.CENTER);
        c5Fighter.setStyle("-fx-background-color: #000000");
        c5Fighter.setPrefWidth(120);
        c5Fighter.setPrefHeight(27);
        c5Fighter.setLayoutX(96);
        c5Fighter.setLayoutY(157);
        c5Team.setFont(Font.font("System", 13));
        c5Team.setTextFill(Color.WHITE);
        c5Team.setTextAlignment(TextAlignment.CENTER);
        c5Team.setStyle("-fx-background-color: #000000");
        c5Team.setPrefWidth(120);
        c5Team.setPrefHeight(27);
        c5Team.setLayoutX(96);
        c5Team.setLayoutY(189);

        c6.setLayoutX(236);
        c6.setLayoutY(266);

        c7.setLayoutX(392);
        c7.setLayoutY(266);

        c8.setLayoutX(548);
        c8.setLayoutY(266);

        playerRectangle1.setFill(Paint.valueOf("#010b52"));
        playerRectangle1.setStroke(Color.BLACK);
        playerRectangle1.setOpacity(0.6);
        playerRectangle1.setWidth(106);
        playerRectangle1.setHeight(27);
        playerRectangle1.setLayoutX(10);
        playerRectangle1.setLayoutY(159);

        player1.setText("Player");
        player1.setFont(Font.font("System", 13));
        player1.setTextFill(Color.WHITE);
        player1.setTextAlignment(TextAlignment.LEFT);
        player1.setPrefWidth(39);
        player1.setPrefHeight(17);
        player1.setLayoutX(44);
        player1.setLayoutY(164);

        fighterRectangle1.setFill(Paint.valueOf("#010b52"));
        fighterRectangle1.setStroke(Color.BLACK);
        fighterRectangle1.setOpacity(0.6);
        fighterRectangle1.setWidth(106);
        fighterRectangle1.setHeight(27);
        fighterRectangle1.setLayoutX(10);
        fighterRectangle1.setLayoutY(191);

        fighter1.setText("Fighter");
        fighter1.setFont(Font.font("System", 13));
        fighter1.setTextFill(Color.WHITE);
        fighter1.setPrefWidth(44);
        fighter1.setPrefHeight(17);
        fighter1.setLayoutX(41);
        fighter1.setLayoutY(196);

        teamRectangle1.setFill(Paint.valueOf("#010b52"));
        teamRectangle1.setStroke(Color.BLACK);
        teamRectangle1.setOpacity(0.6);
        teamRectangle1.setWidth(106);
        teamRectangle1.setHeight(27);
        teamRectangle1.setLayoutX(10);
        teamRectangle1.setLayoutY(223);

        team1.setText("Team");
        team1.setFont(Font.font("System", 13));
        team1.setTextFill(Color.WHITE);
        team1.setPrefWidth(35);
        team1.setPrefHeight(17);
        team1.setLayoutX(45);
        team1.setLayoutY(228);

        this.initJoint();
        joint11.setLayoutX(236);
        joint11.setLayoutY(159);
        joint12.setLayoutX(236);
        joint12.setLayoutY(191);
        joint13.setLayoutX(236);
        joint13.setLayoutY(223);

        joint21.setLayoutX(392);
        joint21.setLayoutY(159);
        joint22.setLayoutX(392);
        joint22.setLayoutY(191);
        joint23.setLayoutX(392);
        joint23.setLayoutY(223);

        joint31.setLayoutX(548);
        joint31.setLayoutY(159);
        joint32.setLayoutX(548);
        joint32.setLayoutY(191);
        joint33.setLayoutX(548);
        joint33.setLayoutY(223);

        playerRectangle2.setFill(Paint.valueOf("#010b52"));
        playerRectangle2.setStroke(Color.BLACK);
        playerRectangle2.setOpacity(0.6);
        playerRectangle2.setWidth(106);
        playerRectangle2.setHeight(27);
        playerRectangle2.setLayoutX(10);
        playerRectangle2.setLayoutY(391);

        player2.setText("Player");
        player2.setFont(Font.font("System", 13));
        player2.setTextFill(Color.WHITE);
        player2.setPrefWidth(40);
        player2.setPrefHeight(17);
        player2.setLayoutX(43);
        player2.setLayoutY(396);

        fighterRectangle2.setFill(Paint.valueOf("#010b52"));
        fighterRectangle2.setStroke(Color.BLACK);
        fighterRectangle2.setOpacity(0.6);
        fighterRectangle2.setWidth(106);
        fighterRectangle2.setHeight(27);
        fighterRectangle2.setLayoutX(10);
        fighterRectangle2.setLayoutY(423);

        fighter2.setText("Fighter");
        fighter2.setFont(Font.font("System", 13));
        fighter2.setTextFill(Color.WHITE);
        fighter2.setPrefWidth(44);
        fighter2.setPrefHeight(17);
        fighter2.setLayoutX(41);
        fighter2.setLayoutY(428);

        teamRectangle2.setFill(Paint.valueOf("#010b52"));
        teamRectangle2.setStroke(Color.BLACK);
        teamRectangle2.setOpacity(0.6);
        teamRectangle2.setWidth(106);
        teamRectangle2.setHeight(27);
        teamRectangle2.setLayoutX(10);
        teamRectangle2.setLayoutY(455);

        team2.setText("Team");
        team2.setFont(Font.font("System", 13));
        team2.setTextFill(Color.WHITE);
        team2.setPrefWidth(35);
        team2.setPrefHeight(17);
        team2.setLayoutX(45);
        team2.setLayoutY(460);

        joint14.setLayoutX(236);
        joint14.setLayoutY(391);
        joint15.setLayoutX(236);
        joint15.setLayoutY(423);
        joint16.setLayoutX(236);
        joint16.setLayoutY(455);

        joint24.setLayoutX(392);
        joint24.setLayoutY(391);
        joint25.setLayoutX(392);
        joint25.setLayoutY(423);
        joint26.setLayoutX(392);
        joint26.setLayoutY(455);

        joint34.setLayoutX(548);
        joint34.setLayoutY(391);
        joint35.setLayoutX(548);
        joint35.setLayoutY(423);
        joint36.setLayoutX(548);
        joint36.setLayoutY(455);

        // cptNumberPane
        cptNumberPane.getChildren().add(innerCptNumberPane);
        cptNumberPane.setDisable(true);
        cptNumberPane.setVisible(false);
        cptNumberPane.setStyle("-fx-background-color:  #000E50; -fx-border-color:  #122564");
        cptNumberPane.setPrefWidth(365);
        cptNumberPane.setPrefHeight(115);
        cptNumberPane.setLayoutX(227.5);
        cptNumberPane.setLayoutY(227.5);

        innerCptNumberPane.getChildren().addAll(cptNumberTitle, p0Btn, p1Btn, p2Btn, p3Btn, p4Btn, p5Btn, p6Btn, p7Btn);
        innerCptNumberPane.setStyle("-fx-background-color:  #122564");
        innerCptNumberPane.setPrefWidth(349);
        innerCptNumberPane.setPrefHeight(99);
        innerCptNumberPane.setLayoutX(8);
        innerCptNumberPane.setLayoutY(8);

        cptNumberTitle.setText("How many Computer Players?");
        cptNumberTitle.setFont(Font.font("System", 15));
        cptNumberTitle.setTextFill(Color.WHITE);
        cptNumberTitle.setPrefWidth(213);
        cptNumberTitle.setPrefHeight(19);
        cptNumberTitle.setLayoutX(72);
        cptNumberTitle.setLayoutY(9);

        p0Btn.setText("0");
        p0Btn.setFont(Font.font("System", 13));
        p0Btn.setTextFill(Color.WHITE);
        p0Btn.setDisable(true);
        p0Btn.setStyle("-fx-background-color:  #122564");
        p0Btn.setPrefWidth(30);
        p0Btn.setPrefHeight(30);
        p0Btn.setLayoutX(29.5);
        p0Btn.setLayoutY(49);

        p1Btn.setText("1");
        p1Btn.setFont(Font.font("System", 13));
        p1Btn.setTextFill(Color.WHITE);
        p1Btn.setStyle("-fx-background-color:  #122564; -fx-border-color: #ffffff");
        p1Btn.setPrefWidth(30);
        p1Btn.setPrefHeight(30);
        p1Btn.setLayoutX(61.5);
        p1Btn.setLayoutY(49);

        p2Btn.setText("2");
        p2Btn.setFont(Font.font("System", 13));
        p2Btn.setTextFill(Color.WHITE);
        p2Btn.setDisable(true);
        p2Btn.setStyle("-fx-background-color:  #122564");
        p2Btn.setPrefWidth(30);
        p2Btn.setPrefHeight(30);
        p2Btn.setLayoutX(99.5);
        p2Btn.setLayoutY(49);

        p3Btn.setText("3");
        p3Btn.setFont(Font.font("System", 13));
        p3Btn.setTextFill(Color.WHITE);
        p3Btn.setDisable(true);
        p3Btn.setStyle("-fx-background-color:  #122564");
        p3Btn.setPrefWidth(30);
        p3Btn.setPrefHeight(30);
        p3Btn.setLayoutX(134.5);
        p3Btn.setLayoutY(49);

        p4Btn.setText("4");
        p4Btn.setFont(Font.font("System", 13));
        p4Btn.setTextFill(Color.WHITE);
        p4Btn.setDisable(true);
        p4Btn.setStyle("-fx-background-color:  #122564");
        p4Btn.setPrefWidth(30);
        p4Btn.setPrefHeight(30);
        p4Btn.setLayoutX(169.5);
        p4Btn.setLayoutY(49);

        p5Btn.setText("5");
        p5Btn.setFont(Font.font("System", 13));
        p5Btn.setTextFill(Color.WHITE);
        p5Btn.setDisable(true);
        p5Btn.setStyle("-fx-background-color:  #122564");
        p5Btn.setPrefWidth(30);
        p5Btn.setPrefHeight(30);
        p5Btn.setLayoutX(204.5);
        p5Btn.setLayoutY(49);

        p6Btn.setText("6");
        p6Btn.setFont(Font.font("System", 13));
        p6Btn.setTextFill(Color.WHITE);
        p6Btn.setDisable(true);
        p6Btn.setStyle("-fx-background-color:  #122564");
        p6Btn.setPrefWidth(30);
        p6Btn.setPrefHeight(30);
        p6Btn.setLayoutX(239.5);
        p6Btn.setLayoutY(49);

        p7Btn.setText("7");
        p7Btn.setFont(Font.font("System", 13));
        p7Btn.setTextFill(Color.WHITE);
        p7Btn.setDisable(true);
        p7Btn.setStyle("-fx-background-color:  #122564");
        p7Btn.setPrefWidth(30);
        p7Btn.setPrefHeight(30);
        p7Btn.setLayoutX(274.5);
        p7Btn.setLayoutY(49);

        // ctrlPane
        ctrlPane.getChildren().add(innerCtrlPane);
        ctrlPane.setDisable(true);
        ctrlPane.setVisible(false);
        ctrlPane.setStyle("-fx-background-color: #20316c; -fx-border-color: #334da2");
        ctrlPane.setPrefWidth(214);
        ctrlPane.setPrefHeight(144);
        ctrlPane.setLayoutX(2.5);
        ctrlPane.setLayoutY(2.5);

        innerCtrlPane.getChildren().addAll(fightBtn, resetBtn, exitBtn, fightBorder, resetBorder, exitBorder);
        innerCtrlPane.setStyle("-fx-background-color: #334da2");
        innerCtrlPane.setPrefWidth(204);
        innerCtrlPane.setPrefHeight(134);
        innerCtrlPane.setLayoutX(5);
        innerCtrlPane.setLayoutY(5);

        fightBtn.setText("Fight!");
        fightBtn.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        fightBtn.setTextFill(Color.WHITE);
        fightBtn.setStyle("-fx-background-color: #334da2");
        fightBtn.setPrefWidth(62);
        fightBtn.setPrefHeight(27);
        fightBtn.setLayoutX(71);
        fightBtn.setLayoutY(22);

        resetBtn.setText("Reset All");
        resetBtn.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        resetBtn.setTextFill(Color.WHITE);
        resetBtn.setStyle("-fx-background-color: #334da2");
        resetBtn.setDisable(true);
        resetBtn.setPrefWidth(85);
        resetBtn.setPrefHeight(27);
        resetBtn.setLayoutX(60);
        resetBtn.setLayoutY(61);

        exitBtn.setText("Exit");
        exitBtn.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        exitBtn.setTextFill(Color.WHITE);
        exitBtn.setStyle("-fx-background-color: #334da2");
        exitBtn.setDisable(true);
        exitBtn.setPrefWidth(48);
        exitBtn.setPrefHeight(27);
        exitBtn.setLayoutX(78);
        exitBtn.setLayoutY(98);

        fightBorder.setFill(Paint.valueOf("#8f959c99"));
        fightBorder.setStroke(Paint.valueOf("#8f959c99"));
        fightBorder.setWidth(69);
        fightBorder.setHeight(30);
        fightBorder.setLayoutX(68);
        fightBorder.setLayoutY(21);

        resetBorder.setFill(Paint.valueOf("#8f959c99"));
        resetBorder.setStroke(Paint.valueOf("#8f959c99"));
        resetBorder.setVisible(false);
        resetBorder.setWidth(84);
        resetBorder.setHeight(30);
        resetBorder.setLayoutX(60);
        resetBorder.setLayoutY(60);

        exitBorder.setFill(Paint.valueOf("#8f959c99"));
        exitBorder.setStroke(Paint.valueOf("#8f959c99"));
        exitBorder.setVisible(false);
        exitBorder.setWidth(54);
        exitBorder.setHeight(30);
        exitBorder.setLayoutX(76);
        exitBorder.setLayoutY(97);

        //exitPane
        exitPane.getChildren().addAll(exitPaneText, yesBtn, noBtn);
        exitPane.setVisible(false);
        exitPane.setStyle("-fx-background-color: #ffffff");
        exitPane.setPrefWidth(200);
        exitPane.setPrefHeight(100);
        exitPane.setLayoutX(300);
        exitPane.setLayoutY(200);

        exitPaneText.setText("Are you sure to quit?");
        exitPaneText.setFont(Font.font("System", 13));
        exitPaneText.setFill(Color.BLACK);
        exitPaneText.setLayoutX(36);
        exitPaneText.setLayoutY(40);

        yesBtn.setText("Yes");
        yesBtn.setFont(Font.font("System", 13));
        yesBtn.setTextFill(Color.BLACK);
        yesBtn.setPrefWidth(45);
        yesBtn.setPrefHeight(20);
        yesBtn.setLayoutX(36);
        yesBtn.setLayoutY(50);

        noBtn.setText("No");
        noBtn.setFont(Font.font("System", 13));
        noBtn.setTextFill(Color.BLACK);
        noBtn.setPrefWidth(45);
        noBtn.setPrefHeight(20);
        noBtn.setLayoutX(118);
        noBtn.setLayoutY(50);
    }

    public Pane getRoot() {
        return this.root;
    }

    public void resetCharacterSelection() {
        TeamList.resetList();
        CharacterList.resetList();
        instance = new CharacterSelection();
    }

    public void iniCharacterPane() {
        for (int x = 0; x < characterPane.length; x++) {
            characterPane[x].getChildren().addAll(imageViews[x], playerButton[x], fighterButton[x], teamButton[x]);
            characterPane[x].setDisable(true);
            characterPane[x].setPrefWidth(156);
            characterPane[x].setPrefHeight(216);

            imageViews[x].setFitWidth(120);
            imageViews[x].setFitHeight(120);
            imageViews[x].setLayoutX(34);
            imageViews[x].setLayoutY(2);

            playerButton[x].setText("Join?");
            playerButton[x].setFont(Font.font("System", 13));
            playerButton[x].setTextFill(Color.WHITE);
            playerButton[x].setTextAlignment(TextAlignment.CENTER);
            playerButton[x].setStyle("-fx-background-color: #000000");
            playerButton[x].setPrefWidth(120);
            playerButton[x].setPrefHeight(27);
            playerButton[x].setLayoutX(36);
            playerButton[x].setLayoutY(125);

            fighterButton[x].setFont(Font.font("System", 13));
            fighterButton[x].setTextFill(Color.WHITE);
            fighterButton[x].setTextAlignment(TextAlignment.CENTER);
            fighterButton[x].setStyle("-fx-background-color: #000000");
            fighterButton[x].setPrefWidth(120);
            fighterButton[x].setPrefHeight(27);
            fighterButton[x].setLayoutX(36);
            fighterButton[x].setLayoutY(157);

            teamButton[x].setFont(Font.font("System", 13));
            teamButton[x].setTextFill(Color.WHITE);
            teamButton[x].setTextAlignment(TextAlignment.CENTER);
            teamButton[x].setStyle("-fx-background-color: #000000");
            teamButton[x].setPrefWidth(120);
            teamButton[x].setPrefHeight(27);
            teamButton[x].setLayoutX(36);
            teamButton[x].setLayoutY(189);
        }
    }

    public void initJoint() {
        for (int x = 0; x < joints.length; x++) {
            joints[x].setFill(Paint.valueOf("#010b53"));
            joints[x].setStroke(Color.BLACK);
            joints[x].setOpacity(0.6);
            joints[x].setWidth(36);
            joints[x].setHeight(27);
        }
    }

    public void changeCharacter(int temp) {
        characterIndex += temp;
        if (characterIndex < 0) {
            characterIndex += CharacterList.characters.length;
        }
        characterIndex %= CharacterList.characters.length;
    }

    public void changeTeam(int temp) {
        teamIndex += temp;
        if (teamIndex < 0) {
            teamIndex += teams.length;
        }
        teamIndex %= teams.length;
    }
}
