package Skill;

import javafx.scene.image.Image;

import java.io.File;

public class SkillDetail {

    private int damage;
    private int mana;
    private int x;
    private int y;
    private int z;
    private int range;
    private int offset;
    private int effTime;

    private boolean defend;

    private Image ready;
    private Image getHit;

    public SkillDetail(int damage, int mana, int x, int y, int z, int range, int offset, int effTime, boolean defend) {
        this.damage = damage;
        this.mana = mana;
        this.x = x;
        this.y = y;
        this.z = z;
        this.range = range;
        this.offset = offset;
        this.effTime = effTime;
        this.defend = defend;
    }

    public SkillDetail(int damage, int mana, int x, int y, int z, int range, int offset, int effTime, boolean defend, String url) {
        this.damage = damage;
        this.mana = mana;
        this.x = x;
        this.y = y;
        this.z = z;
        this.range = range;
        this.offset = offset;
        this.defend = defend;
        this.effTime = effTime;
        this.ready = new Image(new File(url + "1.png").toURI().toString());
        this.getHit = new Image(new File(url + "2.png").toURI().toString());
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

    public int getEffTime() {
        return effTime;
    }

    public void setEffTime(int effTime) {
        this.effTime = effTime;
    }

    public boolean isDefend() {
        return defend;
    }

    public void setDefend(boolean defend) {
        this.defend = defend;
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
}