package coreprogramming.string.level1;

public class Palindrom {
    public static void main(String[] args) {
        String name = "mmm";
         String rev ="";

        for(int i = name.length()-1;i>=0;i--){
            rev = rev + name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println("Given string is palindrom");
        }else{
            System.out.println("Given string is not palindrom");
        }
    }
}
