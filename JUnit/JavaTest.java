/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author hadoop
 */
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public int add(int a, int b){
        return a+b;
    }
    
    public int multiply(int a, int b, int c){
        return a*b*c;
    }
    
    public boolean compareStr(String a, String b){
        boolean flag = false;
        if(a.equals(b)){
            flag = true;
        }
        return flag;
    }
    
    public boolean lenCheck(String a, String b){
        boolean flag = false;
        int aLen = a.length();
        int bLen = b.length();
        if(a.equals(b)){
            flag = true;
        }
        return flag;
    }
    
}
