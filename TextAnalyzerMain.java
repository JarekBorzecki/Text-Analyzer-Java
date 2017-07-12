package Practice_6;

/**
 * Created by jarek on 12.07.2017.
 */
public class TextAnalyzerMain {
    public static void main(String[] args) {

        String text = "Ala ma kota, a kot ma Alę. Ala go lubi, a kot ją wcale.";
        TextAnalyzer analyze = new TextAnalyzer(text);
        System.out.println("Char Count: " + analyze.charCount());
        System.out.println("Upper Case Count: "+ analyze.upperCaseCount());
        System.out.println("Whitespace Count: "+ analyze.whitespaceCount());
        System.out.println("Digit Count: "+ analyze.digitCount());

        char oneLetter = 'a';
        if (analyze.containsChar(oneLetter)) {
            System.out.println("The text contains char " + "\'" + oneLetter + "\'");
        }

        String smallPart = "koty";
        if (analyze.containsString(smallPart)) {
            System.out.println("The text contains substring " +  "\"" + smallPart + "\"");
        }
    }
}
