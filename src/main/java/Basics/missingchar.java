package Basics;

public class missingchar {
    public static void main(String[] args) {
        System.out.println(findTheDifference("ayush","ayushh"));

    }
    public static char findTheDifference(String s, String t) {
        char result = 0;
        for(int i=0;i<t.length();i++){
            for (int j = 0; j < s.length(); j++) {
                char a=s.charAt(j);
                char b=t.charAt(i);
                result= (char) (a^b);
            }

        }
        return result;

    }
}
