import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private CharacterFactory characterFactory = new CharacterFactory();
    private List<Character> characters = new ArrayList<>();

    public void insertText(char value, String font, int size, int x, int y) {
        Character character = characterFactory.getCharacter(value, font, size);
        character.display(x, y);
        characters.add(character);
    }

    public void renderDocument() {
        for (Character character : characters) {
            character.display(0, 0);
        }
    }
}
