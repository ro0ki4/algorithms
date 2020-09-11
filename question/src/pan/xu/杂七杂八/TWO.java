/*
package pan.xu;

import java.util.ArrayList;
import java.util.HashSet;

public class TWO {
    public static void main(String[] args) {

    }
    public static int fuck(String s){
        int length=s.length();
        char[] letter=s.toCharArray();
        HashSet<Character> some=new HashSet<>();
        int i=0,j=0,flag=0;
        while(i<length&&j<length){
            if(!some.contains(letter[j])){
                some.add(letter[j++]);
            }
            else {
                some.remove(letter[i++]);
            }
            flag=Math.max(flag,j-i);
        }
           return flag;
    }
}
*/