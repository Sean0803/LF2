package GameObject;

import javafx.scene.input.KeyCode;

import java.util.ArrayList;
import java.util.TreeSet;

public class KeyCodeSet {
    private static KeyCodeSet instance;
    private static TreeSet<KeyCode> keySet = new TreeSet<KeyCode>();

    public static KeyCodeSet getInstance() {
        if (instance == null) {
            instance = new KeyCodeSet();
        }
        return instance;
    }

    public static void add(KeyCode keyCode) {
        keySet.add(keyCode);
    }

    public static void remove(KeyCode keyCode) {
        keySet.remove(keyCode);
    }

    public static TreeSet<KeyCode> getKeySet() {
        return keySet;
    }

    public static void reset() {
        keySet = new TreeSet<KeyCode>();
    }
}
