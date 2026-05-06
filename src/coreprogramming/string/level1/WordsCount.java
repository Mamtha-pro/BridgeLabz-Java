package coreprogramming.string.level1;

public class WordsCount {
    public static void main(String[] args) {
        String name = "Hello world";
        int count = 0;
        for(int i = 0;i<=name.length()-1;i++){
            if(name.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("The word count is : "+count);
    }
}
