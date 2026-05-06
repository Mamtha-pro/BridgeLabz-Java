package coreprogramming.string.level1;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silen";
        int count =0;
        for(int i= 0;i <= word1.length()-1;i++){
            for(int j =0 ; j <= word2.length()-1;j++){
                if(word1.length()!= word2.length()){
                    break;

                } else if(word1.charAt(i) == word2.charAt(j)){
                    count++;

                }
            }
        }
        if(word1.length()==count){
            System.out.println("The given String is Anagram");
        }
        else{
            System.out.println("The given String is not Anagram");
        }
    }
}
