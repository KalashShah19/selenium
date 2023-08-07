/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Arrays;

/**
 *
 * @author hadoop
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public int count(String a){
        int count = a.length();
        return count;
    }
    
    public String concatinate(String[] s){
        String str = "";
        for (int i = 0; i < s.length; i++) {
            if(!str.contains(s[i])){
                str = str.concat(s[i]);
            }
        }
        System.out.println(str);
        return str;
    }
}
