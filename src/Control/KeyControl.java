package Control;

import javafx.scene.input.KeyCode;

public enum KeyControl {

    UP(KeyCode.W),
    DOWN(KeyCode.S),
    LEFT(KeyCode.A),
    RIGHT(KeyCode.D),
    ATTACK(KeyCode.J),
    JUMP(KeyCode.K),
    DEFEND(KeyCode.L);

    private KeyCode code;

    private KeyControl(KeyCode code) {
        this.code = code;
    }

    public static boolean isFind(KeyCode code) {
        for (KeyControl c : values()) {
            if (c.code != null && c.code == code) {
                return true;
            }
        }
        return false;
    }

    public KeyCode getCode() {
        return code;
    }

    public void setCode(KeyCode code) {
        this.code = code;
    }

}
