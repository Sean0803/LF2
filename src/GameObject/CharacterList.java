package GameObject;

import Character.Character;

import java.util.ArrayList;

public class CharacterList {
    private static CharacterList instance;
    private static ArrayList<Character> characterList = new ArrayList<Character>();

    public static Character[] characters = new Character[] {
            new Character("Davis"),
            new Character("John"),
            new Character("Dennis"),
            new Character("Bandit")
    };

    public static CharacterList getInstance() {
        if (instance == null) {
            instance = new CharacterList();
        }
        return instance;
    }

    public static void add(Character character) {
        characterList.add(character);
    }

    public static void remove(Character character) {
        characterList.remove(character);
    }

    public static ArrayList<Character> getCharacterList() {
        return characterList;
    }

    public static void resetList() {
        characterList = new ArrayList<Character>();
    }
}
