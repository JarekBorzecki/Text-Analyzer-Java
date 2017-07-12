package Practice_6;

/**
 * Created by jarek on 05.07.2017.
 */
public class TextAnalyzer {
    private String message;
    private int charCounter = 0;
    private int whiteSpaceCounter = 0;
    private int bigLetter = 0;
    private int digitCounter = 0;

    public TextAnalyzer(String text) {
        this.message = text;
    }

    public int charCount() {
        return this.message.length();
    }

    public int upperCaseCount() {
        for (int i = 0; i < this.message.length(); i++) {
            char sign = this.message.charAt(i);

            if (Character.isUpperCase(sign)) {
                bigLetter++;
            }
        }
        return bigLetter;
    }

    public int whitespaceCount() {
        for (int i = 0; i < this.message.length(); i++) {
            char sign = this.message.charAt(i);

            if (Character.isWhitespace(sign)) {
                whiteSpaceCounter++;
            }
        }
        return whiteSpaceCounter;
    }

    public int digitCount() {
        for (int i = 0; i < this.message.length(); i++) {
            char sign = this.message.charAt(i);

            if (Character.isDigit(sign)) {
                digitCounter++;
            }
        }
        return digitCounter;
    }

    public boolean containsChar(char letter) {
        for (int i = 0; i < this.message.length(); i++) {
            char sign = this.message.charAt(i);

            if (sign == letter) {
                return true;
            }
        }
        return false;
    }

    public boolean containsString(String fragment) {
        int number = this.message.indexOf(fragment);

        if (number >= 0) {
            return true;
        }
        return false;
    }
}
