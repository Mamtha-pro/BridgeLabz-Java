package coreprogramming.string.level1;

public class CharFreq {
    public static void main(String[] args) {
        String s = "programming";
        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == i) {
                System.out.print(ch);
            }


        }
    }
}

