package GameObject;

import Skill.Skill;

import java.util.ArrayList;

public class SkillList {
    private static SkillList instance;
    private static ArrayList<Skill> skillList = new ArrayList<Skill>();

    public static SkillList getInstance() {
        if (instance == null) {
            instance = new SkillList();
        }
        return instance;
    }

    public static void add(Skill skill) {
        skillList.add(skill);
    }

    public static void remove(Skill skill) {
        skillList.remove(skill);
    }

    public static ArrayList<Skill> getSkillList() {
        return skillList;
    }

    public static void resetList() {
        skillList = new ArrayList<Skill>();
    }
}
