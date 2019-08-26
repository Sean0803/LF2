package GameObject;

import GUI.HMBar;

import java.util.ArrayList;

public class HMBarList {
    private static HMBarList instance;
    private static ArrayList<HMBar> hmBarList = new ArrayList<HMBar>();

    public static HMBarList getInstance() {
        if (instance == null) {
            instance = new HMBarList();
        }
        return instance;
    }

    public static void add(HMBar hmBar) {
        hmBarList.add(hmBar);
    }

    public static void remove(HMBar hmBar) {
        hmBarList.remove(hmBar);
    }

    public static void resetList() {
        hmBarList = new ArrayList<HMBar>();
    }

    public static void initHMBarList() {
        resetList();
        for (int x = 0; x < PlayerList.getPlayerNumber(); x++) {
            hmBarList.add(new HMBar(PlayerList.getPlayerList().get(x)));
        }
    }

    public static ArrayList<HMBar> getHmBarList() {
        return hmBarList;
    }
}
