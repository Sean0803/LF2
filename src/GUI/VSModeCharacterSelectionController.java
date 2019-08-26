package GUI;

import Control.KeyControl;
import GameObject.CharacterList;
import GameObject.TeamList;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

import java.io.File;

public class VSModeCharacterSelectionController {

    @FXML
    private Pane boxPane;

    @FXML
    private Pane quitPane;

    @FXML
    private Pane c1;

    @FXML
    private ImageView c1Image;

    @FXML
    private Button c1Player;

    @FXML
    private Button c1Fighter;

    @FXML
    private Button c1Team;

    @FXML
    private Pane c2;

    @FXML
    private ImageView c2Image;

    @FXML
    private Button c2Player;

    @FXML
    private Button c2Fighter;

    @FXML
    private Button c2Team;

    @FXML
    private Pane c3;

    @FXML
    private ImageView c3Image;

    @FXML
    private Button c3Player;

    @FXML
    private Button c3Fighter;

    @FXML
    private Button c3Team;

    @FXML
    private Pane c4;

    @FXML
    private ImageView c4Image;

    @FXML
    private Button c4Player;

    @FXML
    private Button c4Fighter;

    @FXML
    private Button c4Team;

    @FXML
    private Pane c5;

    @FXML
    private ImageView c5Image;

    @FXML
    private Button c5Player;

    @FXML
    private Button c5Fighter;

    @FXML
    private Button c5Team;

    @FXML
    private Pane c6;

    @FXML
    private ImageView c6Image;

    @FXML
    private Button c6Player;

    @FXML
    private Button c6Fighter;

    @FXML
    private Button c6Team;

    @FXML
    private Pane c7;

    @FXML
    private ImageView c7Image;

    @FXML
    private Button c7Player;

    @FXML
    private Button c7Fighter;

    @FXML
    private Button c7Team;

    @FXML
    private Pane c8;

    @FXML
    private ImageView c8Image;

    @FXML
    private Button c8Player;

    @FXML
    private Button c8Fighter;

    @FXML
    private Button c8Team;

    @FXML
    private Pane cptNumber;

    @FXML
    private Button p1Btn;

    @FXML
    private Button p2Btn;

    @FXML
    private Button p3Btn;

    @FXML
    private Button p4Btn;

    @FXML
    private Button p5Btn;

    @FXML
    private Button p6Btn;

    @FXML
    private Button p7Btn;

    @FXML
    private Pane ctrlPane;

    @FXML
    private Button fightBtn;

    @FXML
    private Button resetBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private Rectangle fightBoarder;

    @FXML
    private Rectangle resetBoarder;

    @FXML
    private Rectangle exitBoarder;

    private int computerNumber;
    private int attackCount;
    private int characterIndex;
    private int teamIndex;
    private int[] teams;
    private Button[] playerButtons;

    public void initialize() {
        this.computerNumber = 0;
        this.attackCount = 0;
        this.characterIndex = 0;
        this.teamIndex = 0;
        this.teams = new int[]{1, 2, 3, 4, 5};

        c1Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c2Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c3Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c4Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c5Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c6Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c7Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        c8Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "active.png").toURI().toString()));
        this.playerButtons = new Button[]{c2Player, c3Player, c4Player, c5Player, c6Player, c7Player, c8Player};
    }

    public void rootInput(KeyEvent keyEvent) {
        if (keyEvent.getCode().equals(KeyCode.ESCAPE)) {
            quitPane.setDisable(false);
            quitPane.setVisible(true);
        }
        if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 0) {
            attackCount++;
            c1Image.setImage(CharacterList.characters[0].getCharacterSelection());
            c1Player.setText("1");
            c1Fighter.setText(CharacterList.characters[0].getName());
        }
    }

    public void c1InputKey(KeyEvent keyEvent) {
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
            c2Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
            c3Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
            c4Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
            c5Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
            c6Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
            c7Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
            c8Image.setImage(new Image(new File("res" + File.separator + "CharacterSelection" + File.separator + "black.png").toURI().toString()));
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
            cptNumber.setDisable(false);
            cptNumber.setVisible(true);
            c1.setDisable(true);
            boxPane.setDisable(true);
        }
    }

    public void p1BtnInputKey(KeyEvent keyEvent) {
        p1Btn.setStyle("-fx-border-color:  #122564; -fx-background-color: #122564");
        p1Btn.setDisable(true);

        if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
            this.attackCount++;
            this.computerNumber = 1;
            boxPane.setDisable(false);
            c2.setDisable(false);
            c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
            c2Fighter.setText(CharacterList.characters[0].getName());
            cptNumber.setDisable(true);
            cptNumber.setVisible(false);
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
    }

    public void p2BtnInputKey(KeyEvent keyEvent) {
        p2Btn.setStyle("-fx-border-color: #122564; -fx-background-color: #122564");
        p2Btn.setDisable(true);

        if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
            this.attackCount++;
            this.computerNumber = 2;
            boxPane.setDisable(false);
            c2.setDisable(false);
            c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
            c2Fighter.setText(CharacterList.characters[0].getName());
            cptNumber.setDisable(true);
            cptNumber.setVisible(false);
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
    }

    public void p3BtnInputKey(KeyEvent keyEvent) {
        p3Btn.setStyle("-fx-border-color: #122564; -fx-background-color: #122564");
        p3Btn.setDisable(true);

        if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
            this.attackCount++;
            this.computerNumber = 3;
            boxPane.setDisable(false);
            c2.setDisable(false);
            c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
            c2Fighter.setText(CharacterList.characters[0].getName());
            cptNumber.setDisable(true);
            cptNumber.setVisible(false);
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
    }

    public void p4BtnInputKey(KeyEvent keyEvent) {
        p4Btn.setStyle("-fx-border-color: #122564; -fx-background-color: #122564");
        p4Btn.setDisable(true);

        if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
            this.attackCount++;
            this.computerNumber = 4;
            boxPane.setDisable(false);
            c2.setDisable(false);
            c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
            c2Fighter.setText(CharacterList.characters[0].getName());
            cptNumber.setDisable(true);
            cptNumber.setVisible(false);
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
    }

    public void p5BtnInputKey(KeyEvent keyEvent) {
        p5Btn.setStyle("-fx-border-color: #122564; -fx-background-color: #122564");
        p5Btn.setDisable(true);

        if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
            this.attackCount++;
            this.computerNumber = 5;
            boxPane.setDisable(false);
            c2.setDisable(false);
            c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
            c2Fighter.setText(CharacterList.characters[0].getName());
            cptNumber.setDisable(true);
            cptNumber.setVisible(false);
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
    }

    public void p6BtnInputKey(KeyEvent keyEvent) {
        p6Btn.setStyle("-fx-border-color: #122564; -fx-background-color: #122564");
        p6Btn.setDisable(true);

        if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
            this.attackCount++;
            this.computerNumber = 6;
            boxPane.setDisable(false);
            c2.setDisable(false);
            c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
            c2Fighter.setText(CharacterList.characters[0].getName());
            cptNumber.setDisable(true);
            cptNumber.setVisible(false);
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
    }

    public void p7BtnInputKey(KeyEvent keyEvent) {
        p7Btn.setStyle("-fx-border-color: #122564; -fx-background-color: #122564");
        p7Btn.setDisable(true);

        if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode()) && attackCount == 3) {
            this.attackCount++;
            this.computerNumber = 7;
            boxPane.setDisable(false);
            c2.setDisable(false);
            c2Image.setImage(CharacterList.characters[0].getCharacterSelection());
            c2Fighter.setText(CharacterList.characters[0].getName());
            cptNumber.setDisable(true);
            cptNumber.setVisible(false);
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
    }

    public void c2InputKey(KeyEvent keyEvent) {
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
    }

    public void c3InputKey(KeyEvent keyEvent) {
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
    }

    public void c4InputKey(KeyEvent keyEvent) {
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
    }

    public void c5InputKey(KeyEvent keyEvent) {
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
    }

    public void c6InputKey(KeyEvent keyEvent) {
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
    }

    public void c7InputKey(KeyEvent keyEvent) {
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
    }

    public void c8InputKey(KeyEvent keyEvent) {
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
    }

    public void fightBtnInputKey(KeyEvent keyEvent) {
        fightBoarder.setVisible(false);
        fightBtn.setDisable(true);

        if (keyEvent.getCode().equals(KeyControl.UP.getCode())) {
            exitBoarder.setVisible(true);
            exitBtn.setDisable(false);
        } else if (keyEvent.getCode().equals(KeyControl.DOWN.getCode())) {
            resetBoarder.setVisible(true);
            resetBtn.setDisable(false);
        } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode())) {
            SceneManager.setVSMode();
        } else {
            fightBoarder.setVisible(true);
            fightBtn.setDisable(false);
        }
    }

    public void resetBtnInputKey(KeyEvent keyEvent) {
        resetBoarder.setVisible(false);
        resetBtn.setDisable(true);
        CharacterList.resetList();
        TeamList.resetList();

        if (keyEvent.getCode().equals(KeyControl.UP.getCode())) {
            fightBoarder.setVisible(true);
            fightBtn.setDisable(false);
        } else if (keyEvent.getCode().equals(KeyControl.DOWN.getCode())) {
            exitBoarder.setVisible(true);
            exitBtn.setDisable(false);
        } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode())) {
            SceneManager.setVSModeCharacterSelection();
        } else {
            resetBoarder.setVisible(true);
            resetBtn.setDisable(false);
        }
    }

    public void exitBtnInputKey(KeyEvent keyEvent) {
        exitBoarder.setVisible(false);
        exitBtn.setDisable(true);

        if (keyEvent.getCode().equals(KeyControl.UP.getCode())) {
            resetBoarder.setVisible(true);
            resetBtn.setDisable(false);
        } else if (keyEvent.getCode().equals(KeyControl.DOWN.getCode())) {
            fightBoarder.setVisible(true);
            fightBtn.setDisable(false);
        } else if (keyEvent.getCode().equals(KeyControl.ATTACK.getCode())) {
            SceneManager.setMenu();
        } else {
            exitBoarder.setVisible(true);
            exitBtn.setDisable(false);
        }
    }

    public void yesClicked(MouseEvent mouseEvent) {
        Platform.exit();
    }

    public void noClicked(MouseEvent mouseEvent) {
        quitPane.setDisable(true);
        quitPane.setVisible(false);
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
