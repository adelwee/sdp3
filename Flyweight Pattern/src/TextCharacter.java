public class TextCharacter {
    private Character character;
    private int x, y;

    public TextCharacter(Character character, int x, int y) {
        this.character = character;
        this.x = x;
        this.y = y;
    }

    public void display() {
        character.display(x, y);
    }
}
