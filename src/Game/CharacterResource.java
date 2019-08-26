package Game;

import java.io.File;

public class CharacterResource {
    public static String davis_url = "res" + File.separator + "Characters" + File.separator + "Davis" + File.separator;
    public static String john_url = "res" + File.separator + "Characters" + File.separator + "John" + File.separator;
    public static String dennis_url = "res" + File.separator + "Characters" + File.separator + "Dennis" + File.separator;
    public static String bandit_url = "res" + File.separator + "Characters" + File.separator + "Bandit" + File.separator;

    // davis
    public static final String[] DAVIS_PORTRAIT = {davis_url + "davis_f.jpg", davis_url + "davis_s.jpg"};
    public static final String[] DAVIS_STANDING = {davis_url + "davis_standing_0.png", davis_url + "davis_standing_1.png",
            davis_url + "davis_standing_2.png"};
    public static final String[] DAVIS_WALKING = {davis_url + "davis_walking_0.png", davis_url + "davis_walking_1.png",
            davis_url + "davis_walking_2.png", davis_url + "davis_walking_3.png"};
    public static final String[] DAVIS_RUNNING = {davis_url + "davis_running_3.png", davis_url + "davis_running_2.png",
            davis_url + "davis_running_1.png"};
    public static final String[] DAVIS_NORMAL_ATTACK = {davis_url + "davis_normal_attack_7.png",
            davis_url + "davis_normal_attack_8.png", davis_url + "davis_normal_attack_9.png"};
    public static final String[] DAVIS_DEFENDING = {davis_url + "davis_defend.png"};
    public static final String[] DAVIS_JUMPING = {davis_url + "davis_jumping_00.png", davis_url + "davis_jumping_01.png"};
    public static final String[] DAVIS_SHOOTING = {davis_url + "davis_shooting_0.png", davis_url + "davis_shooting_1.png",
            davis_url + "davis_shooting_2.png", davis_url + "davis_shooting_3.png"};
    public static final String[] DAVIS_BALL_FLY = {davis_url + "davis_ball_0.png", davis_url + "davis_ball_1.png",
            davis_url + "davis_ball_2.png", davis_url + "davis_ball_3.png", davis_url + "davis_ball_4.png", davis_url + "davis_ball_5.png"};
    public static final String[] DAVIS_FALLING = {davis_url + "davis_falling_0.png", davis_url + "davis_falling_1.png",
            davis_url + "davis_falling_2.png", davis_url + "davis_falling_3.png", davis_url + "davis_falling_4.png"};
    public static final String[] DAVIS_STUN = {davis_url + "davis_stun_normal_1_behind.png", davis_url + "davis_stun_normal_2_behind.png"};

    // john
    public static final String[] JOHN_PORTRAIT = {john_url + "john_f.jpg", john_url + "john_s.jpg"};
    public static final String[] JOHN_WALKING = {john_url + "john_walking (1).png", john_url + "john_walking (2).png",
            john_url + "john_walking (3).png", john_url + "john_walking (4).png"};
    public static final String[] JOHN_RUNNING = {john_url + "john_running (1).png", john_url + "john_running (2).png",
            john_url + "john_running (3).png"};
    public static final String[] JOHN_STANDING = {john_url + "john_standing (1).png", john_url + "john_standing (2).png",
            john_url + "john_standing (3).png"};
    public static final String[] JOHN_NORMAL_ATTACK = {john_url + "john_normal_attack1 (1).png",
            john_url + "john_normal_attack1 (2).png", john_url + "john_normal_attack1 (3).png",
            john_url + "john_normal_attack1 (4).png"};
    public static final String[] JOHN_DEFENDING = {john_url + "john_defend.png"};
    public static final String[] JOHN_JUMPING = {john_url + "john_jumping (1).png", john_url + "john_jumping (3).png"};
    public static final String[] JOHN_SHOOTING = {john_url + "john_shooting_0.png", john_url + "john_shooting_1.png",
            john_url + "john_shooting_2.png", john_url + "john_shooting_3.png"};
    public static final String[] JOHN_FALLING = {john_url + "john_falling_0.png", john_url + "john_falling_1.png",
            john_url + "john_falling_2.png", john_url + "john_falling_3.png", john_url + "john_falling_4.png"};
    public static final String[] JOHN_BALL_FLY = {john_url + "john_ball_ani1 (1).png", john_url + "john_ball_ani1 (2).png",
            john_url + "john_ball_ani1 (3).png"};
    public static final String[] JOHN_STUN = {john_url + "john_stun_normal_0.png"};


    // dennis
    public static final String[] DENNIS_PORTRAIT = {dennis_url + "dennis_f.jpg", dennis_url + "dennis_s.jpg"};
    public static final String[] DENNIS_WALKING = {dennis_url + "dennis_walking (1).png",
            dennis_url + "dennis_walking (2).png",dennis_url + "dennis_walking (3).png",
            dennis_url + "dennis_walking (4).png"};
    public static final String[] DENNIS_STANDING = {dennis_url + "dennis_standing (1).png",
            dennis_url + "dennis_standing (2).png", dennis_url + "dennis_standing (3).png",
            dennis_url + "dennis_standing (4).png",};
    public static final String[] DENNIS_RUNNING = {dennis_url + "dennis_running (1).png",
            dennis_url + "dennis_running (2).png", dennis_url + "dennis_running (3).png"};
    public static final String[] DENNIS_NORMAL_ATTACK = {dennis_url + "dennis_normal_attack (1).png",
            dennis_url + "dennis_normal_attack (2).png", dennis_url + "dennis_normal_attack (3).png",
            dennis_url + "dennis_normal_attack (4).png", dennis_url + "dennis_normal_attack (5).png",
            dennis_url + "dennis_normal_attack (6).png"};
    public static final String[] DENNIS_DEFENDING = {dennis_url + "dennis_defend.png"};
    public static final String[] DENNIS_JUMPING = {dennis_url + "dennis_jumping (1).png", dennis_url + "dennis_jumping (2).png"};
    public static final String[] DENNIS_SHOOTING = { dennis_url + "dennis_shooting (1).png",
            dennis_url + "dennis_shooting (2).png", dennis_url + "dennis_shooting (3).png",
            dennis_url + "dennis_shooting (4).png"};
    public static final String[] DENNIS_FALLING = {dennis_url + "dennis_falling_0.png", dennis_url + "dennis_falling_1.png",
            dennis_url + "dennis_falling_2.png", dennis_url + "dennis_falling_3.png", dennis_url + "dennis_falling_4.png"};
    public static final String[] DENNIS_BALL_FLY = {dennis_url + "dennis_ball (1).png", dennis_url + "dennis_ball (2).png",
            dennis_url + "dennis_ball (3).png", dennis_url + "dennis_ball (4).png"};
    public static final String[] DENNIS_STUN = {dennis_url + "dennis_stun_normal_1_behind (1).png"};

    // bandit
    public static final String[] BANDIT_PORTRAIT = {bandit_url + "bandit_f.jpg", bandit_url + "bandit_s.jpg"};
    public static final String[] BANDIT_WALKING = {bandit_url + "bandit_walking (1).png",
            bandit_url + "bandit_walking (2).png", bandit_url + "bandit_walking (3).png",
            bandit_url + "bandit_walking (4).png"};
    public static final String[] BANDIT_STANDING = {bandit_url + "bandit_standing (1).png",
            bandit_url + "bandit_standing (2).png", bandit_url + "bandit_standing (3).png"};
    public static final String[] BANDIT_RUNNING = {bandit_url + "bandit_running (1).png",
            bandit_url + "bandit_running (2).png", bandit_url + "bandit_running (3).png"};
    public static final String[] BANDIT_NORMAL_ATTACK = {bandit_url + "bandit_normal_attack (1).png",
            bandit_url + "bandit_normal_attack (2).png", bandit_url + "bandit_normal_attack (3).png",
            bandit_url + "bandit_normal_attack (4).png", bandit_url + "bandit_normal_attack (5).png",
            bandit_url + "bandit_normal_attack (6).png"};
    public static final String[] BANDIT_DEFENDING = {bandit_url + "bandit_defend.png"};
    public static final String[] BANDIT_JUMPING = {bandit_url + "bandit_jumping (1).png",
            bandit_url + "bandit_jumping (2).png", bandit_url + "bandit_jumping (3).png"};
    public static final String[] BANDIT_FALLING = {bandit_url + "bandit_falling_0.png", bandit_url + "bandit_falling_1.png",
            bandit_url + "bandit_falling_2.png", bandit_url + "bandit_falling_3.png", bandit_url + "bandit_falling_4.png"};
    public static final String[] BANDIT_SHOOTING = {bandit_url + "bandit_shooting (1).png",
            bandit_url +  "bandit_shooting (2).png", bandit_url + "bandit_shooting (3).png"};
    public static final String[] BANDIT_STUN = {bandit_url + "bandit_stun_normal_1_behind (1).png"};

    public static String[] getImage(String name, String action) {
        switch (action) {
            case "stand": {
                if (name.equalsIgnoreCase("davis"))
                    return new String[]{davis_url + "davis_standing_0.png", davis_url + "davis_standing_1.png",
                            davis_url + "davis_standing_2.png"};
                else if (name.equalsIgnoreCase("john"))
                    return new String[]{john_url + "john_standing (1).png", john_url + "john_standing (2).png",
                            john_url + "john_standing (3).png"};
                else if (name.equalsIgnoreCase("dennis"))
                    return new String[]{dennis_url + "dennis_standing (1).png",
                            dennis_url + "dennis_standing (2).png", dennis_url + "dennis_standing (3).png",
                            dennis_url + "dennis_standing (4).png"};
                else if (name.equalsIgnoreCase("bandit"))
                    return new String[]{bandit_url + "bandit_standing (1).png",
                            bandit_url + "bandit_standing (2).png", bandit_url + "bandit_standing (3).png"};
                break;
            }
            case "walk": {
                if (name.equalsIgnoreCase("davis"))
                    return new String[]{davis_url + "davis_walking_0.png", davis_url + "davis_walking_1.png",
                            davis_url + "davis_walking_2.png", davis_url + "davis_walking_3.png"};
                else if (name.equalsIgnoreCase("john"))
                    return new String[]{john_url + "john_walking (1).png", john_url + "john_walking (2).png",
                            john_url + "john_walking (3).png", john_url + "john_walking (4).png"};
                else if (name.equalsIgnoreCase("dennis"))
                    return new String[]{dennis_url + "dennis_walking (1).png",
                            dennis_url + "dennis_walking (2).png", dennis_url + "dennis_walking (3).png",
                            dennis_url + "dennis_walking (4).png"};
                else if (name.equalsIgnoreCase("bandit"))
                    return new String[]{bandit_url + "bandit_walking (1).png",
                            bandit_url + "bandit_walking (2).png", bandit_url + "bandit_walking (3).png",
                            bandit_url + "bandit_walking (4).png"};
                break;
            }
            case "run": {
                if (name.equalsIgnoreCase("davis"))
                    return new String[]{davis_url + "davis_running_3.png", davis_url + "davis_running_2.png",
                            davis_url + "davis_running_1.png"};
                else if (name.equalsIgnoreCase("john"))
                    return new String[]{john_url + "john_running (1).png", john_url + "john_running (2).png",
                            john_url + "john_running (3).png"};
                else if (name.equalsIgnoreCase("dennis"))
                    return new String[]{dennis_url + "dennis_running (1).png",
                            dennis_url + "dennis_running (2).png", dennis_url + "dennis_running (3).png"};
                else if (name.equalsIgnoreCase("bandit"))
                    return new String[]{bandit_url + "bandit_running (1).png",
                            bandit_url + "bandit_running (2).png", bandit_url + "bandit_running (3).png"};
                break;
            }
            case "attack": {
                if (name.equalsIgnoreCase("davis"))
                    return new String[]{davis_url + "davis_normal_attack_7.png",
                            davis_url + "davis_normal_attack_8.png", davis_url + "davis_normal_attack_9.png"};
                else if (name.equalsIgnoreCase("john"))
                    return new String[]{john_url + "john_normal_attack1 (1).png",
                            john_url + "john_normal_attack1 (2).png", john_url + "john_normal_attack1 (3).png",
                            john_url + "john_normal_attack1 (4).png"};
                else if (name.equalsIgnoreCase("dennis"))
                    return new String[]{dennis_url + "dennis_normal_attack (1).png",
                            dennis_url + "dennis_normal_attack (2).png", dennis_url + "dennis_normal_attack (3).png",
                            dennis_url + "dennis_normal_attack (4).png", dennis_url + "dennis_normal_attack (5).png",
                            dennis_url + "dennis_normal_attack (6).png"};
                else if (name.equalsIgnoreCase("bandit"))
                    return new String[]{bandit_url + "bandit_normal_attack (1).png",
                            bandit_url + "bandit_normal_attack (2).png", bandit_url + "bandit_normal_attack (3).png",
                            bandit_url + "bandit_normal_attack (4).png", bandit_url + "bandit_normal_attack (5).png",
                            bandit_url + "bandit_normal_attack (6).png"};
                break;
            }
            case "defend": {
                if (name.equalsIgnoreCase("davis"))
                    return new String[]{davis_url + "davis_defend.png"};
                else if (name.equalsIgnoreCase("john"))
                    return new String[]{john_url + "john_defend.png"};
                else if (name.equalsIgnoreCase("dennis"))
                    return new String[]{dennis_url + "dennis_defend.png"};
                else if (name.equalsIgnoreCase("bandit"))
                    return new String[]{bandit_url + "bandit_defend.png"};
                break;
            }
            case "jump": {
                if (name.equalsIgnoreCase("davis"))
                    return new String[]{davis_url + "davis_jumping_00.png", davis_url + "davis_jumping_01.png"};
                else if (name.equalsIgnoreCase("john"))
                    return new String[]{john_url + "john_jumping (1).png", john_url + "john_jumping (3).png"};
                else if (name.equalsIgnoreCase("dennis"))
                    return new String[]{dennis_url + "dennis_jumping (1).png", dennis_url + "dennis_jumping (2).png"};
                else if (name.equalsIgnoreCase("bandit"))
                    return new String[]{bandit_url + "bandit_jumping (1).png",
                            bandit_url + "bandit_jumping (2).png", bandit_url + "bandit_jumping (3).png"};
                break;
            }
            case "skill": {
                if (name.equalsIgnoreCase("davis"))
                    return new String[]{davis_url + "davis_shooting_0.png", davis_url + "davis_shooting_1.png",
                            davis_url + "davis_shooting_2.png", davis_url + "davis_shooting_3.png"};
                else if (name.equalsIgnoreCase("john"))
                    return new String[]{john_url + "john_shooting_0.png", john_url + "john_shooting_1.png",
                            john_url + "john_shooting_2.png", john_url + "john_shooting_3.png"};
                else if (name.equalsIgnoreCase("dennis"))
                    return new String[]{dennis_url + "dennis_shooting (1).png",
                            dennis_url + "dennis_shooting (2).png", dennis_url + "dennis_shooting (3).png",
                            dennis_url + "dennis_shooting (4).png"};
                else if (name.equalsIgnoreCase("bandit"))
                    return new String[]{bandit_url + "bandit_shooting (1).png",
                            bandit_url + "bandit_shooting (2).png", bandit_url + "bandit_shooting (3).png"};
                break;
            }
            case "ball": {
                if (name.equalsIgnoreCase("davis"))
                    return new String[]{davis_url + "davis_ball_0.png", davis_url + "davis_ball_1.png",
                            davis_url + "davis_ball_2.png", davis_url + "davis_ball_3.png", davis_url + "davis_ball_4.png", davis_url + "davis_ball_5.png"};
                else if (name.equalsIgnoreCase("john"))
                    return new String[]{john_url + "john_ball_ani1 (1).png", john_url + "john_ball_ani1 (2).png",
                            john_url + "john_ball_ani1 (3).png"};
                else if (name.equalsIgnoreCase("dennis"))
                    return new String[]{dennis_url + "dennis_ball (1).png", dennis_url + "dennis_ball (2).png",
                            dennis_url + "dennis_ball (3).png", dennis_url + "dennis_ball (4).png"};
                break;
            }
            case "fall": {
                if (name.equalsIgnoreCase("davis"))
                    return new String[]{davis_url + "davis_falling_0.png", davis_url + "davis_falling_1.png",
                            davis_url + "davis_falling_2.png", davis_url + "davis_falling_3.png", davis_url + "davis_falling_4.png"};
                else if (name.equalsIgnoreCase("john"))
                    return new String[]{john_url + "john_falling_0.png", john_url + "john_falling_1.png",
                            john_url + "john_falling_2.png", john_url + "john_falling_3.png", john_url + "john_falling_4.png"};
                else if (name.equalsIgnoreCase("dennis"))
                    return new String[]{dennis_url + "dennis_falling_0.png", dennis_url + "dennis_falling_1.png",
                            dennis_url + "dennis_falling_2.png", dennis_url + "dennis_falling_3.png", dennis_url + "dennis_falling_4.png"};
                else if (name.equalsIgnoreCase("bandit"))
                    return new String[]{bandit_url + "bandit_falling_0.png", bandit_url + "bandit_falling_1.png",
                            bandit_url + "bandit_falling_2.png", bandit_url + "bandit_falling_3.png", bandit_url + "bandit_falling_4.png"};
                break;
            }
        }
        return null;
    }
}
