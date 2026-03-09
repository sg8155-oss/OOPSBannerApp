import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Method to build the character pattern map
    public static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };

        map.put('O', O);
        map.put('P', P);
        map.put('S', S);

        return map;
    }

    // Method to display banner message
    public static void renderBanner(String message, Map<Character, String[]> map) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // Main method
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatternMap();

        String message = "OOPS";

        renderBanner(message, patternMap);
    }
}