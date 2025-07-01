package linear_Search;

public class searching_char_in_String {
    public static void main(String[] args) {
        String name="Ayush";
        char target='A';
        System.out.println(search(name,target));
    }
    public static boolean search(String s,char target){
        if(s.length()==0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==target){
                return true;
            }
        }
        return false;
    }


}
