public class Character {
    private char value;
    private String font;
    private int size;

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    public void display(int x, int y) {
        System.out.println("Displaying " + value + " at (" + x + ", " + y + ") with font " + font + " and size " + size);
    }
}
