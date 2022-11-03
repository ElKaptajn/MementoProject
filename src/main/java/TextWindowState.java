public class TextWindowState {

    /**
     * Memento class
     */

    private String text;

    public TextWindowState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
