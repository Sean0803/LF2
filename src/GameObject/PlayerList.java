package GameObject;

import Character.Player;

import java.util.ArrayList;

public class PlayerList {
    private static PlayerList instance;
    private static ArrayList<Player> playerList = new ArrayList<Player>();

    public static PlayerList getInstance() {
        if (instance == null) {
            instance = new PlayerList();
        }
        return instance;
    }

    public static void initPlayerList() {
        reset();
        for (int x = 0; x < CharacterList.getCharacterList().size(); x++) {
            if (x == 0) {
                playerList.add(new Player("1", 0, CharacterList.getCharacterList().get(0), TeamList.getTeamList().get(0)));
            } else {
                playerList.add(new Player("Computer", x, CharacterList.getCharacterList().get(x), TeamList.getTeamList().get(x)));
            }
        }
    }

    public static int getPlayerNumber() {
        int count = playerList.size();
        return count;
    }

    public static ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public static void reset() {
        playerList = new ArrayList<Player>();
    }
}
