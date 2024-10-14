public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.insertText('H', "Arial", 12, 0, 0);
        editor.insertText('e', "Arial", 12, 10, 0);
        editor.insertText('l', "Arial", 12, 20, 0);
        editor.insertText('l', "Arial", 12, 30, 0);
        editor.insertText('o', "Arial", 12, 40, 0);

        editor.insertText('W', "Arial", 14, 0, 20);
        editor.insertText('o', "Arial", 14, 10, 20);
        editor.insertText('r', "Arial", 14, 20, 20);
        editor.insertText('l', "Arial", 14, 30, 20);
        editor.insertText('d', "Arial", 14, 40, 20);

        editor.renderDocument();
    }
}
