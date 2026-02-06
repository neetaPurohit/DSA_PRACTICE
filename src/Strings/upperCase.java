package Strings;

public class upperCase {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

//        for other letter to capital
        for (int i=1; i<str.length(); i++){
            if (str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
//              after space, letter will be upper case
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        //make sb into string
        return sb.toString();
    }
    static void main(String[] args) {
        String str = "hi , i am nikki";
        System.out.println(toUpperCase(str));
    }
}
