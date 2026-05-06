package coreprogramming.string.level1;

public class CountVowels {
    public static void main(String[] args) {
        String word = "Apple and Mango";
        int constant = 0;
        int vowels = 0;
        String word2 = word.toLowerCase();


        for(int i =0;i<=word.length()-1;i++){

            char ch = word2.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch == 'i'||ch == 'o'|| ch == 'u' ) {
                vowels++;
            }
            else if(ch == ' ') {
                continue;
            }else {
                constant++;
            }
        }
        System.out.println("vowels is : " + vowels );
        System.out.println("constant is : " + constant );
    }
}
