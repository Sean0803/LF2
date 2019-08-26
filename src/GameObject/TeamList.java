package GameObject;

import java.util.ArrayList;

import Character.Player;

public class TeamList {
    private static TeamList instance;
    private static ArrayList<Integer> teamList = new ArrayList<Integer>();

    public static TeamList getInstance() {
        if (instance == null) {
            instance = new TeamList();
        }
        return instance;
    }

    public static void add(Integer integer) {
        teamList.add(integer);
    }

    public static void remove(Integer integer) {
        teamList.remove(integer);
    }

    public static ArrayList<Integer> getTeamList() {
        return teamList;
    }

    public static void resetList() {
        teamList = new ArrayList<Integer>();
    }

    public static String teamColor(Player player) {
        if (player.getTeam() == 1) {
            return "#ffffff";
        } else if (player.getTeam() == 2) {
            return "#db1515";
        } else if (player.getTeam() == 3) {
            return "#2409b8";
        } else if (player.getTeam() == 4) {
            return "#646709";
        } else {
            return "#09b74a";
        }
    }
}
