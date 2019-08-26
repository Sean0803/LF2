package Game;

public class GameConfig {

    // Scene
    public static final int SCENE_WIDTH = 800;
    public static final int SCENE_HEIGHT = 550;
    public static final int FIELD_WIDTH = 736;
    public static final int FIELD_HEIGHT = 165;

    // character at battle field position
    public static final int MIN_POSX = 3;
    public static final int MAX_POSX = 760;
    public static final int MIN_POSY = 122;
    public static final int MAX_POSY = 280;

    // Character
    public static final int DEFAULT_HEALTH = 130;
    public static final int DEFAULT_MANA = 130;
    public static final int DEFAULT_CHARACTER_WIDTH = 65;
    public static final int DEFAULT_CHARACTER_HEIGHT = 65;
    public static final int WALKING_SPEED = 2;
    public static final int RUNNING_SPEED = 4;
    public static final int SKILL_SPEED = 10;
    public static final int JUMPING_OFFSET_X = 15;
    public static final int JUMPING_OFFSET_Y = -45;
    public static final int BALL_FLYING_SPEED = 10;
    public static final int CHARACTER_WIDTH = 58;
    public static final int CHARACTER_HEIGHT = 80;

    // Skill
    public static final int SKILL_HEIGHT = 40;
    public static final int SKILL_WEIGHT = 40;
    public static final int SKILL_DAMAGE = 20;

    // Time
    public static final int TIME_FALL = 120;
    public static final int TIME_STUN = 90;
    public static final int TIME_DEFEND = 40;
    public static final int TIME_ATTACK = 15;
    public static final int TIME_JUMP = 43;

    // Animation
    public static int WALKING_FRAME_RATE = 2;
    public static int RUNNING_FRAME_RATE = 5;
    public static int BALL_FLYING_FRAME_RATE = 7;
    public static int STANDING_FRAME_RATE = 4;
    public static int ATTACKING_FRAME_RATE = 5;
    public static int FALLING_FRAME_RATE = 10;
    public static int JUMPING_FRAME_RATE = 10;

    // Enemy
    public static final int ENEMY_SHOOTING_DURATION = 200;
    public static final int ENEMY_MANA_DURATION = 60;
}
