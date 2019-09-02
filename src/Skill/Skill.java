package Skill;

import Game.GameConfig;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import Character.Player;
import Character.CharacterStatus;

public class Skill extends Pane {
    private int team;
    private int damage;
    private int mana;
    private int posX;
    private int posY;
    private int posZ;
    private int x;
    private int y;
    private int z;
    private int tillDead;
    private int effTime;
    private int range;
    private int offset;

    private Image ready;
    private Image getHit;

    private int faceRight;
    private boolean skillDefend;
    private boolean dead;
    private boolean hit;

    private ImageView imageView;

    public Skill(int team, int damage, int mana, int posX, int posY, int posZ, int x, int y, int z, int faceRight, boolean skillDefend, int range, int offset, int effTime) {
        this.team = team;
        this.damage = damage;
        this.mana = mana;
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
        this.x = x;
        this.y = y;
        this.z = z;
        this.faceRight = faceRight;
        this.skillDefend = skillDefend;
        this.range = range;
        this.offset = offset;
        this.effTime = effTime;

        this.tillDead = 0;
        this.hit = false;
    }

    public Skill(int team, int damage, int mana, Image ready, Image getHit, int posX, int posY, int posZ, int x, int y, int z, int faceRight, boolean skillDefend, int range, int offset, int effTime) {
        this.team = team;
        this.damage = damage;
        this.mana = mana;
        this.ready = ready;
        this.getHit = getHit;
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
        this.x = x;
        this.y = y;
        this.z = z;
        this.faceRight = faceRight;
        this.skillDefend = skillDefend;
        this.range = range;
        this.offset = offset;
        this.effTime = effTime;

        this.tillDead = 0;
        this.hit = false;

        imageView = new ImageView();
        imageView.setFitWidth(GameConfig.SKILL_WEIGHT);
        imageView.setFitHeight(GameConfig.SKILL_HEIGHT);
        imageView.setImage(ready);
        this.getChildren().add(imageView);

        this.setPrefWidth(GameConfig.SKILL_WEIGHT);
        this.setPrefWidth(GameConfig.SKILL_HEIGHT);
        this.setLayoutX(posX - 20);
        this.setLayoutY(345 - posY - posZ - 20);
    }

    public void hitView() {
        this.dead = true;
        if (this.hit) {
            imageView.setImage(getHit);
            this.tillDead = effTime;
        }
    }

    public boolean isAbsoluteDead() {
        return dead && tillDead == 0;
    }

    public boolean checkHit(Player player) {
        if (posX < 0 || posX > GameConfig.MAX_POSX || range == 0) {
            return true;
        }
        if (!player.getCharacterStatus().equals(CharacterStatus.DEAD) && team != player.getTeam()
                && posX - x <= player.getPosX() + 30 && player.getPosX() + 30 <= posX + x
                && posY - y <= player.getPosY() - 30 && player.getPosY() - 30 <= posY + y
                && posZ - z <= player.getPosZ() && player.getPosZ() <= posZ + z) {
            if ((player.getCharacter().getSkillDetail().isDefend() || player.getCharacterStatus().equals(CharacterStatus.DEFEND)) && faceRight != player.getFaceRight()) {
                this.hit = true;
                return true;
            } else {
                player.getDamage(damage);
                this.hit = true;
                return true;
            }
        } else {
            return false;
        }
    }

    public void update() {
        this.setScaleX(faceRight);
        if (this.dead && this.tillDead > 0) {
            this.tillDead -= 1;
        }
        if (!this.dead) {
          posX += faceRight * offset;
          range -= 1;
        }
        this.setLayoutX(posX - 20);
        this.setLayoutY(345 - posY - posZ - 20);
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosZ() {
        return posZ;
    }

    public void setPosZ(int posZ) {
        this.posZ = posZ;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getTillDead() {
        return tillDead;
    }

    public void setTillDead(int tillDead) {
        this.tillDead = tillDead;
    }

    public int getEffTime() {
        return effTime;
    }

    public void setEffTime(int effTime) {
        this.effTime = effTime;
    }

    public Image getReady() {
        return ready;
    }

    public void setReady(Image ready) {
        this.ready = ready;
    }

    public Image getGetHit() {
        return getHit;
    }

    public void setGetHit(Image getHit) {
        this.getHit = getHit;
    }

    public int getFaceRight() {
        return faceRight;
    }

    public void setFaceRight(int faceRight) {
        this.faceRight = faceRight;
    }

    public boolean isSkillDefend() {
        return skillDefend;
    }

    public void setSkillDefend(boolean skillDefend) {
        this.skillDefend = skillDefend;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

}