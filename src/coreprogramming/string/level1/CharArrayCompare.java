package coreprogramming.string.level1;

public class CharArrayCompare {
    public static void main (String[] args){
        String name = "Mamatha Rai";
        char []arr=new char[name.length()];
        for(int i =0; i<name.length();i++){
            arr[i] = name.charAt(i);

        }
        char []arr2 = name.toCharArray();


        for(int i =0;i<arr.length;i++){
            if(arr.length != arr2.length){
                System.out.print("false");
            }
                else if(arr[i] != arr2[i]){
                System.out.print("false");
            }else{
                System.out.print("true");
            }
        }

    }
}
