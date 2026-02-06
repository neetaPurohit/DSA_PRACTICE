package Strings;

public class StrBuilder {
    static void main(String[] args) {
         StringBuilder sb = new StringBuilder("Hi, ");
         for (char ch = 'a'; ch<='z'; ch++){
             sb.append(ch);
         }
        System.out.println(sb);
    }
}
